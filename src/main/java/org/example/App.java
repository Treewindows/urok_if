package org.example;

/**
 * Hello world!
 */
public class App {
    /**
     *Задание  Меньшее из трех чисел с помощью if
     */
    private static void comparison(Integer a, Integer b, Integer c) {
        if (a < c && a < b) {
            System.out.print (String.format("Наименьшее число \n",a));
        } else if (b < a && b < c) {
            System.out.print(String.format("Наименьшее число \n",b));
        } else if (c < a && c < b) {
            System.out.print(String.format("Наименьшее число \n",c));
        }
    }
    /**
     * Задание Определить, является ли год високосным. (
     * год является високосным, если его номер кратен 4,
     * но не кратен 100, а также если он кратен 400  )
     *
     */
    private static void year(Integer a) {

        if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) {
            System.out.println("Високосный год\n");
        } else {
            System.out.println("Не високосный год\n");
        }

    }
    /**
     * Задание Вывести значение функции (4*(x - 5)^2 + 7*x – 10)/(x^4+1)
     * */

    private static void equation(Double a) {

        Double e = (4 * Math.pow(a - 5, 2) + (7 * a) - 10) / ((Math.pow(a, 4) + 1));
        System.out.print(String.format("Корень уравнения %s\n",e));

    }

    /**
     *
     * Задание По точке (x,y) определить четверть
     *
     */

    private static void quarter(Double a, Double b) {
        if (a > 0 && b > 0) {
            System.out.println("Четверть 1\n");
        } else if (a < 0 && b > 0) {
            System.out.println("Четверть 2\n");
        } else if (a > 0 && b < 0) {
            System.out.println("Четверть 3\n");
        } else if (a < 0 && b < 0) {
            System.out.println("Четверть 4\n");
        }
    }

    /**
     *  Задание Существует ли треугольникпо трем сторонам(треугольник существует когасумма двух любы сторон больше третьей)
     *
     */

    private static void triangle(Double a, Double b, Double c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует\n");
        } else {
            System.out.println("Треугольник не существует\n");
        }
    }

    /**
     *
     *  Задание Решить квадратное уравнение a*x^2 + b*x + c = 0 имея a,b,c ответ вывести в строку
     */

    private static void discriminant(Double a, Double b, Double c) {
        Double D = ((Math.pow(b, 2)) - (4 * a * c));

        if (D > 0) {
            Double x1 = (-(b) + (Math.sqrt(D))) / (2 * a);
            Double x2 = (-(b) - (Math.sqrt(D))) / (2 * a);

            System.out.print(String.format("Первый корень уравнения %s\n",x1));
            System.out.print(String.format("Первый корень уравнения %s\n",x2));
        } else if (D < 0) {
            System.out.println("Нет действительных корней");
        } else if (D == 0) {
            Double x1 = (-(b)) / (2 * a);
            Double x2 = (-(b)) / (2 * a);

            System.out.

                    print(String.format("Первый корень уравнения %s\n",x1));
            System.out.

                    print(String.format("Первый корень уравнения %s\n",x2));


        }


    }

    public static void main(String[] args) {
        comparison(7, 5, 6);
        year(2100);
        equation(3.0);
        quarter(3.2, 4.1);
        triangle(4.0, 5.0, 6.0);
        discriminant(3.0, -4.0, 2.0);
    }
}