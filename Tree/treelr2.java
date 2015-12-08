public class treelr2 {
	public static void main(String[] args) {
		int height = 20;
		int padding;
		String row;
		String firstrow = "";
		for ( int i = 0; i <= height; i ++ ) {
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
			}else if(i == height){
				System.out.println(firstrow);
			}
		}
	}
}