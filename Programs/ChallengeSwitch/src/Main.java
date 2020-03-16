public class Main {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        switch(a) {
            case 'A':
                System.out.println("Value is A");
            default:
                System.out.println("Default value");
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value is " + a);
                break;
            // default:
               // System.out.println("Not these values");
        }

        String s = "january";
        switch(s) {
            case "january":
                System.out.println("jan month");
                break;
            default:
                System.out.println("others");
        }

        System.out.println(getDaysInMonth(2, 2020));
        System.out.println((long)Math.sqrt(26));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year% 4 == 0 && year%100!=0) {
            return true;
        }
        if (year%400 == 0) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 0;
        }
    }

}
