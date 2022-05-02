class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long left = 0;
 long right = x+1;
 
 while(left<right){
     long m = (left +(right-left)/2);
     if(m*m>x) 
     right =m;
     else 
     left = m+1;
 }
 return left-1;
	 }
}
