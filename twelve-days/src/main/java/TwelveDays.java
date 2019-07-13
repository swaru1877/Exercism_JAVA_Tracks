class TwelveDays {
	private static final String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    private static final String[] gifts = {"a Partridge in a Pear Tree.", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};
    
    String [] songLines = song();


   String verse(int verseNumber) {
       return songLines[verseNumber - 1];
    }

    String verses(int startVerse, int endVerse) {
        String result = "";
        for (int i = startVerse; i < endVerse ; i++) {
            result += songLines[i - 1] + "\n";
        }
        result += songLines[endVerse - 1];
        return result;    
    }
    
    String sing() {
    	return verses(1, songLines.length);
    }

    String[] song(){
	    String [] songLines = new String[12];
        String endPhrase = "and " + gifts[0] + "\n";

        for(int lpCnt = 0; lpCnt < songLines.length ; lpCnt++){
            String midPhrase = "";
            String srtPhrase = "On the " + days[lpCnt] + " day of Christmas my true love gave to me: ";

            for(int cnt = lpCnt; cnt >= 1; cnt--)
                midPhrase += gifts[cnt] + ", ";

        songLines[lpCnt] = (lpCnt == 0) ? srtPhrase +gifts[lpCnt]+"\n" : srtPhrase + midPhrase + endPhrase;

        }
        return songLines;

    }
}

