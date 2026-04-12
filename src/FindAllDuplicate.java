
import java.util.*;
import java.util.List;
import java.util.ArrayList;


public class FindAllDuplicate {

    public static List<Integer> findDuplicate(int nums []  ){

        int i = 0;
        while( i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {

                // swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            } else {
                i++;
            }
        }

        List<Integer> ans  = new ArrayList<>() ;
            for(int index = 0; index<nums.length; index++){
                if(nums[index] != index+1){
                    ans.add(nums[index]);

                }
            }
            return ans ;

        }


     public static void main(String[] args) {

        int arr [] = {4,3,2,7,8,2,3,1};
         List<Integer> result = findDuplicate(arr);
         System.out.println(result);

    }

}