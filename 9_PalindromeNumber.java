class Solution {
    public boolean isPalindrome(int x) {
        int digits = 0;
        int y = x;

        if (x < 0){
            return false;
        }
        else if (x == 0){
            return true;
        }
        else {
            while (y > 0){
            y = y / 10;
            digits ++;
            }

            while (digits > 1){
                if (x % 10 == (int)(x / Math.pow(10, digits-1))){
                    x = (x - ((x % 10) * (int)Math.pow(10, digits - 1))) /10;
                    digits -= 2;
                }
                else {
                    return false;
                }
            }

            return true;

        }

    }
}
