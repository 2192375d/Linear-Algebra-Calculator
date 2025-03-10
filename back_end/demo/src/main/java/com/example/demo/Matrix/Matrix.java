package com.example.demo.Matrix;


public class Matrix {
    //can use Arrays.asList() to convert into ArrayList later
    private double[][] matrix;
    private int row; 
    private int col;

    public Matrix(){        
    }

    public Matrix(int row, int col){
        this.row=row;
        this.col=col;
    
        matrix=new double[row][col];
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
    public void set_value(double[][] arr){
        if(arr.length==row && arr[0].length==col){
            //pointing to the same 2dArr, change one = change both
            matrix=arr;
        }else{
            return;
        }
    }

    public double[][] getMatrix(){
        return matrix;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public void matrix_addition(Matrix m2){
        /*
         * Add matrix m2 to self. Print "SIZE DOESN'T MATCH" if m2 has different row and col. 
         */
        if(row==m2.getRow() && col==m2.getCol() ){
            System.out.print("SIZE DOESN'T MATCH");
        }
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                matrix[r][c]=matrix[r][c]+m2.matrix[r][c];
            }
        }
    }

    public void scalar_multiplication(float s){
        /*
         * multiply the matrix by scalar s. 
         */
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                matrix[r][c]*=s;
            }
        }
    }

    public boolean is_square(){
        return row==col;
    }
}
