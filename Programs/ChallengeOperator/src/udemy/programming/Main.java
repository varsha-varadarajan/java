package udemy.programming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double firstDoubleVar = 20.0d;
        double secondDoubleVar = 80.0d;
        double res = (firstDoubleVar + secondDoubleVar) * 100.0d;
        System.out.println("Total" + res);
        double rem = res % 40.0d;
        boolean isRemainderZero = (rem == 0.0d) ? true : false;
        System.out.println(isRemainderZero);

        if(!isRemainderZero) {
            System.out.println("Got some remainder");
        }

        System.out.println(dummyMethod(5));
    }

    static int dummyMethod(int val) {
        return val * 10;
    }
}