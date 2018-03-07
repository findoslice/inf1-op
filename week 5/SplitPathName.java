public class SplitPathName{
    public static String[] splitPath(String s){
        String components[] = new String[4];
        components[0] = s.substring(0,s.lastIndexOf("/"));
        components[1] = s.substring(s.lastIndexOf("/")+1);
        int temp = s.indexOf(".");
        if (temp != -1){
            components[2] = s.substring(s.lastIndexOf("/")+1,s.indexOf("."));
            components[3] = s.substring(s.indexOf("."));
        } else{
            components[2] = s.substring(s.lastIndexOf("/")+1);
            components[3] = "";
        };
        return components;
    }
    public static void main(String args[]){
        for (String x: args){
            String temp[] = splitPath(x);
            System.out.print("File: ");
            System.out.print(temp[1]);
            System.out.print(" Type: ");
            System.out.print(temp[3]);
            System.out.print(" [");
            System.out.print(temp[0]);
            System.out.print("]\n");
        }
    }
}