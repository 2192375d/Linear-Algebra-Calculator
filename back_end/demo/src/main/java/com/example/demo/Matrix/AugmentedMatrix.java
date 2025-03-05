package com.example.demo.Matrix;

public class AugmentedMatrix extends Matrix{
    private int[] vector;
    public AugmentedMatrix(int row, int col, int v_mag){
        super(row, col);
        vector=new int[v_mag];
    }


}
