
public class Exercicio09 {

	public static void main(String[] args) {
		
		int A=13,B=7;
		boolean verificador1= false,verificador2=false;
		
		if(A>10) {
			System.out.println("A>10");
			verificador1=true;
		}
			
		
		if(A+B==20) {
			System.out.println("A+B==20");
			verificador2=true;
		}		
		
		if(verificador1==false && verificador2==false) 
			System.out.println("Numero não válido");

	}

}
