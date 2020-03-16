package udemy.programming;

public class CharBooleanString {
    public static void main(String args[]) {
        char a = Character.MIN_VALUE;
        char b = Character.MAX_VALUE;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        boolean x = true;
        boolean y = Boolean.FALSE;
        System.out.println(x);
        System.out.println(y);

        MyClass classVar = new MyClass();
        classVar.myVar = 1;

        if (classVar != null) {
            System.out.println("works");
        }

        boolean boolVar = true;
        if (boolVar = true) {
            System.out.println("Print");
        }
    }
}

class MyClass {
    int myVar;
}
