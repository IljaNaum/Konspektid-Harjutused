package Kon;

public class NumbriteMaailm {

	public static void main(String[] args) {
	//Aritmeetilised operatorid
		int a = 3;
		int b = 2;
		float jagamine;
		jagamine = a / b;
		System.out.println(jagamine);
				
	//Omistamisoperaatorid
		int i = 3;
		int j = 2;
		System.out.println(i+=j);
			
	//Vırdlusoperaatorid
	   /*
	    *m>n m - on suurem kui n 
		*m>=n - m on suurem v6i v6rdne n'ga
		*m<n - m on v2iksem kui n
		*m>=n - m on v2iksem v6i v6rdne n'ga
		*m==n - m ja n on v6rdsed
		*m!=n - m ei ole v6rdne n'ga
	   */
			
	//Loogika operaatorid
	   /*
		*| - Loogiline v6i 
		*& - Loogiline ning
		*^ - Loogiline mittesamav22rtus
		*! - Loogiline eitus
		*|| - V6i
		*&& - Ning
		*== - V6rdne
		*!= - Ei v6rdu
	   */
		class muutujad {
	    void main(String[] args) {
		int x, y, z;
		x = 7;
		y = 6;
		if(x>5 && y>5){
		z = x + y;
		} else {
		z = 0;
		}
		System.out.println(z);

	//Tyybiteisendused	  
		int x1, y1;
		float z1;
		x1 = 7;
		y1 = 6;
		z1 = (float)x1 / y1;
		System.out.println(z1);
			
	    //Klass Math
		double x11,y11,z11;
	    //Suvaline arv
		x11 = Math.random()*100;
		//Ymardame kaks kohta
		y11 = Math.round(x11*100.0)/100.0;
		//Astendamine
		z11 = Math.pow(8,3);
				
		System.out.print(x11);
		System.out.print(y11);
		System.out.print(z11);
				
	//Alamprogramm
		class ylesanne2 {
		//Pıhiprogramm
		void main(String[] args) {
		ytleTere(null);
		}
		//Alamprogramm
		void ytleTere(String nimi) {
		System.out.println("Tere Maailm!");
		}
	}
		class ylesanne21 {
		//Pıhiprogramm
		public void main(String[] args) {
		}
		//Alamprogramm argumendiga
		void ytleTere(String nimi) {
		System.out.println("Tere "+nimi+"!");	
		}
	}
		class ylesanne22 {
		//Pıhiprogramm
		public void main(String[] args) {
		ytleTere("Java");
		int s = ruuduPindala(4);
		System.out.println("Ruud pindala on "+s);
		}
		//Tagastab t‰isarvulise v‰‰rtuse
		int ruuduPindala(int a){
		int pindala = a * a;
		return pindala;
		}
		//Alamprogramm argumendiga
		void ytleTere(String nimi){
		System.out.println("Tere "+nimi+"!");
		
     }
    }
   }
  }
 }
}


