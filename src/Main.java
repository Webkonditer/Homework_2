public class Main {
    public static void main(String[] args) {

        //Задание 1
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if(clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Задание 3
        int year = 2120;
        if ((year%4 != 0  || year%100 == 0) && year%400 != 0) {
            System.out.println(year + " год не является високосным");
        } else  {
            System.out.println(year + " год является високосным");
        }

        //Задание 4
        int deliveryDistance = 95;
        int deysForDelivery = 0;
        if (deliveryDistance <= 20) {
            deysForDelivery = 1;
        } else if (deliveryDistance <= 60) {
            deysForDelivery = 2;
        } else if (deliveryDistance <= 100) {
            deysForDelivery = 3;
        }
        System.out.println("Потребуется дней: " + deysForDelivery);

        //Задание 5
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        //Задание 6 первой домашки
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        var result = a * (b + (c - d * e));
        result = result * -1;
        System.out.println("Результат: "+ result);

        //Задание 7 первой домашки
        a = 5;
        b = 7;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("а = " + a + ", b = " + b);

        //Задание 8 первой домашки
        a = 449;
        b = a / 10;
        c = b / 10 * 10;
        b = b % c;

        System.out.println("а = " + a + ", b = " + b);

        //Задание 6
        int age = 19;
        int salary = 58_000;
        int limit;
        double finalLimit = 0;

        if (age < 23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }

        if (salary >= 50_000 && salary < 80_000) {
            finalLimit = limit * 1.2;
        } else if (salary >= 80_000){
            finalLimit = limit * 1.5;
        } else {
            finalLimit = limit;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + finalLimit + " рублей");

        //Задание 7
        age = 22;
        salary = 80_000;
        int wantedSum = 500_000;
        double baseRate = 10;
        double rate = baseRate;

        if (age < 30 && age >= 23) {
            rate = baseRate + 0.5;
        } else if (age < 23) {
            rate = baseRate + 1;
        }

        if (salary > 80_000){
            rate = rate - 0.7;
        }

        double maximumPayment = salary / 2;
        double payment = wantedSum / 12 + (wantedSum / 100 *(rate / 12));

        var decision = "Подумаем";
        if (payment <= maximumPayment) {
            decision = "Одобрено";
        } else {
            decision = "Отказано";
        }

        System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maximumPayment + " рублей. Платеж по кредиту " + payment + " рублей. " + decision);
    }
}