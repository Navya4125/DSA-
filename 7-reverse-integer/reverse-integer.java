class Solution {
    public int reverse(int x) {
        int a = x;
        int sum = 0;
        while(a!=0){
            int rem = a%10;
            a = a/10;
            if(sum<Integer.MIN_VALUE/10 || sum==Integer.MIN_VALUE && rem <-8) return 0;
            if(sum>Integer.MAX_VALUE/10  || sum == Integer.MAX_VALUE && rem>7) return 0;
            sum = sum*10+rem;
        
        }
        return sum;
    }
}