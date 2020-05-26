import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getHeight());
        System.out.println(c.getModel());
        List<Integer> list = c.getListCar();
        list.add(6);
        System.out.println(list);
    }
}
