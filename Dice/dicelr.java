import java.util.Random; // Wir brauchen Zufallszahlen
public class dicelr {
	public static void main(String[] args) {
		// Init
		Random rand = new Random();
		int random = rand.nextInt(6) +1;
		String str = "       ";
		String [] dot = str.split("");
		// Durch den Split "" haben wir einen nullstring als erstes Element, deswegen fangen wir bei 1 und nicht bei 0 an:

		// Dot 4 ist nur bei ungeraden Zahlen aktiv
		if(random %2 != 0){
			dot[4] = "●";
		}
		// Dot 2 und 6 sind aktiv sobald die Zahl über 1 ist.
		if(random > 1){
			dot[2] = "●";
			dot[6] = "●";
		}
		// Dot 1 und 7 sind aktiv sobald die Zahl über 3 ist
		if(random > 3){
			dot[1] = "●";
			dot[7] = "●";
		}
		// Dot 3 und 5 sind aktiv sobald die Zahl über 5 ist.
		if(random > 5){
			dot[3] = "●";
			dot[5] = "●";
		}

        System.out.println("┏━━━━━━━━━┓");
		System.out.println("┃ "+dot[1]+"    "+dot[2]+"  ┃ ");
		System.out.println("┃ "+dot[3]+"  "+dot[4]+" "+dot[5]+"  ┃ ");
		System.out.println("┃ "+dot[6]+"    "+dot[7]+"  ┃ ");
		System.out.println("┗━━━━━━━━━┛");	
	}
}