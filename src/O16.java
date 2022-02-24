public class O16 {
    public double myPow(double x, int n) {
        if (equals0(x) && n < 0) return 0;
        double res;
        long currE = n;
        if (currE < 0) currE = -currE;
        res = pow(x, currE);
        return n > 0 ? res : 1.0 / res;
    }

    private double pow(double x, long n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;
        double ans = pow(x, n >> 1);
        ans *= ans;
        if ((n & 1) == 1) ans *= x;
        return ans;
    }

    private boolean equals0(double a) {
        return a - 0.0 < 0.00001 && a - 0.0 > -0.00001;
    }
}