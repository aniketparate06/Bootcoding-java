package com.pattern;

public class Right_angle_triangle_number_increased {
    public static void main(String[] args) {
        int a=1;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
