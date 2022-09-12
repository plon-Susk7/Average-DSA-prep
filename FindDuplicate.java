class Solution {
    public int findDuplicate(int[] nums) {
        int arr[] =new int[nums.length+1];
        
        int res=0;
        for(int i =0;i<nums.length;i++){
            int c = nums[i];
            arr[c]+=1;
            if(arr[c]>=2){
                res = c;
                break;
            }
        }
        
        return res;
    }
}

