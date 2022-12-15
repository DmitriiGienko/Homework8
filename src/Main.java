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
    }

    public static void task1() {
        System.out.println("_____Задача1______");
        int salary = 15000;
        int total = 0;
        int month = 0;
        char rub = '\u20bd'; // не знаю насколько это вписывается в задание
        while (total <= 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " " + rub);
        }
    }

    public static void task2() {
        System.out.println("_____Задача2______");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");

        for (int k = 10; k > 0; k--) {
            System.out.print(k + " ");
        }
    }

    public static void task3() {
        System.out.println("_____Задача3______");
        int population = 12_000_000;
        int bornForYear = population / 1000 * 12; // прибыль населения за год
        //System.out.println(bornForYear);
        int dieForYear = population / 1000 * 8; // убыль населения
        int increasePop = bornForYear - dieForYear;
        int year = 1;
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " + (population + increasePop));
            population = population + increasePop;
            year++;
        }
    }

    public static void task4() {
        System.out.println("_____Задача4______");
        int pay = 15000;
        double percent = 0.07;
        int total = 15000;
        int month = 1;
        while (total <= 12_000_000) {
            System.out.println("Сумма накоплений за " + month + " мес. равна " + total);
            total = (int) (total + (total * percent) + pay); // не уверен в формуле
            month++;
        }
    }

    public static void task5() {
        System.out.println("_____Задача5______");
        int pay = 15000;
        double percent = 0.07;
        int total = 15000;
        int month = 1;
        while (total <= 12_000_000) {
            total = (int) (total + (total * percent) + pay);
            month++;
            if (month % 6 == 0)
                System.out.println("Сумма накоплений за " + month + " мес. равна " + total); //посмел убрать фигурные скобки т.к. действие только одно...
        }
    }

    public static void task6() {
        System.out.println("_____Задача6______");  //долго ломал голову, не понял правильно ли вообще решил
        int pay = 15000;
        double percent = 0.07;
        int total = 15000;
        int month = 1;
        int year = 0;
        while (year <= 9) {
            for (month = 1; month <= 12; month++) {
                total = (int) (total + (total * percent) + pay);
                month++;
                if (month % 6 == 0) System.out.println("За последние полгода вы накопили " + total);
            }
            year++;
        }
    }

    public static void task7() {
        System.out.println("_____Задача7______");
        int friday = 2; // первая пятница в декабре
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("_____Задача8______");
        int year = 2022;
        int startYear = year - 200;
        int finishYear = year + 100;
        while (year <= finishYear) {
            startYear++;
            if (startYear % 76 == 0) {
                System.out.println(startYear);
            }
            year = startYear;
        }
    }


}