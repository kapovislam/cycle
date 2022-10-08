public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();


    }

    private static void task9() {
        //Задание 9
        /**
         * Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку",
         * а в банк под проценты – 12% годовых
         */
        int salary = 29000;
        double total = 0;
        double percent = 0.12;
        for (int i = 1; i <= 12; ++i) {
            total = total + (total * percent) / 12;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task8() {
        //Задание 8
        /**
         * Посчитайте c помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать
         * по 29 000 рублей "в банку".
         */
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task7() {
        //Задание 7
        /**
         * Программа, которая выводит в консоль последовательность цифр:
         * 1 2 4 8 16 32 64 128 256 512
         */
        for (int number = 1; number <= 512; number = number * 2) {
            System.out.println(number);
        }
    }

    private static void task6() {
        //Задание 6
        /**
         * Программа, которая выводит в консоль последовательность цифр
         * 7 14 21 28 35 42 49 56 63 70 77 84 91 98
         */
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    private static void task5() {
        //Задание 5
        /**
         * Все високосные года, начиная с 1904 года до 2096
         */
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year != 100 || year % 400 == 0)
                System.out.println(year + " год является високосным");
        }
    }

    private static void task4() {
        //Задание 4
        /**
         * Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему
         */
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }

    private static void task3() {
        //Задание 3
        /**
         * Выведите в консоль все четные числа от 0 до 17.
         */
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0 && i > 0) {
                System.out.println("Четные числа " + i);

            }
        }
    }

    private static void task2() {
        //Задание 2
        /**
         * С помощью цикла for выведите в консоль все числа от 10 до 1.
         */
        for (int i = 10; i >= 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }

    private static void task1() {
        //Задание 1
        /**
         * С помощью цикла for выведите в консоль все числа от 1 до 10.
         */
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }
}