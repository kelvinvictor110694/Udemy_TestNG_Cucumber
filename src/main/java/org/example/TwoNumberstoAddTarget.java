package org.example;

public class TwoNumberstoAddTarget {

    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15},9);
    }
        public static int[] twoSum(int[] nums, int target) {
            int [] result = new int[2];
            for(int i=0; i<nums.length-1; i++){
                for(int j=i+1;j< nums.length;j++){
                    if(nums[i]+nums[j]== target){
                        System.out.println(nums[i]+","+nums[j]);
                        return new int[]{i,j};
                    }
                }
            }
            return null;
        }
}
