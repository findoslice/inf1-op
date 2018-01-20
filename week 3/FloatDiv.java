public class FloatDiv {
    public static void main(String args[]) {
        double age = Double.parseDouble(args[0]);
        double exposure = Double.parseDouble(args[1]);

        double dose = ((exposure * 250) / age);

        System.out.println("Patient Age: " +  age);
        System.out.println("Days since bitten: " + exposure);
        System.out.println("Dosage of antidote: "+ dose);
    }
}