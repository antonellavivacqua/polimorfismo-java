package hola;
public class Bici extends Vehiculo {
	
	public Bici(String marca, String modelo, int año) {
		super(marca, modelo, año);
	}
	
	@Override
	void encender() {
		encendido = true;
		System.out.println("La bici se encendió");
	}
	
	@Override
	public String toString() {
		return "Bici " + super.toString();
	}
}

