import java.util.*;

public class complex {
    Scanner sc = new Scanner(System.in);
    float real, img;

    complex() {
        real = 0;
        img = 0;
    }

    complex(float x, float y) {
        real = x;
        img = y;
    }

    void Add(complex x, complex y) {
        real = x.real + y.real;
        img = x.img + y.img;
    }

    void Substract(complex x, complex y) {
        real = x.real - y.real;
        img = x.img - y.img;
    }

    void multiply(complex x, complex y) {
        real = x.real * y.real - (x.img * y.img);
        img = x.real * y.img + x.img * y.real;
    }

    void divide(complex x, complex y) {
        real = (float)(x.real * y.real + x.img * y.img) /(float) (y.real * y.real + y.img * y.img);
        img = (float)(x.img * y.real - x.real * y.img) /(float)  (y.real * y.real + y.img * y.img);
    }

    void display() {
        System.out.println(real + "+" + img + "i");
    }

}