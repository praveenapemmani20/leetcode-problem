class Find_subarrays_with_equal_sum {
public:
    bool findSubarrays(vector<int>& nums) {
        int i,j;
        for(int i=0;i<nums.size()-2;i++){
            for(int j=i+1;j<nums.size()-1;j++){
                if(nums[i]+nums[i+1]==nums[j]+nums[j+1]){
                    return true;
                }
            }
        }
        return false;
    }
};