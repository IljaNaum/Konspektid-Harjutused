package Test;

import java.util.Scanner;//Kasutaja andmete saamise klass
public class TootamineTekstiga {

	public static void main(String[] args) {
//Ilja Naumenko
    Scanner sc = new Scanner (System.in);//Sisestuse funktsiooni loomine
	System.out.print("Suvaline sisestus: ");//kasutaja sisestu
	String sis = sc.nextLine();//Teksi tuvastamist kasutav meetod
	System.out.println("Teie sisestus on:"+sis.toUpperCase());//Teeb k�ik t�hed suureks
	System.out.println("T�hti teie sisestuses: "+sis.length());//Loendab t�hti
	String[] tykeldus = sis.split(" ");//S�nede t��tlemise meetod, mis arvudab s�nad kokku 
	System.out.println("S�nu teie sisestuses: "+tykeldus.length);//V�ljastab kui s�nade summa 
	String[] sona = sis.split(" ");//S�nade t��tlemis meetod, mis m��rab lause esimese s�na 
	System.out.println("Teie sisestuse esimene s�na on: "+sona[0]);//V�ljastus mis kirjutab v�lja lause esimese s�na
	int a = sc.nextInt();//Meetod mis laseb kirjutada konsooli
	

	}

}
