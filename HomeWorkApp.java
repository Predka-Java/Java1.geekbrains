package geekbrains.lesson_1;

public class HomeWorkApp {

    public static void main(String[] args){

    }
        public static void printThreeWords () {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }


        public static void checkSumSign () {

            int a = 5;
            int b = 3;
            int c = a + b;
            if (c < 0) {
                System.out.println("Сумма отрицательная!");
            } else {
                System.out.println("Сумма положительная!");
            }
        }


        public static void printColor () {
            int value = 50;
            if (value <= 0) {
                System.out.println("Красный");
            }
            else if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }


        public static void compareNumbers () {

            int a = 5;
            int b = 8;
            if (a >= b) {
                System.out.println("a>=b");
            } else {
                System.out.println("a<b");
            }
        }

}

