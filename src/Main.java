public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        long[] spending = new long[5];
        spending[0] = 45838;
        spending[1] = 83978;
        spending[2] = 93834;
        spending[3] = 298393;
        spending[4] = 293893;
        long sumMonth = 0L;
        for (int i = 0; i < 5; i++) sumMonth += spending[i];
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей");
        //Task 2
        System.out.println("Task 2");
        int[] spendWeek = {23000, 9837, 14098, 25328, 17232};
        int maxSpend = -1;
        int minSpend = 30000;
        for (int i : spendWeek) {
            if (i > maxSpend) maxSpend = i;
            if (i < minSpend) minSpend = i;
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpend + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxSpend + " рублей");
        //Task 3
        System.out.println("Task 3");
        //Task 4
        System.out.println("Task 4");
        int[] spendWeek2 = {23061, 10837, 14698, 24328, 17792};
        long sumWeek = 0L;
        for (int i : spendWeek2) sumWeek += i;
        float MidSpendWeek = (float) sumWeek / 5;
        System.out.println("Средняя сумма трат за месяц составила " + MidSpendWeek + " рублей");
        //Task 5
        System.out.println("Task 5");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
    }
}