package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(double radius) {

        return (Math.PI * Math.pow(radius, 2));

//        throw new NoCodeWrittenException();
    }

    static double areaOfRectangle(double length, double width) {

        return (length * width);
//        throw new NoCodeWrittenException();
    }

    static double areaOfTriangle(double base, double h) {

        return (0.5 * base * h);
//        throw new NoCodeWrittenException();
    }
}
