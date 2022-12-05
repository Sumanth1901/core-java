package com;

public class TwoDarray {

	public static void main(String[] args)
    {
 
        int[][] arr = { { 1, 2 }, { 3, 4 },{6,8} };
 
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                                + arr[i][j]);
    }
}