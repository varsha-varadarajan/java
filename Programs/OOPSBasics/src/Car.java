import java.util.List;
import java.util.ArrayList;

public class Car {
    private String model;
    private double height;
    private List<Integer> listCar = new ArrayList();

    public Car() {
        // this("Default Model", 0.0);
    }

    public Car(String model, double height) {
        this.model = model;
        this.height = height;

    }

    public List<Integer> getListCar() {
        return listCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
