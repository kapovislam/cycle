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
        //Вторая часть
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();


    }

    private static void task18() {
        //Задание 2.9
        /**
         * Программа, которая выводит в консоль таблицу умножения на 2
         */
        for (int i = 1; i <= 10; ++i) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }

    private static void task17() {
        //Задание 2.8
        /**
         *В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
         * а также следующий год ее появления.
         */
        int currentYear = 2022;
        int history = currentYear - 200;
        int future = currentYear + 100;
        for (int i = 0; i <= future; i += 79) {
            if (i >= history && i <= future) {
                System.out.println(i);
            }

        }
    }

    private static void task16() {
        //Задание 2.7
        /**
         *Программа, которая считает дни месяца по датам, определяет, какой день пятница,
         * и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
         */
        for (int friday = 5; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    private static void task15() {
        //Задание 2.6
        /**
         *Программа, которая будет выводить Василию сумму его накоплений за следующие каждые полгода
         * в течение 9 лет
         */
        int deposit = 15000;
        double total = 0;
        String sum = "";
        double percent = 0.07;
        int month = 0;
        while (total <= 12000000) {
            total += (total * percent) / 12;
            total += deposit;
            month += 1;
            sum = String.format("%.2f", total);
            if (month % 6 == 0 && month <= 108) {
                System.out.println(month + " месяц " + sum + " рублей");
            }
        }

    }

    private static void task14() {
        //Задание 2.5
        /**
         *Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
         * а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
         */
        int deposit = 15000;
        double total = 0;
        String sum = "";
        double percent = 0.07;
        int month = 0;
        for (total = 0; total <= 12_000_000; total++) {
            total = total + (total * percent) / 12;
            total = total + deposit;
            month = month + 1;
            sum = String.format("%.2f", total);
            if (month % 6 == 0) {
                System.out.println(month + " месяц " + sum + " рублей");
            }
        }
    }

    private static void task13() {
        //Задание 2.4
        /**
         * Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
         * чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется,
         * а всегда равен 7%.
         */
        int deposit = 15000;
        double total = 0;
        String sum = "";
        double percent = 0.07;
        int month = 0;
        for (total = 0; total <= 12_000_000; total++) {
            total += (total * percent) / 12;
            total += deposit;
            month += 1;
            sum = String.format("%.2f", total);
            System.out.println(month + " месяц " + sum + " рублей");


        }
    }

    private static void task12() {
        //Задание 2.3
        /**
         *В стране Y население равно 12 миллионам человек.
         * За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
         * Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
         * что показатели рождаемости и смертности постоянны.
         */
        int population = 12_000_000;                 //общая численность
        for (int year = 1; year <= 10; year++) {
            int birth = population / 1000 * 17;      //рождаемость
            int mortality = population / 1000 * 8;  //смертность
            int growth = birth - mortality;         //прирост населения
            population = population + growth;

            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    private static void task11() {
        //Задание 2.2
        /**
         * Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
         * На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
         */
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }


    private static void task10() {
        //Задание 2.1
        /**
         * С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
         * при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
         */
        int savings = 15000; //Сумма вклада
        double total = 0; //Сумма накопления
        String sum = "";
        double percent = 0.12;
        int month = 0;
        while (total <= 2459000) {
            total = total + (total * percent);
            total = total + savings;
            month = month + 1;
            sum = String.format("%.2f", total);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.printf("%.2f", total);
    }


    private static void task9() {
        //Задание 9
        /**
         * Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку",
         * а в банк под проценты – 12% годовых
         */
        int salary = 29000;
        double total = 0;
        String sum = "";
        double percent = 0.12;
        for (int i = 1; i <= 12; ++i) {
            total = total + (total * percent) / 12;
            total = total + salary;
            sum = String.format("%.2f", total);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.printf("%.2f", total);
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