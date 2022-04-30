class Solution {
    public int[] plusOne(int[] digits) {
           int len = digits.length-1;
        
        
        for(int i=len; i>=0; i--){ 
            if(digits[i] == 9){ 
                digits[i] = 0;
            }else{
                digits[i] = digits[i] + 1; 
                return digits;
            }
        }
        
        if(digits[0] == 0){ 
            digits = new int[len+2]; 
            digits[0] = 1;
        }
        
        return digits;

    }
}
