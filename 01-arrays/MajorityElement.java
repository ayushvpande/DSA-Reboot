class Solution {
    public int majorityElement(int[] nums) {

        int curr=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
            curr=nums[i];
            }
            if(curr==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
                
            }
            return curr;

        }
        
    }
