import java.util.HashMap;
class RnaTranscription {

    String transcribe(String dnaStrand) {

    	//Maping of DNA to RNA using HashMap
    	HashMap<Character, String> dnaMap = new HashMap<Character, String>();
	dnaMap.put('A', "U");
        dnaMap.put('G', "C");
        dnaMap.put('C', "G");
        dnaMap.put('T', "A");

	StringBuilder result = new StringBuilder();
        char[] dnaStrandCharArray = dnaStrand.toCharArray();	//Converting String to char array

        for(char dnaS : dnaStrandCharArray){
		
        	result.append(dnaMap.get(dnaS));
		
        }
	    
        return(result.toString());	//Returning rnaStrand
    }

}
