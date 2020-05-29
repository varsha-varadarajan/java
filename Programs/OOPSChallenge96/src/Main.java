import java.util.Scanner;

/*
 * @created 28/05/2020 - 06:58
 * @project OOPSChallenge96
 * @author Varsha Varadarajan
 */
public class Main {
    public static void main(String[] args) {
        placeOrder();
    }

    public static void placeOrder() {
        int choice = 0;

        System.out.println("Welcome to VV's burger corner");
        System.out.println("What would you like to order today ? Enter your choice");
        System.out.println("1. VV's hamburger \n2. Healthy Hamburger \n3. Deluxe Hamburger");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 3) {
                Hamburger h;
                switch (choice) {
                    case 1: h = new Hamburger("Base type", true, 5);
                            break;
                    case 2: h = new HealthyHamburger(true, 5);
                            break;
                    case 3: h = new DeluxeHamburger(true, 7.5);
                            break;
                    default: h = new Hamburger("Default", true,0);
                            break;
                }

                if (choice == 1) {
                    boolean addSuccessful = true;

                    while (addSuccessful && choice != 5) {
                        System.out.println("\nSelect addons. Enter your choice");
                        System.out.println("1. Carrots \n2. Lettuce \n3. Mayo \n4. Indian Sauce \n5. Done");
                        System.out.println("Choice: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1: addSuccessful = h.addCarrot();
                                    break;
                            case 2: addSuccessful = h.addLettuce();
                                    break;
                            case 3: addSuccessful = h.addMayo();
                                    break;
                            case 4: addSuccessful = h.addIndianSauce();
                                    break;
                            case 5: break;
                        }
                    }

                    if (!addSuccessful) {
                        System.out.println("Exceeded number of addons");
                    }
                } else if (choice == 2) {
                    boolean addSuccessful = true;

                    while (addSuccessful && choice != 7) {
                        System.out.println("\nSelect addons. Enter your choice");
                        System.out.println("1. Carrots \n2. Lettuce \n3. Mayo \n4. Indian Sauce \n5. Spinach \n6. Egg \n7. Done");
                        System.out.println("Choice: ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1: addSuccessful = ((HealthyHamburger)h).addCarrot();
                                break;
                            case 2: addSuccessful = ((HealthyHamburger)h).addLettuce();
                                break;
                            case 3: addSuccessful = ((HealthyHamburger)h).addMayo();
                                break;
                            case 4: addSuccessful = ((HealthyHamburger)h).addIndianSauce();
                                break;
                            case 5: addSuccessful = ((HealthyHamburger)h).addSpinach();
                                break;
                            case 6: addSuccessful = ((HealthyHamburger)h).addEgg();
                                break;
                            case 7: break;
                        }
                    }

                    if (!addSuccessful) {
                        System.out.println("Exceeded number of addons");
                    }
                }
                Invoice.printHamburgerInvoice(h);
            } else {
                System.out.println("Enter a valid choice");
            }
            sc.nextLine();
        } else {
            System.out.println("Enter a number");
        }

    }
}
