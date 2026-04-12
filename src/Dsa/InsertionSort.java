package Dsa;
import java.util.*;

public class InsertionSort {

    public  static void sortArray(int arr [] ){

        for(int i = 0 ; i < arr.length -1 ; i++){

            for(int j = i+1; j > 0 ; j--){
                if(arr[j] < arr[j-1]){

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }

        }
    }
    public static void print(int arr []){
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int  arr [] = {5,3,4,1,2};

         sortArray(arr);
         print(arr);

      //  Array ko readable format me print karo
       // System.out.println(Arrays.toString(arr));



    }
}
