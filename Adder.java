public class Adder{
    public static void main(String[] args){
        int sum = 0;
        String summy;
        for (int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println( "The sum is: " + sum);
    }
}