package Kon;

public class TingimuslausedTsyklid {

	public static void main(String[] args) {
	//Tingimuslause IF
	int pikkus = 203;
	if (pikkus >= 200); {
	System.out.println("T�itsa pikk poiss");
  }
 }
}
class ylesanne5 {
	static void main(String[] args) {
	int pikkus = 203;
	if (pikkus >= 200);
	System.out.println("T�itsa pikk poiss");
	} else {
	System.out.println("Liiga l�hike");
	
	}
}
class ylesanne6 {
	static void main(String[] args) {
	
		int punktid = 60;
		
		if (punktid >= 90) {
		System.out.println("Hinne: 5");
		} else if(punktid >= 70){
		System.out.println("Hinne: 4");
		} else if(punktid >= 50){
		System.out.println("Hinne: 3");
		} else {
		System.out.println("Hinne: 2");
		}
	    }
}
class ylesanne7 {
	static void main(String[] args) {
		
	int arv = 7;
	
	if (arv%2 == 0) {
	System.out.println("Paaris");
	} else {
	System.out.println("Paaritu");
	
  }
 }
}
	//Mitu valikut AND
class ylesanne8 {
	static void main(String[] args) {
	
	int arv = 16;
	
	if (arv>=15 && arv<=18) {
	System.out.println("Sobib");
	}
	}
}
	//�ks valikust OR
class ylesanne9 {
	static void main(String[] args) {
	
	int vanus = 19;
	int synniaasta = 1999;
	
	if (vanus>=18 || synniaasta>=2000) {
	System.out.println("Sobib");
	
	}
	}
}
	//S�nede v�rdlemine
class ylesanne10 {
	static void main(String[] args) {
	
	String roll = "kasutaja";
		 
	if (roll.equals("admin")) {
	System.out.println("Tere admin!");
	} else {
		System.out.println("Tere kasutaja!");
	}
		 
}
	//Eriti l�hike IF
//tingimus ? t�eneLause : v��rLause
class ylesanne11 {
	static void main(String[] args) {
	
	int arv = -5;
	String tulemus = arv >= 0 ? "Sobib" : "Liiga v�ike";
	System.out.println(tulemus);
	
	}
	}
}
	//SWITCH lause
class ylesanne12 {
	static void main(String[] args) {
	
	int hinne = 4;
	
	switch (hinne) {
	case 5: System.out.println("V�ga hea!");
	break;
	case 4: System.out.println("Hea!");
	break;
	case 3: System.out.println("Rahuldav!");
	break;
	default: System.out.println("Kasin!");
	}
	}
}
	//Ts�kkel FOR
class yleanne13 {
	static void main(String[] args) {
	for (int i = 1; i <= 10; i++) {
		System.out.println(i+". P�kapikk");
	}
	}
}
class ylesanne14 {
	static void main(String[] args) {
	
	String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
	
	 for (int i = 0; i < nimed.length; i++) {
	 	System.out.println(i+1+". "+nimed[i]);
	
	
	}
}
}
	//Ts�kkel ts�klis
class ylesanne15 {
	static void main(String[] args) {
	
	for (int i = 1; i < 10; i++) {
	for (int j = 0; j < i; j++) {
	System.out.print("+");
	}
	System.out.println("");
	}
	}
}
	//foreach ts�kkel
class ylesanne16 {
	static void main(String[] args) {
	
	String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
	
	for (String i : nimed) {
		System.out.println(i);
		
	}
	}
}
	//Ts�kkel WHILE
class ylesanne17 {
	static void main(String[] args) {
	
	int arv = 1;
	
	while(arv<=10) {
		System.out.println(arv);
		arv++;
	}
	}
}
