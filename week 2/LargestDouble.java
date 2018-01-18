public class LargestDouble{
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        if (a < b){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}