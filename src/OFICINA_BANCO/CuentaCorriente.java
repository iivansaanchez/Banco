package OFICINA_BANCO;

public class CuentaCorriente {
	String dni;
	String nombre;
	double saldo;
	
	CuentaCorriente (String dni, String nombre) { //Constructor
		this.dni = dni;//DNI pasado por parametro
		this.nombre = nombre;//NOMBRE pasado por parametro
		saldo = 0;//Asignamos el saldo por defento
	}
	//METODO
	boolean sacarDinero (double cant) {//Sacamos dinero de la cuenta
		boolean operacionPosible = false;
		
		if (saldo >= cant) { //Si disponemos de saldo suficiente
			saldo -= cant;
			operacionPosible = true;
		}else { //No hay saldo disponible
			System.out.println("No tienes suficientes fondos");
			operacionPosible = false;
		}
		
		return operacionPosible;//Indica si ha sido posible realizar la operación
	}
	//METODO
	void meterDinero (double cant) {//Añadimos dinero a la cuenta
		saldo += cant;
	}
	//METODO
	void mostrarInformacion () {
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: "+ dni);
		System.out.println("SALDO: "+ saldo + " euros");
	}
}
