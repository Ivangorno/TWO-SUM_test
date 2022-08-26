package firstTryPacage.tests;

import java.util.Scanner;
import  java.util.HashMap;


   public class Solution {
      // int[] mainArray = {9,3,4,5};

       public static void main(String[] args) {
         int[] mainArray = {9,3,4,5};
           twoSum( mainArray, 7 );


                  }
       public static int[] twoSum(int[] nums, int target) {

           int[] rightIndexes = new int[2];

       HashMap<Integer, Integer> correctNumbers = new HashMap<>();
           for (int i = 0; i < nums.length; i++) {
               correctNumbers.put(nums[i], i);
                   }

              for (int i = 0; i < nums.length; i++) {
                       int secondNumber = target - nums[i];
                       Integer secondIndex = correctNumbers.get(secondNumber);

                       if ( secondIndex != null &&  secondIndex != i ) {
                           rightIndexes[0] = i;
                           rightIndexes[1] = secondIndex;
                         return rightIndexes;
                       }
              }

           return rightIndexes;
       }



   }






