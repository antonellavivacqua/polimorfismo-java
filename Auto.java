package hola;
public class Auto extends Vehiculo {
	
		public Auto(String marca, String modelo, int año) {
			super(marca, modelo, año);
		}
		
		@Override
		void encender() {
			encendido = true;
			System.out.println("El auto se encendió");
		}
		
		@Override
		public String toString() {
			return "Auto " + super.toString();
		}
}

