public class QuadraticSolver{
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        if (b*b-4*a*c >= 0){
            double root1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            double root2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println(root1 + "\n" + root2);
        }
        else{
            System.out.println("computer says no");
        }
    }
}