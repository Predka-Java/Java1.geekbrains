package geekbrains.lesson_1;

public class PredkaHomeWork2 {

    public static void main(String[] args) {



    }


        public static boolean task1(int a, int b){
            int c = a + b ;
            if(c < 20 && c > 10) {
                return true;
            }
            else {
                return false;
            }

        }
        public static void task2(int d){
        if(d < 0){
            System.out.println("Отрицательное");
            }
        else {
            System.out.println("Положительное");
            }
        }
        public static boolean task3(int e) {
        e = 1000;
        if(e < 0){
            return true;
        }
        else {
            return false;
        }
        }
        public static void task4(String f, int j){
        for(int k = 0; k < j; k++){
            System.out.println(f);
        }
    }
            public static boolean newYear(int year ){ return ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0));
            }


    }



