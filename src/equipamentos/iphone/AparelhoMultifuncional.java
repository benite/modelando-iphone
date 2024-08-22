package equipamentos.iphone;

import equipamentos.internet.Internet;
import equipamentos.ipod.Ipod;
import equipamentos.phone.Phone;

public class AparelhoMultifuncional implements Internet, Phone, Ipod {

    public void navegar() {
        System.out.println("NAVEGANDO VIA APARELHO IPHONE");
    }

    public void tocar() {
        System.out.println("TOCANDO MÚSICAS VIA APARELHO IPHONE");
    }

    public void ligar() {
        System.out.println("DISCANDO NO CELULAR VIA APARELHO IPHONE");
    }

}
