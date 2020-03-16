public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i=1; i<=1000; i++) {
            if (i%3 == 0 && i%5 == 0) {
                sum = sum + i;
                System.out.println("Found number: " + i);
                if (++count == 5) {
                    break;
                }
            }
        }
        System.out.println(sum);
        System.out.println("---------------");

        int num = 1;
        boolean a = true;
        while(a = true) {
            System.out.println("Number is " + num);
            if (num%2 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
