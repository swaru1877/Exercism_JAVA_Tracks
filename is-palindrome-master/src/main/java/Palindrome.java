public class Palindrome {
    public boolean check(String sentence) {

    Palindrome obj = new Palindrome();
    sentence = obj.lowerCase(sentence.replaceAll("[^a-zA-Z]", ""));
    return(compare(sentence,obj.reverseOfString(sentence))) ;

	}

	String reverseOfString(String inputString) {
        String strReverse = "";
        for(char ch : inputString.toCharArray())
            strReverse = ch + strReverse;
        return strReverse;
    }

    boolean compare(String str, String strRev){
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) != strRev.charAt(i))
                return false;
        }
        return true;
    }

    String lowerCase(String str){
        String strLowerCase = "";
        for(char ch: str.toCharArray()) {
             if(ch >= 'A' && ch <= 'Z')
                 ch += 'a' - 'A';
             strLowerCase += ch;
        }
        return strLowerCase;
    }
 
}
