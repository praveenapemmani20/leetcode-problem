class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            int a=i;
            if(isPrime(Integer.bitCount(a)))
            c++;
        }
        return c;
    }
    public boolean isPrime(int n){
        if(n<2)
        return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}