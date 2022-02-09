package paquete2;

//importacion de clases
import paquete1.ClaseDefault;
import paquete1.ClaseProtected;
public class Main extends paquete1.ClaseProtected {//heredar esa clase especifica
    public static void main(String[] args) {
		ClaseDefault prueba = new ClaseDefault();
		//Se necestia cambiar el modificador de acceso
		//prueba.mostrar();
		ClasePrivada privada = new ClasePrivada();
		
		//Surgen errores pues no son visibles, accesibles desde la misma clase
		/*privada.edad=30;
		privada.nombre="juan";*/
		privada.setSaludar("JUAN");
		System.out.println(privada.getSaludar());
		
		//objeto de la clase protected
		
		Main protegido = new Main();
		protegido.setEdad(123);
		System.out.println(protegido.getEdad()); 
		
    }
}
