package Kon;

public class Massiiv {

	public static void main(String[] args) {
//Massiivi loomine ja elemendite v�ljastamine
		String[] nimed = {"Kati", "Mati", "J�ri", "Malle", "Kalle"};
		int[] vanused = {17,21,36,20,16,9};
	}
}

class ylesanne3 {
	
	public static void main(String[] args) {
		String[] nimed = {"Kati", "Mati", "J�ri", "Malle", "Kalle"};
		System.out.println(nimed[2]);
		
	}
}

class ylessanne4 {
	static void main(String[] args) {
	String[] nimed = {"Kati", "Mati", "J�ri", "Malle", "Kalle"};
	int suvArv = (int)Math.floor(Math.random() * 6);
	
	}
}
 class ylesanne5 {
	static void main(String[] args) {
	//m��rame massiivi pikkuse
	int[] juustePikkus = new int[6];
	//lisame v��rtused massiivi
	juustePikkus[0] = 30;
	juustePikkus[1] = 45;
	juustePikkus[2] = 76;
	juustePikkus[3] = 11;
	juustePikkus[4] = 4;
	juustePikkus[5] = 18;
	//Tt�kime v�lja
	System.out.println(juustePikkus[1]);
	}
 }
 //Elementide arv massiivis
 class ylesanne6 {
	static void main(String[] args) {
	String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
	int nimedKokku = nimed.length;
	System.out.println("nimesid kokku: "+nimedKokku);
		
	 }
 }
 class ylesanne7 {
	static void main(String[] agrs ) {
	String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
	int nimedKokku = nimed.length;
	String viimaneNimi = nimed[nimedKokku-1];
	System.out.println("Nimesid kokku: "+nimedKokku);
	System.out.println("Viimane nimekirjas: "+viimaneNimi);
		
	 }
 }
 //K�ikide elementide kuvamine
 class ylesanne8 {
	static void main(String[] args) {
	String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
	 
	for (int i = 0; i < nimed.length; i++) {
	System.out.println(nimed[i]);
	 
	}
	 
	}
 }
 //Mitmem��tmeline massiiv
 class ylesanne9 {
	static void main(String[] args) {
	String [][] nimed = { {"Kati", "Mari", "Malle"},{"Mati", "J�ri", "Kalle"} };
	System.out.println(nimed[0][2]);
	 
	}
 }
 class ylessanne10 {
 	static void main(String[] args) {
 	String [][] nimed = { {"Kati", "Mari", "Malle"},{"Mati", "J�ri", "Kalle"} };
 	System.out.println("Mehi kokku: "+nimed[1].length);
    System.out.println("K�ik kokku: "+(nimed[0].length+nimed[1].length));
 	 
 	}
 }
 class ylesanne11 {
	static void main(String[] args) {
	int [][] vanused = new int[4][3];
	//Esimene rida
	vanused[0][0] = 3;
	vanused[0][1] = 15;
	vanused[0][2] = 5;
	//teine rida
	vanused[1][0] = 3;
	vanused[1][1] = 7;
    vanused[1][2] = 20;
	//kolmas rida
	vanused[2][0] = 11;
	vanused[2][1] = 17;
	vanused[2][2] = 10;
	//neljas rida
	vanused[3][0] = 15;
	vanused[3][1] = 20;
	vanused[3][2] = 17;
	System.out.println(vanused[1][2]);
	
	}
 }
 //Mitmem��tmelise massiivi k�ikide elementide kuvamine
 class ylesanne12 {
	static void main(String[] args) {
	String[][] nimed = { {"Kati", "Mari", "Malle"},{"Mati", "J�ri", "Kalle"} };
	//K�ime l�bi read
	for (int i = 0; i < nimed.length; i++) {
	//K�ime l�bi veerud
	for (int j = 0; j < nimed[i].length; j++) {
	System.out.println(nimed[i][j]);
	
	}
	}
	}
 }
 