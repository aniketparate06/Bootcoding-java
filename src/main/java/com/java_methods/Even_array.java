package com.java_methods;

public class Even_array {
    public static void main(String[] args) {
        int ar1[] = {1, 2, 3, 4, 10, 12,15,18};
        int ar2[] = {5, 6, 7, 8,15,14,12};
        int arr[] = getEvenArray(ar1, ar2);
    }
    public static int[] getEvenArray(int arr1[], int arr2[]) {
        System.out.println("Array 1 Even Number");
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]%2==0){
                    System.out.println(arr1[i]);
                }
            }
        System.out.println("Array 2 Even Number");
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i]%2==0){
                    System.out.println(arr2[i]);
            }
        }return arr1;
    }
}

