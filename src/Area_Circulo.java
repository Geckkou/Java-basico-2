import java.util.*;
public class Area_Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner (System.in);
		
		int raio;
		System.out.println(" digite o valor do raio ");
		raio = r.nextInt();
		double area;
		double pi = Math.PI;
		double potencia = Math.pow(raio, 2);
		
		area = pi * potencia;
		System.out.println(" Área do circulo é = " +(float)area);
		
		

	}

}
