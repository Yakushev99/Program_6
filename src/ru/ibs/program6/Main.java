package ru.ibs.program6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - пуд, 4 - унция");
                int number2 = input.nextInt();
                System.out.print("Введите количество выбранных единиц:");
                double number3 = input.nextInt();
                double kg = 0;
                double funt = 0;
                double pud = 0;
                double unc = 0;
                switch (number2) {
                    case 1:
                        kg = number3;
                        funt = number3 * 2.20462;
                        pud = number3 * 0.0610475;
                        unc = number3 * 35.274;
                        break;
                    case 2:
                        kg = number3 * 0.453592;
                        funt = number3;
                        pud = number3 * 0.0276907;
                        unc = number3 * 16;
                        break;
                    case 3:
                        kg = number3 * 16.3807;
                        funt = number3 * 36.1132;
                        pud = number3;
                        unc = number3 * 577.812;
                        break;
                    case 4:
                        kg = number3 * 0.0283495;
                        funt = number3 * 0.0625;
                        pud = number3 * 0.00173067;
                        unc = number3;
                        break;
                }
                System.out.println("Килограммы:"+kg);
                System.out.println("Фунты:"+funt);
                System.out.println("Пуды:"+pud);
                System.out.println("Унции:"+unc);
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int number4 = input.nextInt();
                System.out.print("Введите количество выбранных единиц:");
                double number5 = input.nextInt();
                double meter = 0;
                double mile = 0;
                double yard = 0;
                double foot = 0;
                switch (number4) {
                    case 1:
                        meter = number5;
                        mile = number5 * 0.000621371;
                        yard = number5 * 1.09361;
                        foot = number5 * 3.28084;
                        break;
                    case 2:
                        meter = number5 * 1609.34;
                        mile = number5;
                        yard = number5 * 1760;
                        foot = number5 * 5280;
                        break;
                    case 3:
                        meter = number5 * 0.9144;
                        mile = number5 * 0.000568182;
                        yard = number5;
                        foot = number5 * 3;
                        break;
                    case 4:
                        meter = number5 * 0.3048;
                        mile = number5 * 0.000189394;
                        yard = number5 * 0.333333;
                        foot = number5;
                        break;
                }
                System.out.println("Метры:"+meter);
                System.out.println("Мили:"+mile);
                System.out.println("Ярды:"+yard);
                System.out.println("Футы:"+foot);
                break;
        }

    }
}
