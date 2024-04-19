public class Main {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задача 1");
        int cashSaving = 0;
        int monthlySaving = 15000;
        int totalSaving = 2459000;
        int month = 0;
        while (cashSaving <= totalSaving) {
            cashSaving = cashSaving + monthlySaving;
            month = month + 1;
            System.out.println("Месяц " + month + " Сумма накоплений равно " + cashSaving);
        }
        // Задача 2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
// Задача 3
        System.out.println("Задача 3");
        int people = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year = year + 1) {
        people += (people / 1000 * (birthRate - deathRate));

        System.out.println("Год" + year + ", численность населения составляет " + people);
    }
        // Задача 4
        System.out.println("Задача 4");
int cash=15000;
        int totalCash=12_000_000;
        month=1;
        while (cash<=totalCash) {
            cash*=1.07;
            System.out.println("Месяц "+month+" сумма накоплений "+cash);
            month=month+1;
        }
        // Задача 5
        System.out.println("Задача 5");
        cash=15000;
        totalCash=12_000_000;
        month=1;
        while (cash<=totalCash) {
            cash*=1.07;
            if (month%6==0) {
                System.out.println("Месяц " + month + " сумма накоплений " + cash);
            }
            month=month+1;
        }
        // Задача 6
        System.out.println("Задача 6");
        cash=15000;
        for (int m=1; m<108;m++) {
            cash *= 1.07;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + " сумма накоплений " + cash);
            }
        }
        // Задача 7
        System.out.println("Задача 7");
        for (int f=5;f<=31;f+=7){
            System.out.println("Сегодня пятница, "+f+ "-е число. Необходимо подготовить отчет");
        }
        // Задача 8
        System.out.println("Задача 8");
        int realYear=2024;
        int startYear=realYear-200;
        int finishYear=realYear+100;
        for (int year=startYear;year<=finishYear;year=year+1) {
            if (year % 79 == 0) {
                System.out.println(year);
            }

        }

}
}