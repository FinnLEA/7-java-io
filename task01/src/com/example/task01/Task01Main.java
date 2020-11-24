package com.example.task01;

import java.io.IOException;
import java.io.*;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:


        System.out.println(checkSumOfStream(null));


    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // your implementation here
        if(inputStream == null){
            throw new IllegalArgumentException();
        }

        int checkSum = 0;
        int arrayByte = inputStream.read();

        while(arrayByte != -1){
            checkSum = Integer.rotateLeft(checkSum, 1) ^ arrayByte;
            arrayByte = inputStream.read();
        }

        return checkSum;
    }
}
