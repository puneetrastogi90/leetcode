class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int leastDiff = Integer.MAX_VALUE;
        int answer = 0;
       
                
        Arrays.sort(nums);
        
        for(int i =0;i<nums.length-2;i++){
        int lo = i+1;
        int hi = nums.length - 1;
        while(lo<hi){
            int sum = nums[lo]+nums[hi]+nums[i];
           if(sum>target){
               hi--;
           }else if(sum<target){
               lo++;
           }else{
               return sum;
           }
            
           if(Math.abs(sum - target)<leastDiff){
               leastDiff = Math.abs(sum - target);
               answer = sum;
           } 
            
        }}
        
        return answer;
        
    }
}
