package com.company;

import java.util.Scanner;

class Calculator{
    int num1;
    int num2;
    int sumNumRom;
    int longInput;
    int indexArifmetical;
    char arifmetical;
    String stringNum1 = "";
    String stringNum2 = "";
    String[] massive;
    String input;
    boolean bool1;
    boolean bool2;

}

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculator calc = new Calculator();

        calc.input = scan.nextLine();

        calc.input = calc.input.replace(" ","");

        if (calc.input.indexOf("+") > 0) {
            calc.arifmetical = '+';
            calc.indexArifmetical = calc.input.indexOf("+");
        } else if (calc.input.indexOf("-") > 0) {
            calc.arifmetical = '-';
            calc.indexArifmetical = calc.input.indexOf("-");
        } else if (calc.input.indexOf("*") > 0) {
            calc.arifmetical = '*';
            calc.indexArifmetical = calc.input.indexOf("*");
        } else if (calc.input.indexOf("/") > 0) {
            calc.arifmetical = '/';
            calc.indexArifmetical = calc.input.indexOf("/");
        } else {
            System.out.println("Ошибка");
        }
        //System.out.println(calc.arifmetical);
        //System.out.println(calc.indexArifmetical);

        calc.longInput = calc.input.length();
        //System.out.println(calc.longInput);

        calc.massive = new String[calc.longInput];

        for (int i = 0; i < calc.longInput; i++) {
            calc.massive[i] = String.valueOf(calc.input.charAt(i));
            //System.out.println(calc.massive[i]);
        }

        for (int i = 0; i < calc.indexArifmetical; i++) {
            calc.stringNum1 = calc.stringNum1 + calc.massive[i];
            //System.out.println(calc.stringNum1);
        }

        for (int i = calc.indexArifmetical + 1; i < calc.longInput; i++) {
            calc.stringNum2 = calc.stringNum2 + calc.massive[i];
            //System.out.println(calc.stringNum2);
        }

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "I","II","III","IV","V","VI","VII","VIII","IX","X"};

        for (int i = 0; i < 21; i = i + 1) {
            calc.bool1 = calc.stringNum1.contentEquals(numbers[i]);
            //System.out.println(i);
            //System.out.println(calc.bool1);
            if (calc.bool1 == true) break;
            {
                calc.num1 = i + 1;
            }
        }
        //System.out.println(calc.num1);

        if (calc.bool1 != true) {
            System.out.println("Ошибка");
            return;
        }

        for (int i = 0; i < 21; i = i + 1) {
            calc.bool2 = calc.stringNum2.contentEquals(numbers[i]);
            //System.out.println(i);
            //System.out.println(calc.bool1);
            if (calc.bool2 == true) break;{
                calc.num2 = i+1;
            }
        }
        //System.out.println(calc.num2);

        if (calc.bool2 != true) {
            System.out.println("Ошибка");
            return;
        }

        if (calc.num1 <= 10){
            calc.bool1 = false;
        }
        if (calc.num2 <= 10){
            calc.bool2 = false;
        }
        if (calc.bool1 != calc.bool2){
            System.out.println("Ошибка");
            return;
        }
        if (calc.num1 <= 10) {
            if (calc.num2 <= 10) {
                switch (calc.arifmetical) {
                    case '+':
                        System.out.println(calc.num1 + calc.num2);
                        return;
                    case '-':
                        System.out.println(calc.num1 - calc.num2);
                        return;
                    case '*':
                        System.out.println(calc.num1 * calc.num2);
                        return;
                    case '/':
                        System.out.println(calc.num1 / calc.num2);
                        return;
                }
            }
        }

        //System.out.println(calc.bool1);
        //System.out.println(calc.bool2);

        if (calc.num1 > 10){
            calc.num1 = calc.num1 - 10;
        }
        if (calc.num2 > 10){
            calc.num2 = calc.num2 - 10;
        }
        //System.out.println(calc.num1);
        //System.out.println(calc.num2);

        switch (calc.arifmetical) {
            case '+':
                calc.sumNumRom = (calc.num1 + calc.num2);
                break;
            case '-':
                calc.sumNumRom = (calc.num1 - calc.num2);
                break;
            case '*':
                calc.sumNumRom = (calc.num1 * calc.num2);
                break;
            case '/':
                calc.sumNumRom = (calc.num1 / calc.num2);
                break;
        }

        String[] rom = new String[101];
        rom[1] = "I";
        rom[2] = "II";
        rom[3] = "III";
        rom[4] = "IV";
        rom[5] = "V";
        rom[6] = "VI";
        rom[7] = "VII";
        rom[8] = "VIII";
        rom[9] = "IX";
        rom[10] = "X";
        rom[20] = "XX";
        rom[30] = "XXX";
        rom[40] = "XL";
        rom[50] = "L";
        rom[60] = "LX";
        rom[70] = "LXX";
        rom[80] = "LXXX";
        rom[90] = "XC";
        rom[100] = "C";

        //System.out.println(calc.sumNumRom);

        if (calc.sumNumRom < 11){
            System.out.println(rom[calc.sumNumRom]);
        }else if (calc.sumNumRom % 10 == 0) {
            System.out.println(rom[calc.sumNumRom]);
            return;
        }else{
            int a = calc.sumNumRom / 10 * 10;
            int b = calc.sumNumRom % 10;
            //System.out.println(a);
            //System.out.println(b);
            System.out.println(rom[a] + rom[b]);
        }







    }
}
