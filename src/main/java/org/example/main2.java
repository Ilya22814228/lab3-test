package org.example;
import java.util.Scanner;


public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию: над double/float");
            System.out.println("1. Сравнить");
            System.out.println("2. Округлить");
            System.out.println("3. Отбросить дробную часть");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена.");
                return;
            }
            int op = Integer.parseInt(input);
            switch(op) {
                case 1:
                    System.out.println("Введите первое число");
                    String aStr = scanner.nextLine();
                    double a = Integer.parseInt(aStr);
                    System.out.println("Введите второе число");
                    String bStr = scanner.nextLine();
                    double b = Integer.parseInt(bStr);
                    if (a>b) {
                        double c = a-b;
                        System.out.println("Число а больше числа b на " + c);
                    }
                    else {
                        double c = b-a;
                        System.out.println("Число b больше числа a на " + c);
                    }
                    if (a==b) {
                        System.out.println("Числа равны");
                    }
                    break;
                case 2:
                    System.out.println("Введите число");
                    String okStr = scanner.nextLine();
                    double ok = Double.parseDouble(okStr);
                    double res = Math.round(ok);
                    System.out.println(res);
                    break;
                case 3:
                    System.out.println("Введите число");
                    String drStr = scanner.nextLine();
                    double dr = Double.parseDouble(drStr);
                    int i = (int) dr;
                    System.out.println(i);
                    break;
            }
        }
    }
}
