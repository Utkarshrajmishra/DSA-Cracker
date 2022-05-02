class Solution{
public:
    int largePrime(long long n){
        // code here
       
        int c = 0;
        for(long long i = 2;i <= sqrt(n);i++){
            c = 0;
            while(n > 1 && n%i == 0){
                n /= i;
                c++;
            }
        }
        if(n > 2)
            return 0;
        if(c <= 1)
            return 0;
        return 1;
    
    }
};
