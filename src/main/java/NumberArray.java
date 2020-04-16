public class NumberArray {
        public static void main(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                System.out.println(array[i]);
            }
        }
    }

    //Input Array Numbers & Number N
    public static void main(String[] args) {
        int array[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        main(array, 500);   
    }
}
