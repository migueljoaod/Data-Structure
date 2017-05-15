package estd;

public class Aula {

	public String invert(String s) {
		char[] chars = s.toCharArray();
		char[] chars2 = new char[chars.length];

		int counter = chars.length -1;
		
		for (char c : chars) {
			chars2[counter] = c;
			counter--;
		}

		return new String (chars2);
	}

}
