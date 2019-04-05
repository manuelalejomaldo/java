package ca.csf.dfc.classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompteGeneral c = new CompteGeneral(10);
		
		c.deposer(1000.00);		
		System.out.println(c.toString());
		
		c.retirer(500.55);
		System.out.println(c.toString());
		
		Debit d = new Debit(25);
		d.deposer(1000);
		System.out.println(d.toString());
		
		d.retirer(50.55);
		System.out.println(d.toString());

		Credit cr = new Credit(250);
		System.out.println(cr.toString());
		
		cr.retirer(250);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());

		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
		
		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());

		cr.retirer(10);
		System.out.println(cr.toString());
		cr.retirer(10);
		System.out.println(cr.toString());
	}

}
