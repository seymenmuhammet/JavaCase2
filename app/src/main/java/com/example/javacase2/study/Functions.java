package com.example.javacase2.study;

public class Functions {
    public double convertMil(double km) {
        return km * 0.621;
    }

    public double rectangleArea(double a, double b) {
        return a * b;
    }

    public int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public int totalE(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e' || word.charAt(i) == 'E')
                count++;
        }
        return count;
    }

    public int totalAngle(int edge) {
        return ((edge - 2) * 180) / edge;
    }

    public int totalSalary(int day) {
        int workHour = day * 8;
        int salary = workHour * 40;
        if (workHour > 150) {
            int shift = (workHour - 150) * 80;
            salary += shift;
        }
        return salary;
    }

    public int parkingFee(int hour) {
        return 50 + (hour-1) * 10;
    }

}
