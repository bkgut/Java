public class dice {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int zufall;
		zufall = 1 + (int) (Math.random() * 6);
		System.out.println(zufall);

                System.out.println(" _________");
                System.out.println("/         \\");

		switch (zufall) {
			case 1:
				System.out.println("|         |");
				System.out.println("|    O    |");
				System.out.println("|         |");
				break;
			case 2:
				System.out.println("|      O  |");
				System.out.println("|         |");
				System.out.println("|  O      |");
				break;
			case 3:
				System.out.println("|       O |");
				System.out.println("|    O    |");
				System.out.println("| O       |");
				break;
			case 4:
				System.out.println("|  O   O  |");
				System.out.println("|         |");
				System.out.println("|  O   O  |");
				break;
			case 5:
				System.out.println("| O     O |");
				System.out.println("|    O    |");
				System.out.println("| O     O |");
				break;
			case 6:
				System.out.println("|  O   O  |");
				System.out.println("|  O   O  |");
				System.out.println("|  O   O  |");
				break;
		}

		System.out.println("\\_________/");	
		
	}

}
