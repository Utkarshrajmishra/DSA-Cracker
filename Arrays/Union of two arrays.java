class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet <Integer> ll=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            ll.add(a[i]);
        }
        int counter=0;
        for(int i=0;i<m;i++)
        {
           ll.add(b[i]);
        }
       return ll.size();
    }
}
