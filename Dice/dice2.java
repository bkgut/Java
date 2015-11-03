public class dice2 {

	public static void main(String[] args) {

		int zufall;
		zufall = 1 + (int) (Math.random() * 6);
		//System.out.println(zufall);

		String str = "       "; 
		char[] a = str.toCharArray();
		
		switch (zufall) {
			case 1:
				a[3] = '0';
				break;
			case 3:
				a[3] = '0';
			case 2:
				a[1] = '0';
				a[5] = '0';	
				break;
			case 5:
				a[3] = '0';
			case 4:
                a[0] = '0';
                a[1] = '0';
                a[5] = '0';
				a[6] = '0';
				break;
			case 6:
                a[0] = '0';
                a[1] = '0';
                a[2] = '0';
                a[4] = '0';
                a[5] = '0';
                a[6] = '0';
				break;
		}

        System.out.println(" _________");
        System.out.println("/         \\");
		System.out.println("| "+a[0]+"     "+a[1]+" |");
		System.out.println("| "+a[2]+"  "+a[3]+"  "+a[4]+" |");
		System.out.println("| "+a[5]+"     "+a[6]+" |");
		System.out.println("\\_________/");	
		
	}

}
