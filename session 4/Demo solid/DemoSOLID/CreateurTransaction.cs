using System;

namespace DemoSOLID
{
    public interface CreateurTransaction
    {
        Transaction CreerTransactionRetirer(Compte p_compte, decimal p_montant);
    }
}