import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printIsLeapYear(2023);
        printRecomendedVersionOS(1, 2023);
        int days = calculateDeliveryDistance(34);
        printDeliveryDistance(days);

    }

    public static void printIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printRecomendedVersionOS(int deviceType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear) {
            if (deviceType == 0) {
                System.out.println("Установите облегченную версию для iOs");
            } else {
                System.out.println("Установите облегченную версию для Android");
            }
        } else {
            if (deviceType == 0) {
                System.out.println("Установите версию для iOs");
            } else {
                System.out.println("Установите версию для Android");
            }
        }
    }

    public static int calculateDeliveryDistance(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance < 100) {
            return 3;
        }
        return 0;
    }

    public static void printDeliveryDistance(int days) {
        if (days >= 0) {
            System.out.println("Потребуется дней: " + days + " срок доставки.");
        } else {
            System.out.println("Доставки нет");
        }
    }
}

