class Solution {
    public int maxProduct(int[] nums) {
        int preffix=1;
        int suffix=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums.length;
            if(preffix==0){
                preffix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            preffix=nums[i]*preffix;
            suffix=nums[n-i-1]*suffix;
            ans=Math.max(ans,Math.max(preffix,suffix));
            
        }
        return ans;
        
    }
}
