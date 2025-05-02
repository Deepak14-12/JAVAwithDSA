class SearchInsertLocation {
    public int searchInsert(int[] nums, int target) {
        int mind , left = 0 , right = nums.length-1;
        while(left <= right)
        {
            mid = (left + right)/2;
            if(mid == target)
            return mid ;
            if(target > nums[mid])
            left= mid+1;
            else
            right = mid-1;
        }
        return -1;
        
    }
}
