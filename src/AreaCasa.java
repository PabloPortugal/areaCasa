import java.util.Scanner;

public class AreaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		String comodo,resposta = "S";
		double area ,largura,comprimento;
		double areaTotal=0;
		int contador = 0;
		
		
		while( resposta.equalsIgnoreCase("S")) {
		
		System.out.println("********************");
		System.out.println("Calculo de área de uma casa");
		System.out.println("********************");
		System.out.println();
		System.out.print("Qual o nome do comodo: ");
		comodo = leitor.next();
		System.out.print("Qual a largura? ");
		largura= leitor.nextInt();
		System.out.print("Qual o comprimento? ");
		comprimento = leitor.nextInt();
		
		area= largura*comprimento;
		System.out.println("A área do comodo é " + area);
			
		System.out.println("Deseja calcular mais cômodos?(S/N)");
		resposta = leitor.next();
		
		areaTotal=areaTotal+area; 
		

			
			
			
			
		} System.out.println("FIM");
		 
		leitor.close();

		

			
			
			
			
			
		}
	
}
	
	
	
		
		
	
		
		
	
	
	
	
	 


