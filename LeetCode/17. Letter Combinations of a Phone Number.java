class Solution {
    
     public void lettercomb(String digits,List<String> res ,String numchars[],int i, String s){
            if(i == digits.length()){
                res.add(s);
                return;
            }
            String val = numchars[digits.charAt(i)-'0'];
            for(int j=0;j<val.length();j++){
                lettercomb(digits,res,numchars,i+1,s+val.charAt(j));
            }
        }
    
    public List<String> letterCombinations(String digits) {
           
        List<String> res = new ArrayList<>();
        
        if(digits.length() ==0){
            return res;
        }
        
        String[] numchars = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        lettercomb(digits,res,numchars,0,"");
        
        return res;
    }
}
