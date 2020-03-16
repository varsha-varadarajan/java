public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }

        long hr = minutes/60;
        long min = minutes%60;
        String result = "";
        if (hr < 10) {
            result = result + "0" + hr + "h ";
        } else {
            result = result + hr + "h ";
        }
        if (min < 10) {
            result = result + "0" + min + "m ";
        } else {
            result = result + min + "m ";
        }
        if (seconds < 10) {
            result = result + "0" + seconds + "s";
        } else {
            result = result + seconds + "s";
        }
        return result;
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }
        return getDurationString(seconds/60, seconds%60);
    }
}
