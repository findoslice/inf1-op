public class DateFashion{
    public static int dateFashion(int you, int date){
        if ((you >= 8 || date >= 8) && (you > 2 && date > 2)){
            return 2;
        }
        if ((you < 8 && you > 2) && (date < 8 && date > 2)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        int x = dateFashion(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println(x);
    }

}