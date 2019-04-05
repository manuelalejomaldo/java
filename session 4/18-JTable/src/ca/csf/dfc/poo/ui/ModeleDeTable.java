/**
 * 
 */
package ca.csf.dfc.poo.ui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import ca.csf.dfc.poo.EtatCivil;
import ca.csf.dfc.poo.Personne;

/**
 * @author nrichard
 */
public class ModeleDeTable extends AbstractTableModel
{
    private static final long serialVersionUID = 1L;

    private static final String[] NOM_COLS = { "Nom", "Age", "Etat civil" };

    private ArrayList<Personne> m_ListePers = new ArrayList<Personne>();

    /**
     * Constructeur
     */
    public ModeleDeTable()
    {
        super();
    }

    /**
     * Pour ajouter une personne.
     * 
     * @param p_Personne
     *            Personne a  ajouter
     */
    public void ajouter(Personne p_Personne)
    {
        if (p_Personne == null) { throw new NullPointerException(); }
        this.m_ListePers.add(p_Personne);

        // Pour avertir les TableModelListeners
        this.fireTableDataChanged();

    }
    
    /**
     * Pour remover personne
     * @param rowIndex
     */
    public void remover(int rowIndex) {
    	this.m_ListePers.remove(rowIndex);

        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    /**
     * @param p_rowIndex
     * @return
     */
    public Personne getPersonne(int p_rowIndex)
    {
        return m_ListePers.get(p_rowIndex);
    }

    /**
     * Redefinition.
     * 
     * @see javax.swing.table.TableModel#getRowCount()
     */
    @Override
    public int getRowCount()
    {
        return this.m_ListePers.size();
    }

    /**
     * Redefinition.
     * 
     * @see javax.swing.table.TableModel#getColumnCount()
     */
    @Override
    public int getColumnCount()
    {
        return NOM_COLS.length;
    }

    /**
     * Redefinition.
     * 
     * @see javax.swing.table.AbstractTableModel#getColumnName(int)
     */
    @Override
    public String getColumnName(int p_columnIndex)
    {
        return NOM_COLS[p_columnIndex];
    }

    /**
     * Redefinition.
     * 
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    @Override
    public Object getValueAt(int p_rowIndex, int p_columnIndex)
    {
        Personne p = this.m_ListePers.get(p_rowIndex);

        Object retour = null;
        switch (p_columnIndex)
        {
            case 0:
                retour = p.getNom();
                break;

            case 1:
                retour = p.getAge();
                break;

            case 2:
                retour = p.getEtat();
                break;

            default:
                throw new IndexOutOfBoundsException("Indice de colonne invalide : " + p_columnIndex);
        }

        this.fireTableDataChanged();//

        return retour;
    }
    
    
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true; //All the cells editable
    }

    @Override
    public void setValueAt(Object aValue, int p_rowIndex, int p_columnIndex) {
        if(aValue != null){
        	 Personne p = this.m_ListePers.get(p_rowIndex);

            switch(p_columnIndex){
                case 0:
                    p.setNom((String)aValue);
                    break;
                case 1:
                    p.setAge((Integer)aValue);
                    break;
                case 2:
                    p.setEtat((EtatCivil)aValue);
                    break;
            }
        }
    }

}
