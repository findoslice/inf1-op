public class NMax{
    public static int max(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }
        else if (b > a && b > c){
            return b;
        }
        return c;
    }
    public static double max(double a, double b, double c){
        if (a > b && a > c){
            return a;
        }
        else if (b > a && b > c){
            return b;
        }
        return c;
    }
}