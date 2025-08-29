import java.util.*;

public class vowelscount {
    public static void main(String[] args) {
        HashSet<Character>set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        String s="nived";
        System.out.println(vowel(s,set));
        
    }
    public static int vowel(String s,HashSet<Character>set){
        int c=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(set.contains(a)){
                c++;
            }
        }
        return c;
    }
    
}
