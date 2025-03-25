class Largest_positive_integer_that_exists_with_its_negative {
public:
    int findMaxK(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int left=0,right=nums.size()-1;
        while(nums[left]<0&&nums[right]>0){
            int sum=nums[left]+nums[right];
            if(sum>0){
                right--;
            }
            if(sum<0){ left++;}
            if(sum==0){return nums[right];}
            
        }
        return -1;
    }
};