package yl2;

public class Ülesanne4 {

	public static void main(String[] args) {
	int aeg = 6;
	int distants = 10;
	int vastus1 = distants / aeg;
	System.out.println("Esimese sportlase aeg oli "+aeg+"h, ja läbitud distants oli "+distants+"km");
	int aeg2 = 4;
	int distants2 = 7;
	int vastus2 = distants2 / aeg2;
	System.out.println("Teise sportlase aeg oli "+aeg2+"h, ja läbitud distants oli "+distants2+"km");
	
	int vahe = aeg - aeg2;
	int vahe2 = distants - distants2;
	System.out.println("Nende sportlaste aja vahe oli "+vahe+"h, ja distantsi vahe oli "+vahe2+"km");
	
	
	}

}
