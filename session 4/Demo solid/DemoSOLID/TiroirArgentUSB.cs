using System;
using System.Collections.Generic;
using System.Text;

namespace DemoSOLID
{
    class TiroirArgentUSB : TiroirArgent
    {
        public void DistribuerArgent(decimal p_montant)
        {
            Console.Out.WriteLine($"{this.GetType().Name} - Distribution de {p_montant}");
        }
    }
}
