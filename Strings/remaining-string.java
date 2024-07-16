class Solution {
    public String printString(String s, char ch, int count) {
        int ch_count = 0,ch_index=0;
        if(s != ""){
            for(int i=0;i<s.length();i++){
              
                if(s.charAt(i) == ch){
                    ch_count++;
                    ch_index = i;
                    if(ch_count == count){
                    if(i == s.length() - 1){
                        ch_count = 0;
                        break;
                    }
                    else{
                        break;
                    }
                    }
                }
            }
            if(ch_count ==0){
                return "";
            }
            else if(ch_count == count){
                return s.substring(ch_index+1);
            }
            else{
                return "";
            }
        }
        return "";
    }
}
