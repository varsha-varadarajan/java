import java.util.List;

/*
 * @created 28/05/2020 - 07:04
 * @project OOPSChallenge96
 * @author Varsha Varadarajan
 */
public class AddOn {
    private String name;
    private double price;

    public AddOn(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
