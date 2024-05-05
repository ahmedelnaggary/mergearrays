package com.company;

public class Main {

    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m-1;
        int j = n - 1;
        int k = m + n - 1;
        int count =0;


     for(;i<k;i++)
     {
        A[i+1] = B[count];
        count++;
     }
    }
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 0, 0, 0,0};
        int[] B = {2, 4, 6,8};
        int m = 3; // Length of array A
        int n = 4; // Length of array B

        merge(A, m, B, n);

        System.out.println("Merged Array A:");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }

}
