public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int i;
        for (i = 1; i <= 10; i++)
            System.out.println(i);
        System.out.println("Задание 2");
        int i2;
        for (i2 = 10; i2 >= 1; i2--)
            System.out.println(i2);
        System.out.println("Задание 3");
        int q;
        for (q = 0; q <= 17; q = q + 2)
            System.out.println(q);
        System.out.println("Задание 4");
        int w;
        for (w = 10; w >= -10; w--)
            System.out.println(w);
        System.out.println("Задание 5");
        for (int year = 1904; year < 2096; year = year + 4)
            System.out.println(year + " год является високосным");
        System.out.println("Задание 6");
        for (int a = 7; a <= 98; a = a + 7)
            System.out.println(a);
        System.out.println("Задание 7");
        int b;
        for (b = 1; b <= 512; b = b + b)
            System.out.println(b);
        System.out.println("Задание 8");
        int solary = 29000;
        int total = 0;
        for (i = 0; i <= 12; i++) {
            total = total + total/100;
            total = total + solary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }


    }

}