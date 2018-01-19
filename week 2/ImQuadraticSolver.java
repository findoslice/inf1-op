public class ImQuadraticSolver{
    public static void main(String[] args){
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        float c = Float.parseFloat(args[2]);


        if(a == 0){
            double root = -c/b;
            System.out.println(root);
        } else if (b*b - 4*a*c >= 0){
            double root1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            double root2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println(root1 + "\n" + root2);
        } else{
            double realroot = -b/2*a;
            double imroot = Math.sqrt(Math.abs(b*b-4*a*c))/2*a;
            System.out.println(realroot + " + " + imroot + "i");
            System.out.println(realroot + " - " + imroot + "i");
        }
    }
}