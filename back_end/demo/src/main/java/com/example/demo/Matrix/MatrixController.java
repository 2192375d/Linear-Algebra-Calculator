package com.example.demo.Matrix;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/matrix")
public class MatrixController {
    @GetMapping
    public List<Matrix> getMatrix(){
        Matrix m1=new Matrix(2, 2);
        Matrix m2=new Matrix(2, 2);

        double[][] arr_m1={{1, 2}, {3, 4}};
        double[][] arr_m2={{2.1, 2.2}, {3.1, 3.2}};

        m1.set_value(arr_m1);
        m2.set_value(arr_m2);

        //test matrix_addition
        m1.matrix_addition(m2);

        //test scalar_multiplication
        m1.scalar_multiplication(3);

        //test is_square
        //is a sq
        m1.is_square();
        //not a sq
        Matrix m3=new Matrix(1, 3);
        double[][] arr_m3={{1, 2, 3}};
        m3.set_value(arr_m3);
        m3.is_square();

        return List.of(m1, m3);
    }
}
