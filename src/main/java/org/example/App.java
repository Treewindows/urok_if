package org.example;

/**
 * Hello world!
 */
public class App {
    /**
     *Задание №1  Меньшее из трех чисел с помощью if
     */
    private static Integer minNumbers(Integer a, Integer b, Integer c) {
        if (a < c && a < b) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
    /**
     * Задание №2 Определить, является ли год високосным. (
     * год является високосным, если его номер кратен 4,
     * но не кратен 100, а также если он кратен 400  )
     *
     */
    private static void leapYear(Integer a) {
        if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) {
            System.out.println( a + " год является високосным");
        } else {
            System.out.println(a + " год не является  високосным");
        }
    }
    /**
     * Задание №3 Вывести значение функции (4*(x - 5)^2 + 7*x – 10)/(x^4+1)
     * */
    private static Double equation(Double a) {
        Double e = (4 * Math.pow(a - 5, 2) + (7 * a) - 10) / ((Math.pow(a, 4) + 1));
        return e;
    }
    /**
     *
     * Задание №4 По точке (x,y) определить четверть
     *
     */
    private static void quarter(Double a, Double b) {
        if (a > 0 && b > 0) {
            System.out.println("Точка находится в четверти №1");
        } else if (a < 0 && b > 0) {
            System.out.println("Точка находится в четверти №2");
        } else if (a > 0 && b < 0) {
            System.out.println("Точка находится в четверти №3");
        } else {
            System.out.println("Точка находится в четверти №4");
        }
    }
    /**
     *  Задание №5 Существует ли треугольникпо трем сторонам(треугольник существует когасумма двух любы сторон больше третьей)
     *
     */
    private static void triangle(Double a, Double b, Double c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
    /**
     *
     *  Задание №6 Решить квадратное уравнение a*x^2 + b*x + c = 0 имея a,b,c ответ вывести в строку
     */
    private static void discriminant(Double a, Double b, Double c) {
        Double D = ((Math.pow(b, 2)) - (4 * a * c));
        if (D > 0) {
            Double x1 = (-(b) + (Math.sqrt(D))) / (2 * a);
            Double x2 = (-(b) - (Math.sqrt(D))) / (2 * a);
            System.out.print(String.format("Первый корень уравнения %s\n",x1));
            System.out.print(String.format("Второй корень уравнения %s\n",x2));
        } else if (D < 0) {
            System.out.println("Нет действительных корней");
        } else  {
            Double x12 = (-(b)) / (2 * a);
            System.out.print(String.format("Корень уравнения %s\n",x12));
        }
    }
    public static void main(String[] args) {
        // Задание №1
        Integer z = minNumbers(7, 5, 6);
        System.out.print("Наименьшее число: "  + z + "\n" );
        // Задание №2
        leapYear(2100);
        // Задание №3
        Double f = equation(3.0);
        System.out.print(String.format("Значение функции %.3f\n", f));
        // Задание №4
        quarter(3.2, 4.1);
        // Задание №5
        triangle(4.0, 5.0, 6.0);
        // Задание №6
        discriminant(16.0, -40.0, 25.0);
    }
}