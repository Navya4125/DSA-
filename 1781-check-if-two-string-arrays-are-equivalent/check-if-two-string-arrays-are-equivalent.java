class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        for(int i=0;i<word1.length;i++){
            s1.add(new String(word1[i]));
        }
        for(int i=0;i<word2.length;i++){
            s2.add(new String(word2[i]));
        }
        String st1 = String.join("",s1);
        String st2 = String.join("",s2);
        return st1.equals(st2);
    }
}