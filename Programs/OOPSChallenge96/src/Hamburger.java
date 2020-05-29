import java.util.ArrayList;
import java.util.List;

/*
 * @created 28/05/2020 - 06:59
 * @project OOPSChallenge96
 * @author Varsha Varadarajan
 */
public class Hamburger {
    private int NUM_OF_ADDITIONS = 4;
    private String breadRollType;
    private boolean meat;
    private double price;
    private List<AddOn> addOns;

    public Hamburger(String breadRollType, boolean meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.addOns = new ArrayList<AddOn>();
    }

    public int getNUM_OF_ADDITIONS() {
        return this.NUM_OF_ADDITIONS;
    }

    public double getBasePrice() {
        return this.price;
    }

    public double getTotalPrice() {
        return this.price + calculateAddOnPrice();
    }

    public List<AddOn> getAddOns() {
        return this.addOns;
    }

    private double calculateAddOnPrice() {
        double sum = 0.0;
        for(AddOn addOn: addOns) {
            sum += addOn.getPrice();
        }
        return sum;
    }

    public boolean addCarrot() {
        return this.addAddOn(1);
    }

    public boolean addLettuce() {
        return this.addAddOn(2);
    }

    public boolean addMayo() {
        return this.addAddOn(4);
    }

    public boolean addIndianSauce() {
        return this.addAddOn(3);
    }

    private boolean addAddOn(int type) {
        if (this.addOns.size() < NUM_OF_ADDITIONS) {
            if (type == 1) {
                this.addOns.add(new AddOn("Carrot", 1.5));
            } else if (type == 2) {
                this.addOns.add(new AddOn("Lettuce", 1.5));
            } else if (type == 3) {
                this.addOns.add(new AddOn("Indian Sauce", 1.5));
            } else if (type == 4){
                this.addOns.add(new AddOn("Mayo", 1.5));
            }
            return true;
        } else {
            return false;
        }
    }
}
