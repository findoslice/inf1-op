public class MultiplesLoopRange{
    public static void main(String[] args){
        for (int i = Integer.parseInt(args[0]); i < Integer.parseInt(args[1]); i++){
            if (i%(Integer.parseInt(args[2])) == 0){
                System.out.print(i*i + " ");
            }
        }
        System.out.println(" ");
    }
}