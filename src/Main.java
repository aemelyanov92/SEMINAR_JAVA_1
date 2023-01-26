

//Task 1
//public class Main {
//    public static void main(String[] args) {
//
//        int n = 300;
//        double[] array = new double[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Math.random();
//        }
//
//        double max = array[0];
//        double min = array[0];
//        double avg = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i])
//                max = array[i];
//            if (min > array[i])
//                min = array[i];
//            avg += array[i] / array.length;
//        }
//
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);
//        System.out.println("avg = " + avg);
//    }
//}
//Task 2
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int [] mas = {13, 9, 10, 27, 5};
//
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mas.length-1; i++) {
//                if(mas[i] > mas[i+1]){
//                    isSorted = false;
//
//                    buf = mas[i];
//                    mas[i] = mas[i+1];
//                    mas[i+1] = buf;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(mas));
//    }
//}
//Task 3

public class Main {
    public static void main(String [] args) {
        int a = 2, b = 100;
        System.out.println("Простые числа в промежутке [2, 100]: ");
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}