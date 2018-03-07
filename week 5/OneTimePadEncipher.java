public class OneTimePadEncipher{
    public class OneTimePadEncipher {
        public static int charToInt(char l) {
          // ADD CODE HERE
          // Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
        }
    
        public static char intToChar(int i) {
          // ADD CODE HERE
          // Should convert an integer to a character, for example 0 -> 'a', b -> '1'
          // it should always return lower case chae
        }
    
        public static boolean isAlpha(char c) {
          // You do not need to implement this method, but you may find it useful.
        }
    
        public static String encipher(String original, String onetimepad) {
          // ADD CODE HERE
        }
    
    
        public static void main(String[] args) {
          String ciphertext = encipher("HELLO EVERYBODY", "MYSECRETKETMYSECRETKEY");
          System.out.print(ciphertext);
        }
    
    }
}