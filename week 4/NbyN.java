public class NbyN{
    public static void nbyn(int N){
        for (int i = 0; i <= N; i++){
            for (int j = 0; j <= N; j++){
                if (j == i){
                    System.out.print(Integer.toString(j) + " ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        nbyn(Integer.parseInt(args[0]));
    }
}