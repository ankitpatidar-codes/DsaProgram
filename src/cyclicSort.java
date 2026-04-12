public class cyclicSort {

    public static void sort(int arr [] ){

        int i = 0;

        while(i < arr.length){

            int correct = arr[i] -1;

            if(arr[i] != arr[correct]){

                // swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }
    }
    public static  void print(int arr []) {
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

   public static void main(String[] args) {

        int arr [] = {3,5,2,1,4};

         sort(arr);
         print(arr);

    }
}
