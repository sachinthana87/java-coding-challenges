package com.challages;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTheMinimumTime {
    public static void main(String[] args) {
        System.out.println(minTime(1, 4, 1000));
    }

//    public static int minTime(int S1, int S2, int N) {
//        int[] arrayS1 = IntStream.range(1, N).map(x -> x * S1).toArray();
//        int[] arrayS2 = IntStream.range(1, N).map(y -> y * S2).toArray();
//        int [] mergedArray = IntStream.concat(Arrays.stream(arrayS1), Arrays.stream(arrayS2)).toArray();
//        int [] sortedArray = Arrays.stream(mergedArray).sorted().toArray();
//        return sortedArray[N - 1];
//    }

//    public static int minTime(int S1, int S2, int N) {
//        int[] arrayS1 = new int[N];
//        int[] arrayS2 = new int[N];
//        int[] mergedArray = new int[2 * N];
//
//        int s1Index = 0;
//        int s2Index = 0;
//        for (int i = 0; i < N; i++) {
//            arrayS1[i] = S1 * (i + 1);
//            arrayS2[i] = S2 * (i + 1);
//
//            if(arrayS1[s1Index] < arrayS2[s2Index]) {
//                mergedArray[i] = arrayS1[s1Index];
//                s1Index++;
//            }else if(arrayS1[s1Index] > arrayS2[s2Index]) {
//                mergedArray[i] = arrayS2[s2Index];
//                s2Index++;
//            } else {
//                if(s1Index < N) {
//                    mergedArray[i] = arrayS1[s1Index];
//                    s1Index++;
//                }else if (s2Index < N){
//                    mergedArray[i] = arrayS2[s2Index];
//                    s2Index++;
//                }
//            }
//        }
//
//        return mergedArray[N - 1];
//    }

    static int minTime(int S1, int S2, int N)
    {
        int a=N*S1;
        int b=N*S2;
        int sum=Integer.MAX_VALUE;
        for(int i=1;i<N;i++){
            int temp= Math.max(i*S1,S2*(N-i));
            if(temp<sum)
                sum=temp;
        }
        int c=Math.min(a,b);
        return Math.min(c,sum);
    }
}
