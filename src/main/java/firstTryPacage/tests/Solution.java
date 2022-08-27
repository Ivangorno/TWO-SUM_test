package firstTryPacage.tests;

import java.util.Scanner;
import  java.util.HashMap;


   public class Solution {


       public static void main(String[] args) {
         int[] mainArray = {9,3,4,5};
          // twoSum( mainArray, 9 );
         int[] forPrintIndex =   twoSum( mainArray, 9 );

           printIndexes(forPrintIndex);


                  }
       public static int[] twoSum(int[] nums, int target) {
           //додав тут static для підтягування в main, але в завданні це public int[] (без static)

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

       private static void printIndexes(int[] forPrintIndex) {
            for (int i = 0; i <forPrintIndex.length; i++) {
               System.out.println(forPrintIndex[i] );
                       }
           System.out.println();

       }


   }






