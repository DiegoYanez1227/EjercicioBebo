package ejercicioAinhoa;

import java.util.ArrayList;

public class Terminal {

	private ArrayList<Vehiculo> cola;

	public Terminal() {

	}
	
	public Terminal(ArrayList<Vehiculo> cola) {
	
		this.cola = cola;
	}
	
	public void entrar(Vehiculo v) {
		cola.add(v);
	}
	
	public void salir(Vehiculo v) {
		cola.remove(v);
	}
}
