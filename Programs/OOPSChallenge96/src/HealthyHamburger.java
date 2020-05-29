/*
 * @created 28/05/2020 - 07:00
 * @project OOPSChallenge96
 * @author Varsha Varadarajan
 */
public class HealthyHamburger extends Hamburger {
    private int NUM_OF_ADDITIONS;

    public HealthyHamburger(boolean meat, double price) {
        super("brown rye", meat, price);
        this.NUM_OF_ADDITIONS = super.getNUM_OF_ADDITIONS() + 2;
    }

    public boolean addSpinach() {
        return this.addAddOn(1);
    }

    public boolean addEgg() {
        return this.addAddOn(2);
    }

    private boolean addAddOn(int type) {
        if (this.getAddOns().size() < NUM_OF_ADDITIONS) {
            if (type == 1) {
                this.getAddOns().add(new AddOn("Spinach", 1.5));
            } else if (type == 2) {
                this.getAddOns().add(new AddOn("Egg", 1.5));
            }
            return true;
        } else {
            return false;
        }
    }
}
