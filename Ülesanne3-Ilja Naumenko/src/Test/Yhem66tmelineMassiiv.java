package Test;

public class Yhem66tmelineMassiiv {

	private static final boolean True = false;
	public static void main(String[] args) {
		
	int [] arvud = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4};
	int arvudKokku = arvud.length;
	int viimaneArv = arvud[arvudKokku-1];
	int esimeneArv = arvud[0];
	int a = 276;
	int b = 26;
	float jagamine;
	jagamine = a / b;
	System.out.println("Esimene nimekirjas: "+esimeneArv);
	System.out.println("Viimane nimekirjas: "+viimaneArv);
	System.out.println("Arvud kokku: "+arvudKokku);
	
	int summa = 0;
	for (int i = 0; i < arvud.length; i++) {
	summa = summa + arvud[i];
	
  }
	System.out.println("Arvude summa: "+summa);
	System.out.println("Arvude aritmeetiline keskmine: "+jagamine);
 }
}