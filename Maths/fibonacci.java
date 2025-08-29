import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        int n=5;
        while(n>0){
            System.out.print(fib(n)+" ");
            n--;

        }
        
        
    }
    public static int fib(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fib(n-1)+fib(n-2);

    }
    
}
