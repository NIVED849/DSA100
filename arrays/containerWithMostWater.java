public class containerWithMostWater {
    public static void main(String[] args) {
        int[]arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
        
    }
    public static int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int ans=Integer.MIN_VALUE;
        while(i<j){
            int a=0;
            
            if(arr[i]<arr[j]){
                a=arr[i]*(j-i);
                i++;

            }
            else{
                a=arr[j]*(j-i);
                j--;
            }
            ans=Math.max(ans,a);


        }
        return ans;
        
    }
    
}
