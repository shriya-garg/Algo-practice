class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if(ch!='#'){
                s1.append(ch);
            }else if(s1.length()!=0){
                s1.deleteCharAt(s1.length()-1);
            }
        }
        
        for(char ch : t.toCharArray()){
            if(ch!='#'){
               s2.append(ch);
            }else if(s2.length()!=0){
                s2.deleteCharAt(s2.length()-1);
            }
        }
        
        return (s1.toString().equals(s2.toString()));
    }
}