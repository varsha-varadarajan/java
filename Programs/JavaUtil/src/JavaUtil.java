import java.util.*;

public class JavaUtil {
    public static void main(String args[]) {
        /*
        byte[] b = new byte[]{1,2,3,4};
        String s = new String(b);
        System.out.println(b);
        s.toCharArray();
        int i = 1;
        String.valueOf(i);
        */


        Stack<String> sta = new Stack<String>();
        String sentence = "Enjoy every moment of your life, Varsha!";

        StringTokenizer st = new StringTokenizer(sentence);
        while(st.hasMoreTokens()) {
            String word = st.nextToken();
            sta.push(word);
        }

        while(!sta.empty()) {
            System.out.println(sta.pop());
        }

        Integer a = Integer.valueOf("1");

        for(int i=0; i<5; i++) {
            System.out.println(Math.random());
        }

        Random rand= new Random();
        for(int i=0; i< 5; i++) {
            System.out.println(rand.nextInt(5));
        }

        String[] strA = new String[] {"varsha", "is", "a", "girl", "girl"};
        List<String> ls = new ArrayList<>();
        Collections.addAll(ls, strA);

        System.out.println(ls);
        for(String al: ls) {

        }

        ls.removeIf(s -> s.startsWith("i"));
        Set<String> s = new HashSet<>();
        s.addAll(ls);
        s.add(null);

        // HashSet<String> clonedSet = (HashSet<String>) s.clone();

        // s.retainAll(s);

        System.out.println(s);

        Collections.sort(ls);

        HashMap<Integer, String> hm = new HashMap<>();
        hm.putIfAbsent(1, "One");
        hm.putIfAbsent(2, "Two");
        hm.putIfAbsent(null, "Three");

        String sss = hm.get(1);
        System.out.println(sss);

        Set<Map.Entry<Integer, String>> hashset =  hm.entrySet();
        for(Map.Entry<Integer, String> m: hashset) {
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }
}
