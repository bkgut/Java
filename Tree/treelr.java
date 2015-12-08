public class treelr {
	public static void main(String[] args) {
		int height = 20;
		int i = 0;
		while(i < height){
			System.out.println(treelr.printbaum(height, i));
			i++;
		}
		System.out.println(treelr.printbaum(height, 0));
	}
	public static String printbaum(int height, int i){
		int padding = 0;
		String asterisk_row;
		String whitespace_row;
		padding = height - i;
		whitespace_row = new String(new char[padding]).replace("\0", " ");
		asterisk_row = new String(new char[i]).replace("\0", "*");
		return whitespace_row+asterisk_row+"*"+asterisk_row+whitespace_row;
	}

}