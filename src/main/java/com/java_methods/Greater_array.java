package com.java_methods;
public class Greater_array {
    public static void main(String[] args) {
        int ar1[] = {1, 2, 3, 4, 5, 6};
        int ar2[] = {1, 2, 3, 4, 5, 6, 7};
        int arr[] = greaterArray(ar1, ar2);
    }
    public static int[] greaterArray(int[] arr1, int[] arr2) {
                if (arr1.length > arr2.length) {
                    System.out.println("arr1 is greater");
                } else {
                    System.out.println("arr2 is greater");
                }
        return arr2;
    }
}
