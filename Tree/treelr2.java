import java.util.Scanner;
public class treelr2 {
	public static void main(String[] args) {
		int height;
		int padding;
		String row;
		String firstrow = "";
		System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 80 ein");
		Scanner in = new Scanner(System.in);
		height = in.nextInt();
		for ( int i = 0; i < height; i ++ ) {
			row = "";
			padding = height - i;
			for ( int j = 0; j < padding; j ++ ) {
				row += " ";
			}
			for ( int j = 0; j < ((i * 2)+1); j ++ ) {
				row += "*";
			}
			System.out.println(row);
			if(i == 0){
				firstrow = row;
			}else if(i == (height-1)){
				System.out.println(firstrow);
			}
		}
	}
}