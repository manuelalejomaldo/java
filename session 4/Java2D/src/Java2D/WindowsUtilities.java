/**
 * 
 */
package Java2D;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * @author ManueLMaldonado
 *
 */
public class WindowsUtilities {
	
	public static void setNativeLookAndFeel() {

		try {

		 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		 } catch(Exception e) {

		 System.out.println("Error setting native LAF: " + e);

		 }

	}

	public static JFrame openInJFrame(Container content,
			int width,
			 int height,
			String title,
			 Color bgColor) {

		JFrame frame = new JFrame(title);

			 frame.setBackground(bgColor);

			 content.setBackground(bgColor);

			 frame.setSize(width, height);

			 frame.setContentPane(content);

			 frame.addWindowListener(new ExitListener());

			 frame.setVisible(true);

			 return(frame);

	}

			 

	/** Uses Color.white as the background color. */

			 

	public static JFrame openInJFrame(Container content,
					int width, int height,String title) {

		return(openInJFrame(
					content, width, height, title, Color.white));

	}

			 

	 /** Uses Color.white as the background color, and the

	 * name of the Container's class as the JFrame title.

	*/

			 

	public static JFrame openInJFrame(Container content,
				int width, int height) {

		return(openInJFrame(
				content, width, height,content.getClass().getName(),
					Color.white));

	}

	
}
