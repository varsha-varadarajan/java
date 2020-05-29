/*
 * @created 28/05/2020 - 07:32
 * @project OOPSChallenge96
 * @author Varsha Varadarajan
 */
public class Invoice {
    public static void printHamburgerInvoice(Hamburger h) {
        System.out.println("****** Your Invoice ******");
        System.out.println("Items ordered : " + h.getClass().getSimpleName());

        System.out.println("Base Price: $ " + h.getBasePrice());
        System.out.println("--------------------");
        System.out.println("Add Ons:");
        for (AddOn a: h.getAddOns()) {
            System.out.println(a.getName() + " : $ " + a.getPrice());
        }
        System.out.println("--------------------");
        System.out.println("Total Price: $" + h.getTotalPrice());
    }
}
