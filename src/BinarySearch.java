public class BinarySearch {

  public   static  int binarysearch(int arr [] , int target){
      int start = 0;
     int  end  = arr.length-1;

     while(start <= end ){

         int mid  = (start + end)/2;

         // target mila toh
         if (arr[mid] == target){
             return mid;
         }
         // left side
         else if(arr[mid] > target){
             end  = mid - 1;
         }
         // right side
         else {
             start = mid + 1;
         }
     }
     return -1;
  }

  public  static void main(String[] args) {
        int arr [] = {1,3,5,7,9,11};
        int target = 7;

        int ans  = binarysearch(arr,target);

        if(ans != -1){
            System.out.println("Element found at index:  " + ans);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
