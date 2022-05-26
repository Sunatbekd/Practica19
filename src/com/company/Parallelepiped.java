package com.company;

public class Parallelepiped {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void s(){
        int s1 = 2*(a*b + a*c + b*c);
        System.out.println("Площадь параллелепипеда равен: "+s1);
    }
    public void v(){
        int v1 = a*b*c;
        System.out.println("Объем параллелепипеда равен: "+v1);
    }
}
