package Dsa;
import java.util.Scanner;

public class LinearSearch {

    static int linear(int target , int arr []){

        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i<arr.length ; i++){
            int element = arr[i];
            if(element == target){
                return target;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr [] = new int[n];

        System.out.println("Enter "+ n + " elements");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element vlaue to compare");
        int target = sc.nextInt();



        int ans  = linear(target , arr);
        System.out.println(ans);
    }

}
