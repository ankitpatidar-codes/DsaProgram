package Dsa;

public class FindMin {
    public  static void main(String[] args) {
       int arr [] =  {18, 7, 14, -3, 25, 35};
        System.out.println(findMin(arr));

    }
 // assume that arr.length  ! = 0
    //return the minimum value in the array 
    static int findMin(int arr []){
        int ans = arr[0];
        for(int i = 1; i<arr.length ; i++){
            if(ans > arr[i]){
                ans  = arr[i];
            }
        }
        return ans ;
    }
}
