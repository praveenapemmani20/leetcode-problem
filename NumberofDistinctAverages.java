class NumberofDistinctAverages {
public:
    int distinctAverages(vector<int>& nums) {
        unordered_set<double>set;
        sort(nums.begin(), nums.end());
        int n=nums.size();
        if(nums.size()==2){
            return 1;
        }
            for(int i=0;i<n/2;i++){
                 double avg=(nums[i]+nums[n-i-1])/2.0;
                 set.insert(avg);
            }
            return set.size();
    }
};