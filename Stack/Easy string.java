class Solution 
{ 
    String transform(String S) 
    {
        // code here
     
           S=S.toLowerCase();    
         int count=1;
       StringBuilder strb=new StringBuilder();
       int i=0;
       for(i=1;i<S.length();i++)
       {
           if(S.charAt(i)==S.charAt(i-1))
           {
               count++;
           }
       
           else
           {
               strb.append((count+"")+S.charAt(i-1));
               count=1;
           }
       }
       
       if(i-1==S.length()-1)
       {
           strb.append((count+"")+S.charAt(i-1));
       }
       
       return strb.toString();
    }
} 
