package hola;
import java.util.ArrayList;
public class Vehiculo {
	String marca;
	String modelo;
	int año;
	boolean encendido = false;
	
	public Vehiculo(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.encendido = false;
	}
	
	void encender() {
		encendido = true;
		System.out.println("El vehiculo se encendió");
	}
	
	public String toString() {
		return "Marca: " + marca + " Modelo: " + modelo + " Año: " + año;
	}
	
	public static void main(String[] args) {
		ArrayList <Vehiculo> Garage = new ArrayList<>();
		Garage.add(new Auto("Ford", "Ka", 2020));
		Garage.add(new Auto("Fiat", "Chronos", 2024));
		
		Garage.add(new Moto("Honda", "XR", 1997));
		Garage.add(new Moto("Kawasaki", "Ninja", 1998));
		
		Garage.add(new Bici("Olmo", "Flash", 2022));
		Garage.add(new Bici("Venzo", "Raptor", 2023));
		
		for(Vehiculo v : Garage) {
			v.encender();
			System.out.println(v);
		}
	}
}

