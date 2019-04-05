package ca.csf.dfc.poo.ui;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class MyButtonGroup extends ButtonGroup implements Iterable<JRadioButton>
{

    @Override
    public Iterator<JRadioButton> iterator()
    {
        ArrayList<JRadioButton> a = new ArrayList<JRadioButton>();
        Enumeration<AbstractButton> buttons = this.getElements();
        while (buttons.hasMoreElements())
        {
            JRadioButton button = (JRadioButton) buttons.nextElement();
            a.add(button);
        }

        return a.iterator();

    }

}
