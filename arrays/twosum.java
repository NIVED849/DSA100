import java.util.*;

public class twosum {
    public static void main(String[] args) {
        int k=9;
        int[]arr={2,7};
        System.out.println(check(arr, k));

        
        
    }
    public static boolean check(int[]arr,int k){
        HashSet<Integer>ans=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int a=k-arr[i];
            if(ans.contains(arr[i])){
                return true;
            }
            ans.add(a);
            
        }
        return false;

    }
    
    
}
