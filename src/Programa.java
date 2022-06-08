import entities.ImpressoraCanon;
import entities.ImpressoraEpson;

import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {
        ImpressoraEpson epson = new ImpressoraEpson(
                "LX-3000",
                "USB",
                LocalDate.now(),
                5,
                23.0
        );
        System.out.println(epson);
        epson.imprimir();

        ImpressoraCanon canon = new ImpressoraCanon(
                "Sx-5000",
                "UBS/Wireless",
                LocalDate.now(),
                0,
                5.00
        );
        System.out.println(canon);
        canon.imprimir();
    }
}
