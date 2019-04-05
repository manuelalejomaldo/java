using System;

namespace DemoSOLID
{
    public interface Transaction
    {
        bool EstValide();
        void ExecuterTransaction();
        void Annuler();
    }
}