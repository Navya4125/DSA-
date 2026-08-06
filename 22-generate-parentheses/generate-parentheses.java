class Solution {
    List<String> ans = new ArrayList<>();
    public void gp(int n,int os,int cs,int idx,char[] a){
        if(idx==n){
            ans.add(new String(a));
            return;
        }
        if(os<n/2){
            a[idx]='(';
            gp(n,os+1,cs,idx+1,a);
        }
        if(cs<os){
            a[idx]=')';
            gp(n,os,cs+1,idx+1,a);
        }
    }
    public List<String> generateParenthesis(int n) {
         char[] b = new char[2*n];
         gp(2*n,0,0,0,b);
         return ans;

        
    }
}