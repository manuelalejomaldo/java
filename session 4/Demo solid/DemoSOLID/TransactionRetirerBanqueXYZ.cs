using System;
using System.Collections.Generic;
using System.Text;

namespace DemoSOLID
{
    public class TransactionRetirerBanqueXYZ : Transaction
    {
        private readonly Compte m_compte;
        private decimal m_montant;

        public TransactionRetirerBanqueXYZ(Compte p_compte, decimal p_montant)
        {
            this.m_compte = p_compte;
            this.m_montant = p_montant;
        }

        public void Annuler()
        {
            throw new NotImplementedException();
        }

        public bool EstValide()
        {
            return true;
        }

        public void ExecuterTransaction()
        {
            Console.Out.WriteLine($"{this.GetType().Name} - Executer transaction retirer {m_montant}");
        }
    }
}
