package yl2;

public class EllipsiPindala {
	public static void PindalaArv(float a, float b)
	{
	float pindala;
	pindala = (float)3.14*a*b;
	a = Math.round(pindala*10.0/10.0);
	
	System.out.println("Ellipsi pindala on "+ pindala);
	}
	public static void main(String[] args) {
		float a = 8;
		float b = 8;
		
   	PindalaArv(a, b);
  
   } 
  } 


