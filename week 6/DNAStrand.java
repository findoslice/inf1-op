public class DNAStrand{
    private String dna;
    public DNAStrand(String dna){
        this.dna = dna;
    }
    public boolean isValidDNA(){
        for (char x : this.toString().toCharArray()){
            if (x != 'A' || x != 'C' || x != 'T' || x != 'G' || x != '-'){
                return false;
            }
        }
        return true;
    }
    public String complementWC(){
        char x[] = new char[this.toString().toCharArray().length];
        for (int i = 0; i < this.toString().toCharArray().length; i++){
            if ((this.toString().toCharArray())[i] == 'A'){
                x[i] = 'C';
            }
            if ((this.toString().toCharArray())[i] == 'C'){
                x[i] = 'A';
            }
            if ((this.toString().toCharArray())[i] == 'G'){
                x[i] = 'T';
            }
            if ((this.toString().toCharArray())[i] == 'T'){
                x[i] = 'G';
            }
            if ((this.toString().toCharArray())[i] == '-'){
                x[i] = '-';
            }
        }
        return x.toString();
    }
    public String palindromeWC(){
        char x[] = new char[this.toString().toCharArray().length];
        for (int i = 0; i < this.toString().toCharArray().length; i++){
            x[i] = this.toString().toCharArray()[this.toString().toCharArray().length - i];
        }
        return x.toString();
    }
    public Boolean containsSequence(String seq){
        return this.toString().contains(seq);
    }
    public String toString(){
        return this.dna;
    }
}