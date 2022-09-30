public class EvenOdd {
    public static void main(String[] args) {
        int a = 0;
        int n = 100;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println("even number" + i);
            else {
                System.out.println("odd number" + i);
            }
        }
    }

}
