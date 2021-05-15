package org;

public class ArrayNumbers {
    public static void main(String[] args) {
        int num[] = {2, 5, 17, 28, 0, 5, 7, 9, 2, 57};
    }
        public static int sumEven(ArrayList <Integer> arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }
}

//    public static void main(String[] args) {
//        int num[] = {2, 5, 17, 28, 0, 5, 7, 9, 2, 57};
//        int sum = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 0) {
//                    evenSum = evenSum + 1;
//                    System.out.println(num[i]);
//                }
//            }
//        }
