class Hamming {
	String leftStrand, rightStrand;

    Hamming(String leftStrand, String rightStrand) {
    	if (leftStrand.length() != rightStrand.length()){
        	if (leftStrand.length() == 0)
        		throw new IllegalArgumentException("left strand must not be empty.");
        	else if (rightStrand.length() == 0)
        		throw new IllegalArgumentException("right strand must not be empty.");
        	else
       			 throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
}
 
    int getHammingDistance() {
    	int hammingDist = 0;

        for(int i = 0 ; i < leftStrand.length(); i++){

        	if (leftStrand.charAt(i) != rightStrand.charAt(i))
        		++hammingDist;
        	
    	}
    	return hammingDist;
}

}
