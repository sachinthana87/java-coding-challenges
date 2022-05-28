package com.interviews.booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchHotelsByCityDistance {
    static int haversineIteration = 0;

    public static void main(String[] args) {
        City city = City.builder().setCityCentreLatitude(52.368780).setCityCentreLongitude(4.903303).setName("Amsterdam").setId(1L).build();
        Hotel hotel1 = Hotel.builder().setLatitude(52.364799).setLongitude(4.908971).setId(1L).setCity(city).build();
        Hotel hotel2 = Hotel.builder().setLatitude(52.3681563).setLongitude(4.9010029).setId(2L).setCity(city).build();
        Hotel hotel3 = Hotel.builder().setLatitude(52.379577).setLongitude(4.633547).setId(3L).setCity(city).build();
        Hotel hotel4 = Hotel.builder().setLatitude(52.3756755).setLongitude(4.8668628).setId(4L).setCity(city).build();
        Hotel hotel5 = Hotel.builder().setLatitude(52.380936).setLongitude(4.8708297).setId(5L).setCity(city).build();
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
        hotels.add(hotel4);
        hotels.add(hotel5);
        List<Hotel> results = kClosest(hotels, 3, city);
        results.forEach(item -> System.out.println(item.getId()));
        System.out.println("haversine: " + haversineIteration);
    }

    private static double haversine(double lat1, double lon1,
                                    double lat2, double lon2) {
        // distances between latitudes and longitudes
        double distLat = Math.toRadians(lat2 - lat1);
        double distLon = Math.toRadians(lon2 - lon1);

        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // apply the haversine formulae to get the distance over the surface of the sphere
        double a = Math.pow(Math.sin(distLat / 2), 2) +
                Math.pow(Math.sin(distLon / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return rad * c;
    }


    public static List<Hotel> kClosest(List<Hotel> hotels, int k, City city) {
        int length = hotels.size(), left = 0, right = length - 1;
        while (left < right) {
            int middle = partition(hotels, left, right, city);
            if (middle == k) break;
            if (middle > k) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return hotels.subList(0, k);
    }

    private static int partition(List<Hotel> hotels, int low, int high, City city) {
        Hotel hotelPivot = hotels.get(high);

        for (int j = low; j < high; j++) {
            if (compare(hotels.get(j), hotelPivot, city) < 0) {
                Collections.swap(hotels, low, j);
                low++;
            }
        }
        Collections.swap(hotels, low, high);
        return low;
    }

    private static double compare(Hotel hotelA, Hotel hotelB, City city) {
        return haversine(hotelA.getLatitude(), hotelA.getLongitude(), city.getCityCentreLatitude(),
                city.getCityCentreLongitude()) - haversine(hotelB.getLatitude(), hotelB.getLongitude(),
                city.getCityCentreLatitude(), city.getCityCentreLongitude());
    }

//    public static List<Hotel> kClosest(List<Hotel> hotels, int k, City city) {
//        List<Hotel> result = new ArrayList<>();
//        double[] distance = new double[hotels.size()];
//        for (int i = 0; i < hotels.size(); i++) {
//            distance[i] = haversine(hotels.get(i).getLatitude(), hotels.get(i).getLongitude(), city.getCityCentreLatitude(), city.getCityCentreLongitude());
//        }
//
//        Arrays.sort(distance);
//        double distK = distance[k - 1];
//
//        for (int i = 0; i < hotels.size(); i++) {
//            double dist = haversine(hotels.get(i).getLatitude(), hotels.get(i).getLongitude(), city.getCityCentreLatitude(), city.getCityCentreLongitude());
//            if(dist <= distK) {
//                result.add(hotels.get(i));
//            }
//        }
//
//        return result;
//    }
}
