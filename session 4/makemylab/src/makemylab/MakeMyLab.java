package makemylab;
 
import java.awt.event. *;
 
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseAdapter;
import java.awt.*;
import javax.swing.*;
 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
 
import org.xml.sax.helpers.DefaultHandler;
 
 
 
 
 
public class MakeMyLab {
 
 
 
    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
 
    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
        JFrame frame = new JFrame("Make My Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 
 
        //Set up the content pane.
 
        setUpLayout(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
      
       
    }
 
    public static void setUpLayout(Container pane){
 
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(200, 700));
        menuPanel.setBorder(BorderFactory.createLineBorder(Color.black,3));
 
        pane.add(menuPanel, BorderLayout.LINE_START);
 
 
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(700,700));
;
 
       JButton newRectangle = new JButton("New Rectangle");
       newRectangle.addActionListener(new ButtonListener());
       
        
 
        newRectangle.setPreferredSize( new Dimension(150,50));
        menuPanel.add(newRectangle, BorderLayout.CENTER);
 
        
 
 
 
        pane.add(new MyPanel(), BorderLayout.CENTER);
         
 
         
         
 
         
 
 
    }
 
 
}
 
class globalVariables{
 
    public static int numbComputers =12;
    public static boolean addRect = false;
 
 
 
}
 
class MyPanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	globalVariables counters = new globalVariables();
    int counter = counters.numbComputers;
    RedSquare[] redSquare = new RedSquare[counter];
 
 
    
    int Computers;
 
 
 
 
 
 
 
    Point dragPoint;
    RedSquare selectedRectangle;
 
    public MyPanel() {
        this.createSquares(counter);
        setBorder(BorderFactory.createLineBorder(Color.black,3));
 
        
		//this.add(table[0]);
 
 
 
 
        addMouseListener(new MouseAdapter(){
 
            @Override
            public void mousePressed(MouseEvent e){
                selectedRectangle = null;
                for(int i =0; i< counter; i++){
                    if (redSquare[i].contains(e.getPoint())) {
                        selectedRectangle = redSquare[i];
                        dragPoint = e.getPoint();
                    }
                }
               
            }
 
            @Override
            public void mouseReleased(MouseEvent e){
                 
                for(int i =0; i< counter; i++){
                    redSquare[i].x= (redSquare[i].x/20) * 20+3;
                    redSquare[i].y= (redSquare[i].y/20) * 20+3;
                    repaint();
 
                }
            }
                         
        });
 
 
 
        addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent e){
 
                    try {
                        int dx = e.getX() - dragPoint.x;
                        int dy = e.getY() - dragPoint.y;
                        selectedRectangle.translate(dx, dy);
                        dragPoint = e.getPoint();
                        repaint();
                    } catch (NullPointerException ex) { /* nothing to drag */ }
            }
 
 
        });
 
 
 
 
       setPreferredSize(new Dimension(900,900));
    }
    @Override
    public void paintComponent(Graphics g) {
 
        super.paintComponent(g);
 
        int gridHeight = 20;
        int widthHeight = 20;
        Dimension size = getSize();
        double width = size.getWidth();
        double height = size.getHeight();
 
 
        for(int i = 0; i< height; i = i+gridHeight){
            g.setColor(Color.lightGray);
            g.drawLine(0, i, (int) width, i);
 
        }
        for(int i =0; i <width; i= i+widthHeight){
            g.setColor(Color.lightGray);
            g.drawLine(i, 0, i,(int)height);
 
        }
 
 
        Font font = new Font("Arial", Font.BOLD, 25);
 
 
 
         
         
         for(int i =0; i< counter; i++){
 
             //Keeps the Rectangle inside the window
             if(redSquare[i].x > getWidth())
                 redSquare[i].x = getWidth()-redSquare[i].width;
             if(redSquare[i].x < 0)
                 redSquare[i].x = 0;
             if(redSquare[i].y > getHeight())
                 redSquare[i].y = getHeight()- redSquare[i].height;
             if(redSquare[i].y < 0)
                 redSquare[i].y = 0;
 
               
       
             // get metrics from the graphics
            FontMetrics metrics = g.getFontMetrics(font);
            // get the height of a line of text in this font and render context
            int hgt = metrics.getHeight();
            // get the advance of my text in this font and render context
            int adv = metrics.stringWidth(redSquare[i].myNumber);
 
            //Create first quare the serve as border
            g.setColor(Color.BLACK);
            g.fillRect(redSquare[i].x-2, redSquare[i].y-2, redSquare[i].width+4, redSquare[i].height+4);
            //Create green square for each computer
            g.setColor(Color.GREEN);
            g.fillRect(redSquare[i].x, redSquare[i].y, redSquare[i].width, redSquare[i].height);
            //Number on each square
            g.setColor(Color.BLACK);
            g.setFont(font);
            
             
            g.drawString(redSquare[i].myNumber, redSquare[i].x+ (redSquare[i].width/2)- adv/2 , redSquare[i].y+ (redSquare[i].height/2)+ hgt/2-5);
 
            //g.draw(rect);
 
 
 
 
        }
 
 
 
    }
 
     
 
 
 
    public void createSquares(int counter){
              
 
             for( int i=0; i< counter; i++){
                redSquare[i] = new RedSquare(200, 200, 50, 50);
 
                redSquare[i].myNumber = Integer.toString(i);//(char)(i);
 
              //  offset = offset + 70;
                 
 
             }
 
        }
 
    }
 
 
 
class RedSquare extends Rectangle {
    
    String myNumber;
 
    public RedSquare(int x, int y, int w, int h) {
        super(x, y, w, h);
      
    }
}
 
 
 
class ButtonListener implements ActionListener {
    ButtonListener(){
 
    }
    public void actionPerformed(ActionEvent e){
        if ( e.getActionCommand().equals("New Rectangle")){
            System.out.println("Button clicked");
            globalVariables.addRect = true;
 
            //Resizable resizer;
 
 
 
             
 
             
 
 
             
        }
 
 
    }
}