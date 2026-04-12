public class FindRepeadedNumber {

    public  static int  sort(int arr []){
        int i = 0;
        while( i < arr.length){

            if(arr[i] != i+1){
                int currect = arr[i] - 1;
                if(arr[i] != arr[currect]){
                    // swap
                   // swap(arr, i , currect);
                    int temp = arr[i];
                    arr[i]  = arr[currect];
                    arr[currect] = temp;
                }
                else {
                    return arr[i];
                }

            }
            else{
                i++;
            }
        }
        return -1;
    }
//    static void swap(int arr [] , int first , int second){
//        int temp = first;
//        first = second ;
//        second  = temp ;
//    }

    public static void main(String[] args) {

        int arr []  = {1,3,4,2,2};
        int ans  = sort(arr);
        System.out.println(ans);


    }
}
