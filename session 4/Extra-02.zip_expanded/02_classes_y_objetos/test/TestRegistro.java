import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// Mirad el bloque de comentarios que hay mas abajo
public class TestRegistro {

	private Registro registro;
	
	@Before
	public void setUp() {
		registro = new Registro();
	}

	@Test
	public void modificaNombre() {
		Persona persona = new Persona();
		String nombre = "nuevo";
		registro.modificaNombre(persona, nombre);
		assertEquals(nombre, persona.nombre);
		
	    nombre = "aun mas nuevo";
		registro.modificaNombre(persona, nombre);
		assertEquals(nombre, persona.nombre);
	}
	
	@Test
	public void alta () {

		String nombre = "nuevo";
		Persona persona = registro.alta(nombre);
		assertNotNull("No se ha devuelto una persona", persona);
		assertEquals(nombre, persona.nombre);
		
	}

	/*---------------------------------------------------
	 *  Fin de la ginkama y continuacion ejercicios:
	 *  Seguid las instrucciones que encontrareis en los
	 *  comentarios a los metodos
	 * ---------------------------------------------------*/
	
	/**
	 * Implementad en la clase Persona un metodo tieneNombre
	 * que devuelva un  boolean indicando si el objeto tiene nombre o no.
	 * Una vez implementado el metodo, descomentad las dos lineas del metodo 
	 * que sigue para probar vuestra implementacion
	 */
	@Test
	public void tieneNombre() {
		Persona persona = new Persona();
	//	assertFalse(persona.tieneNombre());
		persona.nombre = "Ramiro";
	//	assertTrue(persona.tieneNombre());
	}
	
	/**
	 * Vamos a guardar mas informacion para cada persona. Modificad
	 * la definicion de la clase Persona para poder guardar quien es
	 * el jefe de cada objeto. El jefe de una persona sera otro objeto
	 * del tipo Persona.
	 * 
	 * Como antes, una vez hecho esto, descomentad el codigo del metodo que sigue. 
	 * 
	 */
	@Test
	public void jefe() {
		Persona currante = new Persona();
	//	Persona jefe = new Persona();
	//	currante.jefe = jefe;
	}
	
	/**
	 * Mas dificil todavia: vamos a crear una nueva clase.
	 * En package explorer -> src, haced click con el boton derecho i seleccionad 
	 * new -> class
	 * En name poned Mascota y apretad Finish
	 * 
	 * Este proceso os creara un fichero Mascota.java, con la definicion (vacia) de la nueva 
	 * clase.
	 * 
	 * En la clase recien creada, guardaremos para cada mascota cual es su propietario.
	 * Una vez preparado el codigo, descomentad el codigo anterior y probad el test.
	 */
	@Test
	public void mascota() {
	//	Mascota mascota = new Mascota();
	//	mascota.propietario = new Persona();
	}
	
	/**
	 * A veces, para mejorar la facilidad de uso de una aplicacion, guardamos en nuestras
	 * clases informacion redundante. Esto, que es casi tabu en base de datos, esta mas 
	 * bien visto (en algunos casos) en el codigo Java.
	 * 
	 * Si habeis llegado aqui, teneis la clase Persona, y la clase Mascota con una propiedad 
	 * propietario. De esta manera, una mascota sabe cual es su propietario, pero una persona
	 * no conoce cual es su mascota (suponemos que solo tiene una)
	 * 
	 * Para este ejercicio haced los siguientes pasos:
	 *  - añadid a la clase Persona una propiedad mascota, del tipo Mascota
	 *  - añadid a la clase Mascota un metodo exactamente con esta firma :
	 *  		void fijaPropietario (Persona propietario) 
	 *  - este metodo debe modificar el propietario de la mascota y, a su vez, modificar el objeto
	 *    propietario para que guarde que esta es su mascota
	 *    
	 * Como siempre, descomentad el codigo del test y probad que funciona
	 * 
	 */
	@Test
	public void fijaPropietario() {
		
	//	Mascota perro = new Mascota();
	//	Persona roque = new Persona();
	//	perro.fijaPropietario(roque);
	//	assertSame(perro.propietario, roque);
	//	assertSame(roque.mascota, perro);
	}
}
