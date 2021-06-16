package Test;

import java.util.Scanner;//Kasutaja andmete saamise klass
public class TootamineTekstiga {

	public static void main(String[] args) {
//Ilja Naumenko
    Scanner sc = new Scanner (System.in);//Sisestuse funktsiooni loomine
	System.out.print("Suvaline sisestus: ");//kasutaja sisestu
	String sis = sc.nextLine();//Teksi tuvastamist kasutav meetod
	System.out.println("Teie sisestus on:"+sis.toUpperCase());//Teeb kõik tähed suureks
	System.out.println("Tähti teie sisestuses: "+sis.length());//Loendab tähti
	String[] tykeldus = sis.split(" ");//Sõnede töötlemise meetod, mis arvudab sõnad kokku 
	System.out.println("Sõnu teie sisestuses: "+tykeldus.length);//Väljastab kui sõnade summa 
	String[] sona = sis.split(" ");//Sõnade töötlemis meetod, mis määrab lause esimese sõna 
	System.out.println("Teie sisestuse esimene sõna on: "+sona[0]);//Väljastus mis kirjutab völja lause esimese sõna
	int a = sc.nextInt();//Meetod mis laseb kirjutada konsooli
	

	}

}
