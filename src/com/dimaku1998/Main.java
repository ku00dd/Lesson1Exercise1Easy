/*1) Написать программу которая считывает 5-и значное число с
        клавиатуры и выводит цифры из которого оно состоит.
        Например : Считывается число 54698
        Выводиться:
        5
        4
        6
        9
        8*/
package com.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int x = sc.nextInt();
        System.out.println(x/10000);
        System.out.println(x/1000%10);
        System.out.println(x/100%10);
        System.out.println(x/10%10);
        System.out.println(x%10);
    }
}
