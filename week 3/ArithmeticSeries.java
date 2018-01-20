public class ArithmeticSeries{
    public static void main(String[] args){
        int max = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= max; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}