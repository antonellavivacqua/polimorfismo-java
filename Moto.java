package hola;
public class Moto extends Vehiculo {
	
	public Moto(String marca, String modelo, int año) {
		super(marca, modelo, año);
	}
	
	@Override
	void encender() {
		encendido = true;
		System.out.println("La moto se encendió");
	}
	
	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}
}

