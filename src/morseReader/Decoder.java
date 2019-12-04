package morseReader;

public class Decoder {
	
	String morse = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";

	String answer = "";
	String[] arrOfMorse = morse.split(" ");
	
	for (String s : arrOfMorse) {
		
		answer += arrOfMorse.get(s);
		
		 
	}
	return answer;
}

}
