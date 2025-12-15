import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1 ИСПРАВЛЕНО");
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android");
        } else {
            System.out.println("Для Вашего устройства нет приложения, воспользуйтесь сайтом");
        }

        System.out.println("Задача 2 ИСПРАВЛЕНО");
        int yearDevice = 2003;
        clientOS = 0;
        if (clientOS == 0 && yearDevice >= 2015) {
            System.out.println("Установите обычную версию для IOS");
        } else if (clientOS == 0 && yearDevice < 2015) {
            System.out.println("Установите облегченную версию для IOS");
        } else if (clientOS == 1 && yearDevice >= 2015) {
            System.out.println("Установите обычную версию для Android");
        } else {
            System.out.println("Установите облегченную версию для Android");
        }


        System.out.println("Задача 3 ИСПРАВЛЕНО");
        int year = 4;
        if (year < 1584) {
            System.out.println("Первый високосный год - 1584");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 4 ИСПРАВЛЕНО");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставка в данной зоне отсутствует");
        }

        System.out.println("Задача 5 ИСПРАВЛЕНО");
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12: {
                System.out.println("Месяц " + monthNumber + " зимний");
            }
            break;
            case 3:
            case 4:
            case 5: {
                System.out.println("Месяц " + monthNumber + " весенний");
            }
            break;
            case 6:
            case 7:
            case 8: {
                System.out.println("Месяц " + monthNumber + " летний");
        }
        break;
        case 9:
        case 10:
        case 11: {
        System.out.println("Месяц " + monthNumber + " осенний");
    }
                break;
    default:
            System.out.println("Дорогулис, ты не тот месяц выбрал");
}

        }
    }