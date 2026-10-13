class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c= s.toCharArray();
        Arrays.sort(c);
        String cs = new String(c);
        char[] c1= t.toCharArray();
        Arrays.sort(c1);
        String c1s = new String(c1);
        if(c1s.equals(cs)){
            return true;
        }
        else{
return false;
        }
        
    }
}
