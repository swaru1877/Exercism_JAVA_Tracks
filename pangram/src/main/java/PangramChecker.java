public class PangramChecker {

    public boolean isPangram(String input) {
		input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
		int aAsciiValue = 97, zAsciiValue = 122;
		if (input.length() == 0)
    		return false;
		
    	for (int letter = aAsciiValue; letter <= zAsciiValue; letter++){
    		if(!input.contains(Character.toString((char)letter)))
    			return false;
    	}
    	return true;

    }

}
