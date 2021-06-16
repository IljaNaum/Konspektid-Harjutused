package Kon;

import java.util.Scanner;

public class Sõnetöötlus {

	public static void main(String[] args) {
		
    //Muutuja tüüp char
	char m2rk = 'G';
	
	System.out.print(m2rk);

	}

}
class ylesanne1 {
	static void main(String[] args) {
		
	char m2rk = 'G';
	char kood = 65;
	
	System.out.println(m2rk);
	System.out.println(kood);
	
	}
}
class ylesanne2 {
	static void main(String[] args) {
		
	char m2rk = 'G';
	char kood = 65;
	char[] m2rgid = {'a', 'b', 'c', 'd', 'e'};
	
	System.out.println(m2rk);
	System.out.println(kood);
	System.out.println(m2rgid[4]);
	
	}
	
}
//Erimärgid
class ylesanne3 {
	static void main(String[] args) {
		
	char uusRida = '\n';
	
	System.out.println("See "+uusRida+"murrab!");
	/* \' Single quotation mark
	   \" Double quotation mark
	   \\ Backslash
	   \t Tab
	   \b Backspace
	   \r Carriage return
	   \f Formfeed
	   \n Newline
	*/	
	}
}
//Mis on sõne (string)
class ylesanne4 {
	static void main(String[] args) {
		
	String sone = "Tere maailm!";
	
	System.out.println(sone);
	//Sõne võid vaadelda ka kui märkide massiivi,
	//mille saaks kirja panna
	char[] m2rgid ={'T','e','r','e',' ','m','a','a','i','l','m','!' };
	
	}
}
//Sõnede liitmine ja erimärgid
class ylesanne5 {
	static void main(String[] args) {
		
	String nimetus = "\"Reis ümber maailma\"";
	
	System.out.println("Lauamäng "+nimetus+".");
	
	}
}
//Teksti ja arvude sisestamine
class ylesanne6 {
	static void main(String[] args) {
		
	//kasutaja sisestus
	Scanner scanner = new Scanner (System.in);
	System.out.println("Sisesta oma nimi: ");
	//lisab sisestuse sõne muutujasse
	String nimi = scanner.nextLine();
	System.out.println("Sisesta oma vanus: ");
	//lisab sisestuse täisarvu muutujasse
	int vanus = scanner.nextInt();
	
	System.out.println("Tere "+nimi+", "+vanus+"!");
	
	}
	
}
class ylesanne7 {
	static void main(String[] args) {
		
	String nimi = "Mari";
	//Väljund: Meie Mari Maasikas on nii nooruslik!
	System.out.printf("Meie %s %s on nii nooruslik!", nimi, "Maasikas");
	
	}
}
//Täisarvude vormindamine
class ylesanne8 {
	static void main(String[] args) {
		
	int arv1 = 6;
	int arv2 = 7;
	String yhik = "tk";
	//Väljund: 6 + 7 = 13tk
	System.out.printf("%d + %d = %d%s", arv1, arv2, arv1+arv2, yhik);
	
	}
}
//Pesade laius
class ylesanne9 {
	static void main(String[] args) {
		
	String[] nimed = {"Eesti keel", "Matemaatika", "Kirjandus"};
	int[] vanused = {4, 5, 3};
	
	for (int i = 0; i < vanused.length; i++) {
	System.out.printf("%20s %d", nimed[i], vanused[i]);
	//Väljund:
    //  Eesti keel 4         Matemaatika 5           Kirjandus 3
	}
  }
}
class ylesanne10 {
	static void main(String[] args) {
	
	String[] nimed = {"Eesti keel", "Matemaatika", "Kirjandus"};
	int [] vanused = {4, 5, 3};
	
	for (int i = 0; i < vanused.length; i++) {
	System.out.printf("%20s %d%n", nimed[i], vanused[i]);
	//Väljund:
	/*
	Eesti keel           4
	Matemaatika          5
	Kirjandus            3
	*/
	}
  }
}
//Ujukomaarvude vormindamine
class ylesanne11 {
	static void main(String[] args) {
	System.out.printf("%f",123.456);//Väljund: 123.456000
	
	}
}
class ylesanne12 {
	static void main(String[] args) {
	System.out.printf("%.2f",123.456);//Väljund: 123.46
	System.out.printf("%15f",123.456);//Väljund:     123.456000
	System.out.printf("%15.2f",123.456);//Väljund:          123.46
	
	}
}
//Sõnede töötlemine (meetotid)
	/*
	length() – leiab märkide arvu sõnes
	charAt() – kuvab sümboli vastavalt antud indeksile
	substring() – võimaldab kuvada tekstist mingi osa. Kui lisad ainult ühe indeksi, siis kuvatakse alates sellest kuni lõpuni. Lisades kaks indeksit, saad määrata nii alguse kui ka lõpu.
	indexOf() – leiab märgi või terve sõne asukoha tekstis. Lisades indeksi, saad määrata, alates mitmendast märgist otsimist alustatakse
	toLowerCase() – muudab väiketähtedeks
	toUpperCase() – muudab suurtähtedeks
	*/
class ylesanne13 {
	static void main(String[] args) {
	String tekst = "Loren iPsum";
	
	System.out.println(tekst.length());//11
	System.out.println(tekst.charAt(0));//11
	System.out.println(tekst.substring(1));//orem iPsum
	System.out.println(tekst.substring(1));//rem
	System.out.println(tekst.indexOf('m'));//4
	System.out.println(tekst.indexOf('m',5));//10
	System.out.println(tekst.toLowerCase());//lorem ipsum
	System.out.println(tekst.toLowerCase());//LOREM IPSUM
	
	String[] tykeldus = tekst.split(" ");
	System.out.println(tykeldus[0]); //Lorem
	
	}
}
//Sõne teisendamine arvuks ja vastupidi
class ylesanne14 {
	static void main(String[] args) {
	String ik = "59891199182";
	int esimeneNr = Integer.parseInt(ik.substring(0,1));//teisendame täisarvuks
	String esimeneT2ht = Integer.toString(esimeneNr);//teisendame sõneks
	System.out.println(esimeneNr);
	System.out.println(esimeneT2ht);
	
	float ujukoma = Float.parseFloat("25");
	String sone = Float.toString(25.0f);
	System.out.println(ujukoma);
	System.out.println(sone);
	
	}
}







