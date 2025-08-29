import java.util.*;

public class prime {
    public static void main(String[] args) {
        int n=36;
        System.out.println(isprime(n));
        
    }
    public static boolean isprime(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;

    }
    
}
