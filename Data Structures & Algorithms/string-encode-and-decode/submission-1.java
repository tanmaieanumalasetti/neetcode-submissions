class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            if(s==null)s="";                 
                sb.append(s.length()).append('#').append(s);          
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        if(str==null || str.length()==0) return res;
        int i=0;
        while(i<str.length()){
            int j=i;
        
        while(str.charAt(j)!='#'){
            j++;
        }
        int length = Integer.parseInt(str.substring(i,j));
        String word = str.substring(j+1, j+1+length);
        res.add(word);
        i = j+1+length;
        
        }
        return res;
    }
}
