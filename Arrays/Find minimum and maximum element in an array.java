
/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        Pair <Long,Long> ll=new Pair<Long,Long>(a[0],a[n-1]);
        return ll;
    }
}
