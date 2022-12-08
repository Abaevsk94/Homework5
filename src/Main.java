public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < clientDeviceYear ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    static public void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        boolean multipleOfFour = year % 4 == 0;
        boolean multipleOfHundred = year % 100 != 0;
        boolean multipleOf4Hundred = year % 400 == 0;
        if (multipleOfFour) {
            System.out.println("Год является високосным");
        } else if (multipleOfHundred) {
            System.out.println("Год не является високосным");
        } else if (multipleOf4Hundred) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
    }
}
