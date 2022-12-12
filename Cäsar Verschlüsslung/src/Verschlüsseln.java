import java.util.Scanner;
public class Verschlüsseln {
public static void main(String[]args) {
	try (Scanner scanner = new Scanner(System.in)){
		System.out.print("Bitte den Klartext eingeben: ");
		String klartext = scanner.nextLine();
		System.out.print("Und nun den Schlüssel: ");
		int key;
		try {
			key = scanner.nextInt();
			} catch (Exception e) {
				System.out.print("Bitte eine ganze Zahl eingeben");
				return;
			}
			char[] klartextarray = klartext.toCharArray();
			for (int i = 0; i < klartextarray.length; i++) {
				char vorher = klartextarray[i];
				if (vorher == ' ');
				else if (vorher >= 65 && vorher <= 90) {
					klartextarray[i] = (char) (((vorher -65) + key) % 26 + 65);
				} else if (vorher >= 97 && vorher <= 122) {
					klartextarray[i] = (char) (((vorher -97) + key) % 26 + 97);
				}
			}
			String ergebnis = String.valueOf(klartextarray);
			System.out.println("Chiffre: " + ergebnis);
		}
	}
}
