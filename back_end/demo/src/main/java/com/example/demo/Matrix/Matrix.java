package com.example.demo.Matrix;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Matrix {
    //can use Arrays.asList() to convert into ArrayList later
    private int[][] matrix;
    private int row; 
    private int col;

    public Matrix(){        
    }

    public Matrix(int row, int col){
        this.row=row;
        this.col=col;
    
        matrix=new int[row][col];
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                matrix[r][c]=-1;
            }
        }
    }
    
    //set the value of a specific entry of a matrix
    public void set_value(int value, int ri, int ci){
        if(ri>=0 && ri<=row-1 && ci>=0 && ci<=col-1){
            matrix[ri][ci]=value;
        }else{
            return;
        }
    }

    //set the whole matrix
    public void set_value(int[][] arr){
        if(arr.length==row && arr[0].length==col){
            //pointing to the same 2dArr, change one = change both
            matrix=arr;
        }else{
            return;
        }
    }

    public int[][] getMatrix(){
        return matrix;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
}
