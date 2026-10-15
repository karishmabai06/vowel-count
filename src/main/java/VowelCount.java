public class VowelCount {
    public int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
 
    public static void main(String[] args) {
        VowelCount obj = new VowelCount();
        System.out.println("Vowels = " + obj.countVowels("Hello World"));
    }
}
