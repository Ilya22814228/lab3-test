package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dohod = 0;
        int roshod = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Добавить доход");
            System.out.println("2. Добавить расход");
            System.out.println("3. Вывести результат");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена.");
                break;
            }
            int op = Integer.parseInt(input);
            switch (op) {
                case 1:
                    System.out.println("Добавьте доход");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    dohod += money;
                    break;
                case 2:
                    System.out.println("Введите расход");
                    String ros = scanner.nextLine();
                    int rosx = Integer.parseInt(ros);
                    roshod += rosx;
                    break;
                case 3:
                    mainysn(dohod);
                    mainecom(dohod,roshod);
                    main15(dohod,roshod);
                    double econom = (dohod*0.06) - ((dohod-roshod)*0.15);
                    System.out.println("Ваша экномия: ");
                    System.out.println(econom);
                    break;
            }
        }
        }
        public static double mainysn(int dohod) {
            double ysn = dohod * 0.06;
            System.out.println("Ваш УСН= "+ysn);
            return ysn;
    }
    public static int mainecom(int dohod, int roshod){
        int econom = roshod - dohod;
        System.out.println("Ваша экономия: "+econom);
        return econom;
    }
    public static double main15(int roshod, int dohod){
        double gg = (roshod-dohod)*0.15;
        System.out.println("УСН доходы минус расходы: "+gg);
        return gg;
    }

}
