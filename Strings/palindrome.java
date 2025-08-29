import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        String s="nived";
        if(s.equals(rev(s))){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        

    }
    public static String rev(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans=ch+ans;
        }
        return ans;
    }
    
}
