using System;
using System.Collections.Generic;
using System.Text;

namespace DemoSOLID
{
    public class CreateurTransactionBanqueXYZ : CreateurTransaction
    {
        public Transaction CreerTransactionRetirer(Compte p_compte, decimal p_montant)
        {
            return new TransactionRetirerBanqueXYZ(p_compte, p_montant);
        }
    }
}
