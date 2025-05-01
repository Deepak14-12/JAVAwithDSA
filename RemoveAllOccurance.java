//leetcode question no. 27 from array
//que. remove all occurance of a fiven value from the array
class RemoveAllOccurance {
    public int removeElement(int[] nums, int val) {
     int k = 0;
     for(int i =0; i <nums.length; i++){
        if(nums[i]!=val){
          nums[k] = nums[i];
          k++;
        }
     } 
     return k;  
    }
}
