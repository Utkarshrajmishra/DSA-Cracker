class Solution {
    public int maxProduct(String[] words) {
        int[] check = new int[words.length];
        int max=0;
        for(int i=0;i<words.length;i++)
        {
            int num=0;
            for(int j=0;j<words[i].length();j++)
            {
                int x=words[i].charAt(j) -'a';
                num|= 1<<x;
                
            }
            check[i] = num;
        }
        
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if((check[i]&check[j]) == 0)
                {
                    max = Math.max(max,words[i].length() * words[j].length());
                }
            }
        }
                
        return max;
    }
}
