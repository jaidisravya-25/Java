package com.tnsif.jaggedarray;

public class jaggedArray {
    public static void main(String[] args) {
        
    	int arr[][] = new int[3][];

        arr[0] = new int[4]; 
        arr[1] = new int[3]; 
        arr[2] = new int[2];

        ///Assign values
        arr[0] = new int[] {2, 3, 4, 5};
        arr[1] = new int[] {6, 7, 8};
        arr[2] = new int[] {9, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}