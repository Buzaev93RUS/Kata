package Kata.Calculator;
import java.io.IOException;
import java.util.Scanner;

public class MainOs {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите уравнение:");
        calc(scanner.nextLine());
    }

    public static String calc(String input) {
        String[] lineArraySp = input.split(" ");
        try {
            if (lineArraySp.length != 3) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)\n" + "\n");
                }
            }
            if ((lineArraySp[0].equals("I") || lineArraySp[0].equals("II") || lineArraySp[0].equals("III") || lineArraySp[0].equals("IV") || lineArraySp[0].equals("V") || lineArraySp[0].equals("VI") || lineArraySp[0].equals("VII") || lineArraySp[0].equals("VIII") || lineArraySp[0].equals("IX") || lineArraySp[0].equals("X")) && (lineArraySp[2].equals("I") || lineArraySp[2].equals("II") || lineArraySp[2].equals("III") || lineArraySp[2].equals("IV") || lineArraySp[2].equals("V") || lineArraySp[2].equals("VI") || lineArraySp[2].equals("VII") || lineArraySp[2].equals("VIII") || lineArraySp[2].equals("IX") || lineArraySp[2].equals("X"))) {
                RomanCalc romanCalc = new RomanCalc(lineArraySp);
                return String.valueOf(romanCalc.res());
            } else if ((Integer.parseInt(lineArraySp[0]) <= 10 && Integer.parseInt(lineArraySp[0]) >= 1) && (Integer.parseInt(lineArraySp[2]) <= 10 && Integer.parseInt(lineArraySp[2]) >= 1)) {
                LatinaCalc latinaCalc = new LatinaCalc(lineArraySp);
                return String.valueOf(latinaCalc.res());
            } else if ((Integer.parseInt(lineArraySp[0]) < 1 || Integer.parseInt(lineArraySp[2]) < 1) || (Integer.parseInt(lineArraySp[0]) < 10 || Integer.parseInt(lineArraySp[2]) < 10)) {
                System.out.println("Введено не правильно число. Калькулятор принимает числа от 1 до 10");
            }
        } catch (NumberFormatException e) {
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("throws Exception //т.к. строка не является математической операцией");
        }
            return " ";
    }
}