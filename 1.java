class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        int[] result = {0,0};

        while(i != nums.length){
            while(j != nums.length){
                if( (nums[i] + nums[j] ) == target ){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                j++;
            }
            i++;
            j = i +1;
        }
        return result;
    }
}
