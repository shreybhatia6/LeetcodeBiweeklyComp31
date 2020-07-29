import java.util.HashSet;

public class Question3 {
    public int numSplits(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++){
            String first;
            String second;
            first = s.substring (0,i);
            second = s.substring (i, s.length());
            if (helperFunction (first, second)){
                count++;
            }
        }
        return count;

    }
    private static boolean helperFunction (String first, String second){
        HashSet <Character> hs1 = new HashSet <Character>();
        HashSet <Character> hs2 = new HashSet <Character>();


        for (int i =0; i <first.length(); i++){
            if (!hs1.contains(first.charAt(i))){
                hs1.add(first.charAt(i));
            }
        }
        for (int i =0; i <second.length(); i++){
            if (!hs2.contains(second.charAt(i))){
                hs2.add(second.charAt(i));

            }
        }
        if (hs1.size() == hs2.size())
            return true;
        return false;
    }
}