import java.util.*;
public class mergeTwoArray {
    public static void main(String[]arg){
        int[]a={1,3,5,7};
        int[]b={2,4,6,8};
        System.out.println(Arrays.toString(merge(a, b)));
    }
    public static int[] merge(int[]a,int[]b){
        int n=a.length;
        int m=b.length;
        int[]ans=new int[n+m];
        int i=0;int j=0;int k=0;
        while(i<n&&j<m){
            if(a[i]<b[j]){
                ans[k]=a[i];
                i++;
                k++;
            }else{
                ans[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k]=a[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=b[j];
            j++;
            k++;
        }
        return ans;

    }
    
}
