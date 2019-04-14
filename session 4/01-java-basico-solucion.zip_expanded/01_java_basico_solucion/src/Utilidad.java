
/**
 * Para este ejercicio debereis implementar cada uno de los metodos segun la
 * descripcion del metodo.
 * 
 * Debeis sustituir las implementaciones actuales, que solo estan para que el codigo compile.
 * En ningun caso debeis cambiar la "firma" del metodo: tipo de devolucion, nombre o parametros.
 * 
 * Cada vez que implementeis un metodo, podreis comprobar si el resultado es correcto
 * ejecutando el juego de pruebas: 
 * 	   package explorer -> test -> default package -> TestUtilidad
 *     -> boton derecho -> run as ... -> JUnit test
 *  
 *  Para sucesivas ocasiones, no es necesario hacer todo el proceso sino que basta utilizar
 *  el boton con la flecha verde de la pantalla abierta con el JUnit.
 */
class Utilidad {


	/**
	 * Devuelve la suma de los dos parametros
	 */
    int suma (int a, int b) {
        return a + b;
    }

	/**
	 * Devuelve el menor de los dos parametros
	 */
    int menor (int a, int b) {
    	if (a < b) {
    		return a;
    	}
    	return b;
    }

	/**
	 * Devuelve el menor de los tres parametros
	 */
    int menor (int a, int b, int c) {
    	int menorAB = menor(a,b);
        return menor(menorAB, c); // tambien se podria hacer menor(menor(a,b),c)
    }

    /**
     * Devuelve true si entre los tres parametros hay dos o mas repetidos y
     * false si son todos diferentes
     */
    boolean hayRepetidos (int a, int b, int c) {
        return a == b || a == c || b == c;
    }

    /**
     * Calcula el sumatorio de un numero.
     * 
     * Por ejemplo sumatorio(5) debe devolver 1 + 2 + 3 + 4 + 5 = 15
     */
    long sumatorio (int a) {
    	long total = 0; // cuidado!! si declaramos int podemos tener un overflow
    	for (int i = 0; i <= a; i++) {
    		total += i;
    	}
    	return total;
    }
    
    /**
     * La funcion de fibonacci (f) se define como:
     *   - f(0) = 0
     *   - f(1) = 1
     *   - f(n) = f(n-1) + f(n-2) , para n >= 2.
     *   
     * Por cierto, Java permite llamadas recursivas.
     */
    long fibonacci(int a) {
    	if (a == 0) return 0;
    	if (a == 1) return 1;
    	return fibonacci(a-2) + fibonacci(a-1);
    }
    
    /**
     * Devuelve el entero resultado de redondear el numero en punto flotante a.
     * Si la parte decimal es >= 0.5 se redondea hacía arriba, si no, hacia abajo.
     * 
     * Ejemplo:
     *    redondea(2.2) = 2
     *    redondea(2.5) = 3
     *    redondea(2.6) = 3
     *    redondea(-2.5) = -2
     *    
     */
    int redondea (float a) {
    	int entero = (int) a;
    	float decimal = a - entero;
    	if (decimal >= 0.5) {
    		return entero + 1;
    	}
    	return entero;
    }
    
    /**
     * Devuelve el resultado de dividir a por b.
     * La clave es que NO debe devolver la division entera, sino la flotante.
     * Es decir divisionFloat(5,2) = 2.5
     * Si b es 0, el resultado debe ser 0.
     */
    float divisionFloat (int a, int b) {
    	if (b == 0) return 0;
    	return (float) a / b;
    }
    
    /**
     * Devuelve true si i solo si el numero a es primo
     */
    boolean esPrimo (int a) {
    	for (int i = 2; i < a; i++) {
    		if (a % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
