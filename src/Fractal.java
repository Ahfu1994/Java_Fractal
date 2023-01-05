public class Fractal
{
    public int numer, denom;
    public Fractal reduce()
    {
        Fractal result = new Fractal();
        result.numer = numer;
        result.denom = denom;
        int gcd = GCD(result.numer , result.denom);
        result.numer /= gcd;
        result.denom /= gcd;
        return result;
    }
    public Fractal add(Fractal f)
    {
        Fractal result = new Fractal();
        result.numer = numer* f.denom + denom*f.numer;
        result.denom = denom*f.denom;
        int gcd = GCD(result.numer , result.denom);
        result.numer /= gcd;
        result.denom /= gcd;
        return result;
    }
    public Fractal sub(Fractal f)
    {
        Fractal result = new Fractal();

        result.numer = numer*f.denom-denom* f.numer;
        result.denom = denom*f.denom;
//        int gcd = GCD(result.numer , result.denom);
//        result.numer /= gcd;
//        result.denom /= gcd;
        return result;
    }
    public Fractal mul(Fractal f)
    {
        Fractal result = new Fractal();
        result.numer = numer*f.numer;
        result.denom = denom*f.denom;
        int gcd = GCD(result.numer , result.denom);
        result.numer /= gcd;
        result.denom /= gcd;
        return result;
    }
    public static int GCD(int a, int b)
    {
        if (a<0&&b<0)
        {
            a = a*(-1);
            b = b*(-1);
        }
        if (a>b)
        {

        }
        else
        {
            int t = a;
            a = b;
            b = t;
        }
        while (b>0)
        {
            a = a%b;
            int t = a;
            a = b;
            b = t;
        }
        return a;
    }
}
