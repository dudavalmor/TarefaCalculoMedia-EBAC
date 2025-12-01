package br.com.edvalmor;

public class CalculoMedia {
	

	public static void main (String [] args) {
		calculoMedia();
		
	}
	
	private static void calculoMedia() {
		//aqui estamos atribuindo valores as notas, mas no mundo ideal é o usuário que colocará as notas.
		
		float nota1 = 7;
		float nota2 = 6;
		float nota3 = (float) 8.5;
		float nota4 = (float) 5.5;
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média das notas é: " + media);
	}
	
	

}
