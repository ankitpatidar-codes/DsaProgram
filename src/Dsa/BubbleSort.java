package Dsa;
public class BubbleSort {

    public void bubbleSort(int arr []){
        for(int  i= 0; i < arr.length-1 ; i++){
            for(int j = 0 ; j <arr.length-i-1;j++){

                if (arr[j] > arr[j+1]) {

                        //swap
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void printArray(int arr[]){
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }


     public static void main(String[] args) {

         int arr[] = {7, 8, 3, 1, 2};

         BubbleSort a = new BubbleSort();
         a.bubbleSort(arr);
         a.printArray(arr);




     }

    }

