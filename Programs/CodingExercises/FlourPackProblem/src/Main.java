/*
Coding Exercise - 24 - Flour Pack Problem
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(0,5,6));
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(2,1,5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int i = 0;
        for (i=0; i<bigCount; i++) {
            if ((i+1)*5 <= goal) {
                continue;
            } else {
                break;
            }
        }
        if (i*5 > goal) {
            i--;
        }

        if (goal - (i*5) <= smallCount) {
            return true;
        }
        return false;
    }
}
