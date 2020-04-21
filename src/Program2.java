
public class Program2 {

	public static void main(String[] args) {
		
		String original = "Juan é fodenciO   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase().trim();
		String s03 = original.trim();
		String s04 = original.substring(2,11);
		String s05 = original.replace('o', 'x').trim().toUpperCase();
		
		System.out.println("-"+original+"-");
		System.out.println("-"+s01+"-");
		System.out.println("-"+s02+"-");
		System.out.println("-"+s03+"-");
		System.out.println(s04);
		System.out.println(s05);
		
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);

	}

}
