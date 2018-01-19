public class SquaresLoop{
    public static void main(String[] args){
        for (int i = Integer.parseInt(args[0]); i < Integer.parseInt(args[1]); i++){
            System.out.print(i*i + " ");
        }
        System.out.println(" ");
    }
}