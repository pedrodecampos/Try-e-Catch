package Package;

public class Aplicacao {

	// criando metodo de tratamento
	public static void metodo(String[] args) throws Exception{
	/*	int i;

		try {
			i = Integer.parseInt(args[0]);
			System.out.println("Valor De Args[0] = " + i);
		}
		// Catch = Captura e trata o try
		catch (NumberFormatException excecao) {
			System.out.println("Deve ser informado um numero inteiro");
		} catch (ArrayIndexOutOfBoundsException excecao) {

			System.out.println("Nao Existe");
		}
		*/
		int i;
		i = Integer.parseInt(args[0]);
		System.out.println("Valor De Args[0] = " + i);

	}
	
	

	public static void main(String[] args) {
        try {
		metodo(args);
        }
        catch(Exception excecao) {
        	System.out.println("Deve ser informado um numero inteiro como argumento para o programa");
        }
        
	}

}
