
public class Lampada {
     boolean ligada;
     
     void ligar () {
    	 this.ligada = true;   	 
     }
     
     void desligar() {
    	 this.ligada = false;
     }
     
     void imprimir () {
    	 if (this.ligada == true ) {
    		 System.out.println("lampada ligada");
    	 }else {
    		 System.out.println("lampada desligada");
    	 }
     }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lamp = new Lampada();
		
		lamp.ligar();
		lamp.imprimir();
		lamp.desligar();
		lamp.imprimir();

	}

}
