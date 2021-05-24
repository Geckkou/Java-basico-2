
public class Lâmpada_Encapsulada {
	private boolean ligada;
	
	public void setLigar(boolean lig) {
		this.ligada = lig;
	}
	
	public void setDesligar(boolean deslig) {
		this.ligada = deslig;
	}
	
	public boolean getImprimir() {
		return ligada;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lâmpada_Encapsulada lamp = new Lâmpada_Encapsulada();
		
		lamp.setLigar(true);
		System.out.println(lamp.getImprimir());
		lamp.setDesligar(false);
		System.out.println(lamp.getImprimir());
		

	}

}
