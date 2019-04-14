/**
 * 
 */
package Java2D;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ManueLMaldonado
 *
 */
public class ExitListener extends WindowAdapter {

	public void windowClosing(WindowEvent event) {

		System.exit(0);

 }

}