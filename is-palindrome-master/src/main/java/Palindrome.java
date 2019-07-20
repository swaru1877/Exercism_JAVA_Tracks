public class Palindrome {
    public boolean check(String sentence) {

	Palindrome obj = new Palindrome();
    	sentence = sentence.replaceAll("[^a-zA-Z]", "");
        return((sentence.equalsIgnoreCase(obj.reverseOfString(sentence)))) ;

	}

	String reverseOfString(String inputString) {
        String strReverse = "";
        for(char ch : inputString.toCharArray())
            strReverse = ch + strReverse;
        
        return strReverse;
    }
}
