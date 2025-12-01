package br.com.edvalmor;

public class CalculoMedia {
	

	public static void main (String [] args) {
		calculoMedia();
		
	}
	
	private static void calculoMedia() {
		//aqui estamos atribuindo valores as notas, mas no mundo ideal é o usuário que colocará as notas.
		
		float nota1 = 7;
		float nota2 = 7;
		float nota3 = (float) 7;
		float nota4 = (float) 7;
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media >= 7.0) {
			System.out.println("Aprovado!");
		} else if (media >= 5.0) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
		
	}
	
	

}
