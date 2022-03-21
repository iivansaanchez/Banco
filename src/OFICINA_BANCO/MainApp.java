package OFICINA_BANCO;

public class MainApp {

	public static void main(String[] args) {
		
		CuentaCorriente c1;
		c1 = new CuentaCorriente ("12345678A", "Pepe");
		c1.meterDinero(10);
		c1.sacarDinero(5);
		c1.mostrarInformacion();
		
		System.out.println("Puedo sacar 5€: " +c1.sacarDinero(5));
		System.out.println("Puedo sacar 15€: " +c1.sacarDinero(15));
		

	}

}
