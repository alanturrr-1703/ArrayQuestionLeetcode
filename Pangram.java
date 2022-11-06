public class Pangram {
    public static void main(String[] args) {
        String sentence = "qwertyuiopasdfghjklzxcbvnm";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        if (sentence.length() < 26){
            return false;
        }
        int count = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            boolean pangram = checkPangram(i, sentence);
            if (pangram == true){
                count += 1;
            }
        }
        if (count >= 26){
            return true;
        }
        return false;
    }

    private static boolean checkPangram(char i, String sentence) {
        for (char c : sentence.toCharArray()) {
            if (c == i){
                return true;
            }
        }
        return false;
    }

}
