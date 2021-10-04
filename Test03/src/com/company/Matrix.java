package com.company;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Matrix {
    //Private Class Variable Definitions -- belongs to each object
    private int m_rows;
    private int n_cols;
    private double[][] arr;

    // -------------------Constructors--------------------------------
//Construct[1] given m & n as parameters
    public Matrix(int m, int n){
        this.m_rows = m;
        this.n_cols = n;
        this.arr = new double[m][n];
        for(int i = 0; i< this.m_rows; i++){
            for(int j = 0; j < this.n_cols; j++){
                this.arr[i][j] = 0;
            }
        }
    }

    //Construct [2] with console input -- no parameters (Overloaded)


//----------------------- End Other Classes---------------------------------


}//end class