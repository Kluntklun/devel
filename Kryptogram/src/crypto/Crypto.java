package crypto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Crypto {
	
	private Map<Character, String> assigns = new HashMap<>();
	private final String input = "XIIIXVXIVXIXXVIIIVXVIIXVIIIXIX";

	public void run() {
		setAssigns();
		decipher();
	}
	
	private void decipher() {
		getResult(input, "");
	}
	
	private void getResult(String in, String result) {
		if (in.length() == 0) {
			if (result.length() == 10) {
				System.out.println(result + ", " + cipher(result));
				return;
			}
		}
		String s;
		Iterator<Entry<Character, String>> it = assigns.entrySet().iterator();
	    while (it.hasNext()) {
	    	Entry<Character, String> pair = (Entry<Character, String>) it.next();
	    	s = pair.getValue();
			if (in.startsWith(s)) {
				getResult(in.substring(s.length()), result + pair.getKey());
			}
		}
	}
	
	private String cipher(String input) {
		String res = "";
		for (int i = 0; i < input.length(); i++) {
			res += assigns.get(input.charAt(i));
		}
		return res;
	}
	
	private void setAssigns() {
		assigns.put('A', "I");
		assigns.put('B', "II");
		assigns.put('C', "III");
		assigns.put('D', "IV");
		assigns.put('E', "V");
		assigns.put('F', "VI");
		assigns.put('G', "VII");
		assigns.put('H', "VIII");
		assigns.put('I', "IX");
		assigns.put('J', "X");
		assigns.put('K', "XI");
		assigns.put('L', "XII");
		assigns.put('M', "XIII");
		assigns.put('N', "XIV");
		assigns.put('O', "XV");
		assigns.put('P', "XVI");
		assigns.put('R', "XVII");
		assigns.put('S', "XVIII");
		assigns.put('T', "XIX");
		assigns.put('U', "XX");
		assigns.put('V', "XXI");
		assigns.put('X', "XXII");
		assigns.put('Y', "XXIII");
		assigns.put('Z', "XXIV");
	}
	
	public static void main(String[] args) {
		new Crypto().run();
	}
}
