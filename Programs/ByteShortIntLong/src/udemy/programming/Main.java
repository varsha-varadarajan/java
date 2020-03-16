package udemy.programming;

public class Main {

    public static void main(String[] args) {
	    int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        System.out.println("Max : " + maxInt);
        System.out.println("Min : " + minInt);
        System.out.println("Max works : " + (maxInt + 1));
        System.out.println("Max works? : " + ((long)maxInt+1));

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Min short : " + minShort);
        System.out.println("Max short : " + maxShort);
        System.out.println("Max short works? " + (maxShort+1));

        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 30;
        long longVal = 50000L + 10L * (byteVal + shortVal + intVal);
        System.out.println(longVal);
    }
}
