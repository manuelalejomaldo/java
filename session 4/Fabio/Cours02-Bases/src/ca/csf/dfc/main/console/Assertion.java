package ca.csf.dfc.main.console;

/**
 * Gestion des préconditions et postconditions
 *
 * @author C. Besse
 */
public class Assertion
{

    /**
     * Fonction de validation d'assertion.
     *
     * @param p_condition
     *            Condition à valider
     * @param p_message
     *            Message d'erreur
     * @throws IllegalArgumentException
     *             Si la condition n'est pas validÃ©e
     */
    public static void assertion(boolean p_condition, String p_message)
    {
        if (p_condition)
            throw new IllegalArgumentException(p_message);
    }

    /**
     * Fonction de validation de postcondition.
     *
     * @param p_condition
     *            Condition Ã  valider
     * @param p_message
     *            Message d'erreur
     * @throws IllegalArgumentException
     *             Si la condition n'est pas validée
     */
    public static void postcondition(boolean p_condition, String p_message)
    {
        if (p_condition)
            throw new IllegalArgumentException(p_message);
    }

    /**
     * Fonction de validation de précondition.
     *
     * @param p_condition
     *            Condition à  valider
     * @param p_message
     *            Message d'erreur
     * @throws IllegalArgumentException
     *             Si la condition n'est pas validée
     */
    public static void precondition(boolean p_condition, String p_message)
    {
        if (p_condition)
            throw new IllegalArgumentException(p_message);
    }
}
