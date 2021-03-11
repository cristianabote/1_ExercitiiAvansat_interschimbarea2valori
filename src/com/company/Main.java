package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Interschimba valoarea a 2 variabile
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti prima variabila");
        int var1=scan.nextInt();
        System.out.println("Introduceti a doua variabila");

        int var2=scan.nextInt();
        System.out.println("Momentan variabila1 este egala cu "+var1+" iar variabila2 este egala cu "+var2);
        int aux=var1;
        var1=var2;
        var2=aux;
        System.out.println("Acum variabila1 este egala cu "+var1+" iar variabila2 este egala cu "+var2);
    }
}
