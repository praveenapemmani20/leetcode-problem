class Palindrome{
    public boolean isPalindrome(int x) {
        int sum=0;
        int a=x;
        if(x<0)
        return false;
        while(x!=0)
            {
                int r=x%10;
                sum=sum*10+r;
                x=x/10;
            }
            if(a==sum)
                return true;
                else
                return false;
    }
}