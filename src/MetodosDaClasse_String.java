
public class MetodosDaClasse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Alexandre";
		String sobrenome = "Rocha";		
		
		System.out.println("concatenando: " + nome + sobrenome);
		
		System.out.println("tudo maiscula: " + nome.toUpperCase());
		
		System.out.println("tudo minuscula: " + sobrenome.toLowerCase());
		
		System.out.println("retorna o caracter de posi��o: " + nome.charAt(4));
		
		System.out.println("retorna a quantidade de caracteres:" + sobrenome.length());
		
		System.out.println("recebe um int e retorna a partir da posi�ao: " + sobrenome.substring(3));
		
		System.out.println("recebe um char e retorna a posi�ao da primeira ocorrencia: " + nome.indexOf("e"));
		
		System.out.println("verifica se termina com o valor especificado: " + nome.endsWith("dre"));
		
		System.out.println("verifica se come�a com o valor especificado: " + nome.startsWith("cha"));
		

	}

}
