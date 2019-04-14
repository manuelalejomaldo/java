package ca.csf.dfc.poo.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ex extends JFrame {
	
	public Ex() {
		
		this.setLayout(new BorderLayout());
		JPanel chiffres = new JPanel();
		chiffres.setLayout(new GridLayout(4, 3));
		chiffres.add(new JButton("7"));
		chiffres.add(new JButton("8"));
		chiffres.add(new JButton("9"));
		chiffres.add(new JButton("4"));
		chiffres.add(new JButton("5"));
		chiffres.add(new JButton("6"));
		chiffres.add(new JButton("1"));
		chiffres.add(new JButton("2"));
		chiffres.add(new JButton("3"));
		chiffres.add(new JButton("0"));
		chiffres.add(new JButton("."));
		chiffres.add(new JButton("="));

		this.add(chiffres, BorderLayout.CENTER);
		JLabel res = new JLabel("0", SwingConstants.RIGHT);
		this.add(res, BorderLayout.NORTH);

		JPanel op = new JPanel();
		op.setLayout(new BoxLayout(op, BoxLayout.PAGE_AXIS));
		op.add(new JButton("CE"));
		op.add(new JButton("+"));
		op.add(new JButton("-"));
		op.add(new JButton("/"));
		op.add(new JButton("*"));

		this.add(op, BorderLayout.EAST);

		this.pack();
	}
}
