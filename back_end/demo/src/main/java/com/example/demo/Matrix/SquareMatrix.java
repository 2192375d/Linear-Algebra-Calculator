package com.example.demo.Matrix;

public class SquareMatrix extends Matrix{
    public SquareMatrix(int size){
        super(size, size);
    }

    public double find_determinant(){
        double det=0;
        if(row==1&&col==1){
            return matrix[0][0];
        }
    
        for(int i=0; i<col; i++){
            //constructing the new matrix
            SquareMatrix m2=new SquareMatrix(row-1);
            //traversing m2 by col
            for(int c=0; c<m2.col; c++){
                //add elements in a non-matching col to m2
                for(int j=0; j<col; j++){
                    //check if the col matches
                    if(j!=i){
                        //if not set each element in the m2 col to the correct value
                        for(int r=0; r<m2.row; r++){
                            m2.set_value(matrix[r+1][j], r, c);
                        }
                    }
                }
            }
            det+=Math.pow(-1, i)*matrix[0][i]*m2.find_determinant();
        }
        return det;
    }
}
