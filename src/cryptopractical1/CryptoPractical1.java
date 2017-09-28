package cryptopractical1;
public class CryptoPractical1 {
    public static void main(String[] args) {
        //UserWindow uw = new UserWindow();
    }
    
    static int modp(int x, int y, int m)
    {
        return Math.abs((x+y) % m);
    }
    
    static int modm(int x, int y, int m)
    {
        return Math.abs(((x % m) * (y % m)) % m);
    }
    
    static int modd(int x, int y, int m)
    {
        return Math.abs(((x % m) * (inverse(y, m) % m)) % m);
    }
    
    static int inverse(int x, int m)
    {
        x = x%m;                    //ensure x is lowest possible mod.
        for(int i = 1; i < m; i++)  //check each n below the mod to find an 
            if((x*i) % m == 1)      //inverse if it exists.
                return i;           //if the mod of x * i is 1, return i.
        return Integer.MAX_VALUE;   //this is hacky, if it doesnt have inverse,
                                    //return max value of an int so it's obvious
    }
}