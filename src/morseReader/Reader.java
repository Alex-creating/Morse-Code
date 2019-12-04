package morseReader;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Reader {

	public static void main(String[] args) {
		Map <String, Character> morseDecoder = new HashMap<>();
		morseDecoder.put( ".-",'A');
		morseDecoder.put("-...", 'B');
		morseDecoder.put("-.-.",'C');
		morseDecoder.put( "-..",'D');
		morseDecoder.put(".",'E');
		morseDecoder.put("..-.",'F');
		morseDecoder.put("--.",'G' );
		morseDecoder.put( "....",'H');
		morseDecoder.put( "..",'I');
		morseDecoder.put(".---",'J' );
		morseDecoder.put( "-.-",'K');
		morseDecoder.put(".-..",'L' );
		morseDecoder.put( "--",'M');
		morseDecoder.put("-.", 'N');
		morseDecoder.put("---",'O');
		morseDecoder.put(".--.",'P');
		morseDecoder.put("--.-",'Q');
		morseDecoder.put(".-.",'R');
		morseDecoder.put("...",'S');
		morseDecoder.put("-",'T');
		morseDecoder.put("..-",'U');
		morseDecoder.put("...-",'V' );
		morseDecoder.put(".--",'W' );
		morseDecoder.put("-..-",'X');
		morseDecoder.put("-.--",'Y' );
		morseDecoder.put("--..",'Z');
		morseDecoder.put("/",' ');
		
		String morse = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		String answer = "";
		String[] arrOfMorse = morse.split(" ");
		for (String s : arrOfMorse) {	
	answer += morseDecoder.get(s);
			}
			
				 	System.out.println(answer);
		}
	
	
	
	
}