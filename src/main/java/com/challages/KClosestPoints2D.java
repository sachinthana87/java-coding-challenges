package com.challages;

import java.sql.Array;
import java.text.MessageFormat;
import java.util.*;

public class KClosestPoints2D {
    public static void main(String[] args) {
        int[][] points = {{3,3}, {5, -1}, {-2, 4}};
        int K = 2;
        int[][] result = kClosest(points, K);
        for(int[] element: result) {
            System.out.println("[" + element[0] + ", " + element[1] + "]");
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        List<int[]> result = new ArrayList<>();
        int[] distance = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0], y = points[i][1];
            distance[i] = x * x + y * y;
        }

        Arrays.sort(distance);

        int distK = distance[k - 1];

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0], y = points[i][1];
            int dist = x * x + y * y;
            if(dist <= distK) {
                result.add(points[i]);
            }
        }

        if(!result.isEmpty()) return result.toArray(new int[0][]);
        return null;
    }
}
