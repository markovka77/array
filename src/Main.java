import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("Задача 4");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] +", ");
            } else {
                System.out.print(numbers[i]+1 +", ");
            }
        }
    }


    private static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] <= numbers.length) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        double[] numbersWithComa = {1.57, 7.654, 9.986};
        for (int i = numbersWithComa.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbersWithComa[i] + ", ");
            } else {
                System.out.print(numbersWithComa[i]);
            }

        }
        System.out.println();
        int[] seasons = {1, 2, 3, 4};
        for (int i = seasons.length - 1; i >= 0; i--) {
            if (seasons[i] - 1 <= 0) {
                System.out.print(seasons[i]);
            } else {
                System.out.print(seasons[i] + ", ");
            }

        }
        System.out.println();
    }


    private static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numbers.length) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        double[] numbersWithComa = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbersWithComa.length; i++) {
            if (i + 1 != numbersWithComa.length) {
                System.out.print(numbersWithComa[i] + ", ");
            } else {
                System.out.print(numbersWithComa[i]);
            }

        }
        System.out.println();
        int[] seasons = {1, 2, 3, 4};
        for (int i = 0; i < seasons.length; i++) {
            if (i + 1 != seasons.length) {
                System.out.print(seasons[i] + ", ");
            } else {
                System.out.print(seasons[i]);
            }

        }
        System.out.println();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbersWithComa = {1.57, 7.654, 9.986};
        int[] seasons = {1, 2, 3, 4};
    }
}
