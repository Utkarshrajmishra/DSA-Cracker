class Solution{
    public String removeConsecutiveCharacter(String S){
        String stu="";
        for(int i=0;i<S.length()-1;i++)
        if(S.charAt(i)!=S.charAt(i+1))
        {
            stu+=S.charAt(i);
        }
           stu+=S.charAt(S.length()-1);
       return stu;
        
        
    }
}
