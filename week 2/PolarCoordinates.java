public class PolarCoordinates{
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double R = Math.sqrt(x*x + y*y);
        System.out.println(R);
        double theta = Math.round(Math.acos(Math.sqrt(x*x/R*R))*10000)/10000;
        System.out.println(theta);
    }
}