import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для IOS по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android");
        else
            System.out.println("Для Вашего устройства нет приложения, воспользуйтесь сайтом");

        System.out.println("Задача 2");
        int YearDevice = 2003;
        clientOS = 1;
        if (clientOS == 0) {
            if (YearDevice >= 2015) {
                System.out.println("Установите обычную версию приложения для IOS");
            }
            else {
                System.out.println("Установите облегченную версию приложения для IOS");
            }
        }
        if (clientOS == 1) {
            if (YearDevice >= 2015) {
                System.out.println("Установите обычную версию приложения для Android");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android");
            }
        }

        System.out.println("Задача 3");
        int year = 2021;
        if (year < 1584) {
            System.out.println("Первый високосный год - 1584");
            return;
        }
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: " + 1);
        else if (deliveryDistance > 20 && deliveryDistance <= 60)
            System.out.println("Потребуется дней: " + 2);
        else if (deliveryDistance > 60 && deliveryDistance <= 100)
            System.out.println("Потребуется дней: " + 3);
        else
            System.out.println("Доставка в данной зоне отсутствует");

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц принадлежит зиме");
                break;
            case 2:
                System.out.println(monthNumber + " месяц принадлежит зиме");
                break;
            case 3:
                System.out.println(monthNumber + " месяц принадлежит весне");
                break;
            case 4:
                System.out.println(monthNumber + " месяц принадлежит весне");
                break;
            case 5:
                System.out.println(monthNumber + " месяц принадлежит весне");
                break;
            case 6:
                System.out.println(monthNumber + " месяц принадлежит лету");
                break;
            case 7:
                System.out.println(monthNumber + " месяц принадлежит лету");
                break;
            case 8:
                System.out.println(monthNumber + " месяц принадлежит лету");
                break;
            case 9:
                System.out.println(monthNumber + " месяц принадлежит осени");
                break;
            case 10:
                System.out.println(monthNumber + " месяц принадлежит осени");
                break;
            case 11:
                System.out.println(monthNumber + " месяц принадлежит осени");
                break;
            case 12:
                System.out.println(monthNumber + " месяц принадлежит зиме");
                break;
                default:
        }
    }
}