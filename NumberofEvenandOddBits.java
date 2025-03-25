class NumberofEvenandOddBits {
public:
    vector<int> evenOddBit(int n) {
     int even=0,odd=0;
     while(n){
        odd+=n&1;
        n>>=1;
        even+=n&1;
        n>>=1;
     }   
     return { odd,even}; 
    }
};