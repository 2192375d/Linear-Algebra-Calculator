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
        return List.of(new Matrix(2, 3));
    } 
}
