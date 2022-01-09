import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.Locale;

public class JavaFicha {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		String nome;
		int idade;
		float altura;
		float peso;
		char sexo;
		
		try {
			
			pessoa dados = new pessoa();
			
			System.out.print("Digite o seu nome: ");
			nome = src.nextLine();
			
			while(nome.length() < 6 || nome.length() > 30) {
				System.out.print("Nome inv�lido. Tente outro: ");
				nome = src.nextLine();
			}
			dados.setNome(nome);
			
			
			System.out.print("Digite sua idade: ");
			idade = src.nextInt();
			
			while(idade <= 0 || idade >= 100) {
				System.out.print("Idade inv�lida. Tente outra: ");
				idade = src.nextInt();
			}
			dados.setIdade(idade);
			
			
			System.out.print("Digite sua altura: ");
			altura = src.nextFloat();
			
			while(altura <= 0) {
				System.out.print("Altura inv�lida. Tente outra: ");
				altura = src.nextFloat();
			}
			dados.setAltura(altura);
			
			
			System.out.print("Digite o seu peso: ");
			peso = src.nextFloat();
			
			while(peso <= 0) {
				System.out.print("Peso inv�lido. Tente outro: ");
				peso = src.nextFloat();
			}
			dados.setPeso(peso);
			
			
			System.out.print("Digite o seu sexo: ");
			sexo = (char) System.in.read();
			
			while((sexo != 'M') && (sexo != 'F')) {
				System.out.print("Sexo inv�lido. Tente outro: ");
				sexo = (char) System.in.read();
			}
			dados.setSexo(sexo);
			
			
			System.out.println(dados);
			
		} catch (IOException ex) {
			Logger.getLogger(JavaFicha.class.getName()).log(Level.SEVERE, null, ex);
		} catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		
		src.close();
	}
}
