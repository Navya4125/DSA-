class Solution {
    public int countDigits(int num) {
        int sum = 0;
        int a = num;
        while(num>0){
            int val = num%10;
            if(a%val==0){
                sum++;
            }
            num = num/10;
        }
      return sum;  
    }
}