public class HomeWorkApp {
    public static void main(String args[]) {
            boolean c = sum10And20(10, 9);
            System.out.println(c);
            plusMinus(-5);
            System.out.println(plusMinusTwo(100));
            wordAndNumber("Goodbay", 10);
            // yearLeap(1984);
        }

        public static boolean sum10And20(int a, int b) {
            return (a + b) >= 10 && (a + b) <= 20;
        }

        public static void plusMinus(int x) {
            if (x >= 0) {
                System.out.println("Число x положительное");
            } else {
                System.out.println("Число х отрицательное");
            }
        }

        public static boolean plusMinusTwo (int x) {
            if (x < 0) {
                return true;
            } else {
                return false;
            }
        }
        public static void wordAndNumber (String str, int x) {
            for (int y = 0; y < x; y++) {
                System.out.println(str);
            }
        }
        //Задача со * не решена
//    public static boolean yearLeap (int x) {
//        if (x / 4 && x /100 || x / 400) {
//            return true;
//        } else
//            return false;
//
}
