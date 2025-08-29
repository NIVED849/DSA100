import java.util.*;
public class reverseAString{
    public static void main(String[]arg){
        String s="hello world";
        System.out.println(reverse(s));

    }
    public static String reverse(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans=ch+ans;

        }
        return ans;


    }

    


} 