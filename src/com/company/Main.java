package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            if (a<0){
                throw new Exception();
            }if (a>20){
                throw new RuntimeException();
            }
            int b = scanner.nextInt();
            if (a<0){
                throw new Exception();
            }if (a>20){
                throw new RuntimeException();
            }
            int c = scanner.nextInt();
            if (a<0){
                throw new Exception();
            }if (a>20){
                throw new RuntimeException();
            }
            Parallelepiped parallelepiped = new Parallelepiped();
            parallelepiped.setA(a);
            parallelepiped.setB(b);
            parallelepiped.setC(c);
            parallelepiped.s();
            parallelepiped.v();

        } catch ( InputMismatchException d1){
            System.out.println("значениеи стороны параллелепипеда должно быть число");

        }catch (RuntimeException df){
            System.out.println("значение сторон не должно быть больше 20");

        }catch (Exception d) {
            System.out.println("значение стороны а не должен быть отрицательным");
        }
    }
}
