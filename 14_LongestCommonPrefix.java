class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        int lengths = strs[0].length();
        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() <= lengths){
                lengths = strs[i].length();
            }
        }

        int x = 0;
        while (x < lengths){
            int yes = 0;
            for (int y = 0; y < strs.length - 1; y++){
                if (strs[y].substring(x, x+1).equals(strs[y+1].substring(x, x+1))){
                    yes++;
                }
            }
            if (yes == strs.length - 1){
                    output = output + strs[0].substring(x, x+1);
            }
            else {
                return output;
            }
            x++;
        }
        return output;
        
    }
}
