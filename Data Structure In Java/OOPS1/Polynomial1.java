package OOPS1;
import java.util.ArrayList;
class PolynomialClass1 {
    private int[] coefficients;

    public PolynomialClass1() {
        coefficients = new int[10]; // Assuming a maximum degree of 9
    }

    public void setCoefficient(int degree, int coefficient) {
        if (degree < coefficients.length && degree >= 0) {
            coefficients[degree] = coefficient;
        }
    }

    public void add(PolynomialClass1 p) {
        for (int i = 0; i < p.coefficients.length; i++) {
            coefficients[i] += p.coefficients[i];
        }
    }

    public void multiply(PolynomialClass1 p) {
        int[] resultCoefficients = new int[coefficients.length + p.coefficients.length - 1];
        for (int i = 0; i < coefficients.length; i++) {
            for (int j = 0; j < p.coefficients.length; j++) {
                resultCoefficients[i + j] += coefficients[i] * p.coefficients[j];
            }
        }
        coefficients = resultCoefficients;
    }

    public void print() {
        for (int i = 0; i < coefficients.length; i++) {
            if (coefficients[i] != 0) {
                System.out.print(coefficients[i] + "x^" + i + " + ");
            }
        }
        System.out.println("0");
    }

    public int evaluate(int x) {
        int result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    // Static method to add two polynomials
    public static PolynomialClass1 add(PolynomialClass1 p1, PolynomialClass1 p2) {
        PolynomialClass1 result = new PolynomialClass1();
        for (int i = 0; i < p1.coefficients.length; i++) {
            result.coefficients[i] = p1.coefficients[i];
        }
        for (int i = 0; i < p2.coefficients.length; i++) {
            result.coefficients[i] += p2.coefficients[i];
        }
        return result;
    }
}

public class Polynomial1 {
    public static void main(String[] args) {
        PolynomialClass1 p1 = new PolynomialClass1();
        p1.setCoefficient(0, 3);
        p1.setCoefficient(2, 2);
        p1.print();

        PolynomialClass1 p2 = new PolynomialClass1();
        p2.setCoefficient(0, 3);
        p2.setCoefficient(2, 2);
        p2.setCoefficient(1, 4);
        p2.setCoefficient(2, 5);
        p2.print();

        p1.add(p2);
        p1.print();
        p2.print();

        p2.multiply(p1);
        p2.print();
        p1.print();

        PolynomialClass1 p3 = PolynomialClass1.add(p1, p2);
        p3.print();
        p1.print();
        p2.print();

        int ans = p2.evaluate(10);
        System.out.println(ans);
    }
}