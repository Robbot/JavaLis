package rozdzial2_instrukcje_jezyka�zyka;

public class Listing2_18 {
		public static void main (String args[]) {
		//deklaracja zmiennych
		int A = 1, B = 1, C = -2;
		//wyświetlenie parametrów równania
		System.out.println ("Parametry równania:\n");
		System.out.println ("A: " + A + " B: " + B + " C: " + C + "\n");
		//sprawdzenie, czy jest to równanie kwadratowe
		//A jest równe zero, równanie nie jest kwadratowe
		if (A == 0) {
		System.out.println ("To nie jest równanie kwadratowe: A = 0!");
		}
		//A jest różne od zera, równanie jest kwadratowe
		else {
		//obliczenie delty
		double delta = B * B - 4 * A * C;
		//jeśli delta mniejsza od zera
		if (delta < 0) {
		System.out.println ("Delta < 0.");
		System.out.println ("To równanie nie ma rozwiązania w zbiorze liczb rzeczywistych");
		}
		//jeśli delta większa lub równa zero
		else{
		////deklaracja zmiennej pomocniczej
			double wynik;
			//jeśli delta równa zero
			if (delta == 0){
			//obliczenie wyniku
			wynik = -B / (2 * A);
			System.out.println ("Rozwiązanie: x = " + wynik);
			}
			//jeśli delta większa od zera
			else{
			//obliczenie wyników
			wynik = (-B + Math.sqrt(delta)) / (2 * A);
			System.out.print ("Rozwiązanie: x1 = " + wynik);
			wynik = (-B - Math.sqrt(delta)) / (2 * A);
			System.out.println (", x2 = " + wynik);
			}
		}
		}
	}
}
