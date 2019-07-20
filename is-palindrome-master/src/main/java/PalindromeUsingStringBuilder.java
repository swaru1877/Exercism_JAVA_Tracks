public class PalindromeUsingStringBuilder {
    public boolean check(String sentence) {

		sentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
    	StringBuilder str = new StringBuilder(sentence);
    	return sentence.equals(str.reverse().toString());    	

	}

}
