/**
 *
 */
package ca.csf.dfc.poo.battleship.tools;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Vector;

/**
 * @author C. Besse
 */
public class PropertyObservable<T>
{

    /**
     * Pour la gestion des updates
     */
    private Vector<PropertyChangeListener> m_obs;

    public PropertyObservable()
    {
        this.m_obs = new Vector<>();
    }

    /**
     * Adds an observer to the set of observers for this object, provided that it is not the same as some observer
     * already in the set. The order in which notifications will be delivered to multiple observers is not specified.
     * See the class comment.
     *
     * @param o
     *            an observer to be added.
     * @throws NullPointerException
     *             if the parameter o is null.
     */
    public synchronized void addObserver(PropertyChangeListener o)
    {
        if (o == null)
            throw new NullPointerException();
        if (!this.m_obs.contains(o))
            this.m_obs.addElement(o);
    }

    /**
     * Returns the number of observers of this {@code Observable} object.
     *
     * @return the number of observers of this object.
     */
    public synchronized int countObservers()
    {
        return this.m_obs.size();
    }

    /**
     * Deletes an observer from the set of observers of this object. Passing {@code null} to this method will have no
     * effect.
     *
     * @param o
     *            the observer to be deleted.
     */
    public synchronized void deleteObserver(PropertyChangeListener o)
    {
        this.m_obs.removeElement(o);
    }

    /**
     * Clears the observer list so that this object no longer has any observers.
     */
    public synchronized void deleteObservers()
    {
        this.m_obs.removeAllElements();
    }

    /**
     * If this object has changed, as indicated by the {@code hasChanged} method, then notify all of its observers and
     * then call the {@code clearChanged} method to indicate that this object has no longer changed.
     * <p>
     * Each observer has its {@code update} method called with two arguments: this observable object and {@code null}.
     * In other words, this method is equivalent to: <blockquote>{@code
     * notifyObservers(null)}</blockquote>
     *
     * @see java.util.Observable#clearChanged()
     * @see java.util.Observable#hasChanged()
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers()
    {
        this.notifyObservers(null);
    }

    /**
     * If this object has changed, as indicated by the {@code hasChanged} method, then notify all of its observers and
     * then call the {@code clearChanged} method to indicate that this object has no longer changed.
     * <p>
     * Each observer has its {@code update} method called with two arguments: this observable object and the {@code arg}
     * argument.
     *
     * @param arg
     *            any object.
     * @see java.util.Observable#clearChanged()
     * @see java.util.Observable#hasChanged()
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers(T p_arg)
    {
        /*
         * a temporary array buffer, used as a snapshot of the state of current Observers.
         */
        PropertyChangeListener[] arrLocal;

        synchronized (this)
        {
            arrLocal = this.m_obs.toArray(new PropertyChangeListener[0]);
        }

        for (int i = arrLocal.length - 1; i >= 0; i--)
            arrLocal[i].propertyChange(new PropertyChangeEvent(this, "", null, p_arg));
    }

}
