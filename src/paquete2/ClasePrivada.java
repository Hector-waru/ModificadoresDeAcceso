package paquete2;

public class ClasePrivada {
     //atributos
	private String nombre;
	private int edad;
	//metodos - aqui se encagar de modficar sus valores
	//Este metodo si tiene acceso y lo podemos llamar desde otros lados
	public void setSaludar(String nombre) {//fijar un valor
		this.nombre=nombre;
		
	}
	public String getSaludar() {
		return this.nombre;
	}
}
