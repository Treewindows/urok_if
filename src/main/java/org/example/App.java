package org.example;

/**
 * Hello world!
 *
 */
public class App {
    /**Задание №1
     * Написать функцию которая принимает 3 значения
     * (длина, минимально-возможное значение массива, максимально-возможное значение массива)
     * и выводит рандомно сгенерированный массив
     */
    private static void funcArray(Integer length, Integer a, Integer b) {
        Integer max;
        Integer min;
        if (a>b){ max = a; min = b;}
        else { max = b; min = a;}
        System.out.print(String.format("Рандомно сгенерированный массив: { "));
        Integer [] array = new Integer [length];
        for (Integer i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*((max-min)+1)+min);
            System.out.print(array [i] + " ");
        }
        System.out.print("}");
    }
    /**Задание №2
     * Найти сумму всех элементов массива
     *
     */
    private static Integer sumArray ( Integer [] array){
        Integer result = 0;
        Integer k = null;
        for (Integer i = 0; i < array.length; i++){
            if (array [i] == k){array [i] = i;} // если массив не является заданным с конкретными значениями, а есть только длина массива
            result += array[i];
        }
        return result;
    }
    /** Задание №3
     Вывести все четные элементы массива
     */
    private static void evennumbersArray ( Integer [] array){
        Integer k = null;
        for (Integer i = 0; i < array.length; i++){
            if (array [i] == k){array [i] = i;}
            if (array [i] % 2 == 0){
                System.out.print (" " + array[i]);
            }
        }
    }
    /**Задание №4
     *Вывести строку задом наоборот
     *
     */
    private static void reverseArray ( java.lang.String[] array){
        System.out.print ("\nОбратный массив: ");
        for (Integer i =array.length-1;i>=0;i--){
            System.out.print(array[i] + " ");
        }
    }
    /**Задание №5
     * “Удалить” первый элемент массива
     *
     */
    private static void deletefirstI ( Integer[] array) {
        System.out.print( "\nУдаление первого элемента: ");
        for (Integer i = 0; i < array.length-1; i++) {
            array [i] = array[i+1];
            System.out.print( array[i] + " ");
        }
    }
    /**Задание №6
     *
     * “Удалить” элемент из массива по индексу
     *
     */
    private static void numbeElement ( Integer[] array,Integer number) {
        System.out.print( "\nУдаление выбранного элемента: ");
        for (Integer i = 0; i < number; i++) {
            System.out.print(array[i] + " ");}
        for(Integer j = number;j<array.length-1;j++){
            array[number]=array[j+1];
            System.out.print(array[number]+ " ");
        }

    }
    /**Задание №7
     *Отсортировать массив с помощью пузырька (Bubble sort, сортировка пузырьком)
     *
     */
    private static void bubbleSort (Integer [] array) {
        Boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (Integer i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    Integer swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                    sorted = false;
                }
            }
        }
    }
    /**Задание №8
     * У нас есть последовательность 1+2+3+…+n определить существует ли такое n чтобы сумма ряда была кратно числу k, написать функцию в которую передают только число k, и получают true либо false
     *
     */
    private static Boolean numberK(Integer k){
        Boolean kratnoe = false;
        Integer sum = 0;
        Integer[] array = new Integer[]{1,2,3,4};
        for (Integer i = 0; i < array.length;i++){
            sum += array[i];
            if (sum % k == 0){
                kratnoe = true;
            }
        }
        return kratnoe;
    }
    public static void main( String[] args )
    {
        // Функция для задания № 1
        funcArray(3,2,-5);
        // Функция для задания № 2
        Integer a = sumArray(new Integer[]{5,5,5});
        System.out.print(String.format("\nСумма всех элементов массива = %s", a));
        // Функция для задания № 3
        evennumbersArray(new Integer[4]);
        // Функция для задания № 4
        reverseArray(new java.lang.String[]{"Зима","Лето","Осень","Весна"});
        // Функция для задания № 5
        Integer [] array = {8,7,6,5,4,3,2,1};
        bubbleSort(array);
        System.out.print(String.format("\nПузырьковый метод: { "));
        for (Integer i = 0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.print( "}");
        // Функция для задания № 6
        deletefirstI(new Integer []{2,3,6,2,2,3,4,5,6});
        // Функция для задания № 7
        numbeElement(new Integer[]{0,1,2,3,4,5,6,7,8,9},1);
        // Функция для задания № 8
        Boolean z = numberK(2);
        System.out.print("\nЗначение есть ли число кратное сумме ряда чисел = " + z);
    }
}