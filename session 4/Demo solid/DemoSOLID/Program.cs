using System;

namespace DemoSOLID
{
    class Program
    {
        static void Main(string[] args)
        {
            ATM atm = new ATM(new TiroirArgentUSB(), new CreateurTransactionBanqueXYZ());

            /// ...
            Compte compte = null; // ...
            decimal montant = 123.00m; // ...
            /// ...

            atm.Retirer(compte, montant);
        }
    }
}



