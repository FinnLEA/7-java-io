package com.example.task04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        double result = 0.0;
        StringBuilder stringBuilder = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        while (inputStreamReader.ready()){
            stringBuilder.appendCodePoint(inputStreamReader.read());
        }

        String[] parseStrs = stringBuilder.toString().split("\\s");

        for (String number : parseStrs){
            try {
                result += Double.parseDouble(number);
            }
            catch (NumberFormatException exception){}
        }

        System.out.println(new Formatter(Locale.US).format("%.6f", result));
    }
}
