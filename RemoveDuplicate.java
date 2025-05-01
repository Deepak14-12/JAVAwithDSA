//leetcode question
//remove duplicate and return number of unique elemngts from array.
class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
    if(nums.length == 0) return 0;
     
     int i =1 ;

    for(int j = 1; j<nums.length; j++){
        if(nums[j] != nums[i-1]){
            nums[i] = nums[j];
            i++;
        }
    }     
     return i;    
    }
}
