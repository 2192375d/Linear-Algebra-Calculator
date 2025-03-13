package com.example.demo.Matrix;

public class Matrix {

    //can use Arrays.asList() to convert into ArrayList later
    protected double[][] matrix;
    protected int row;
    protected int col;

    public Matrix() {
    }

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        matrix = new double[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                matrix[r][c] = -1;
            }
        }
    }

    //set the value of a specific entry of a matrix
    public void set_value(double value, int ri, int ci) {
        if (ri >= 0 && ri <= row - 1 && ci >= 0 && ci <= col - 1) {
            matrix[ri][ci] = value;
        } else {
            return;
        }
    }

    //set the whole matrix
    public void set_value(double[][] arr) {
        if (arr.length == row && arr[0].length == col) {
            //pointing to the same 2dArr, change one = change both
            matrix = arr;
        } else {
            return;
        }
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void matrix_addition(Matrix m2) {
        /*
         * Add matrix m2 to self. Print "SIZE DOESN'T MATCH" if m2 has different row and col. 
         */
        if (row == m2.getRow() && col == m2.getCol()) {
            System.out.print("SIZE DOESN'T MATCH");
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                matrix[r][c] = matrix[r][c] + m2.matrix[r][c];
            }
        }
    }

    public void scalar_multiplication(float s) {
        /*
         * multiply the matrix by scalar s. 
         */
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                matrix[r][c] *= s;
            }
        }
    }

    public boolean is_square() {
        return row == col;
    }

    public Matrix build_submatrix(int remove_r, int remove_c) {
        Matrix m2 = new Matrix(row-1, col-1);
        //var: m2_r, m2_c
        int m2_r=0;
        int m2_c=0;
        //traverse through m by row;
        for(int r=0; r<row; r++){
            //if r==remove_r: continue
            if(r==remove_r){
                continue;
            }
            //traverse through each col in row;
            for(int c=0; c<col; c++){
                //if c==remove_c: continue
                if(c==remove_c){
                    continue;
                }
                m2.matrix[m2_r][m2_c]=matrix[r][c];
                m2_c+=1;
            }
            m2_r+=1;
            m2_c=0;
        }

        return m2;
    }
}
