/*
 * @created 28/05/2020 - 07:00
 * @project OOPSChallenge96
 * @author Varsha Varadarajan
 */
public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger(boolean meat, double price) {
        super("Deluxe bread", meat, price);
        this.initializeAddOns();
    }

    private void initializeAddOns() {
        this.getAddOns().add(new AddOn("Chips", 2));
        this.getAddOns().add(new AddOn("Drink", 3));
    }
}
