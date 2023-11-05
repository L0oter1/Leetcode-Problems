class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        int previous = 0;
        for (int i = s.length(); i > 0; i--){
            int temp = 0;
            if (s.substring(i-1, i).equals("I")){
                temp = 1;
            }
            else if (s.substring(i-1, i).equals("V")){
                temp = 5;
            }
            else if (s.substring(i-1, i).equals("X")){
                temp = 10;
            }
            else if (s.substring(i-1, i).equals("L")){
                temp = 50;
            }
            else if (s.substring(i-1, i).equals("C")){
                temp = 100;
            }
            else if (s.substring(i-1, i).equals("D")){
                temp = 500;
            }
            else{
                temp = 1000;
            }
            if (i != 0){
                if (temp < previous){
                    answer -= temp;
                    previous = temp;
                }
                else {
                    answer += temp;
                    previous = temp;
                }
            }
        }
        return answer;
    }
}
