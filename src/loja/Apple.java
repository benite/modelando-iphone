package estabelecimento;

import equipamentos.internet.Internet;
import equipamentos.iphone.AparelhoMultifuncional;
import equipamentos.ipod.Ipod;
import equipamentos.phone.Phone;

public class Apple {

    public static void main(String[] args) {
        AparelhoMultifuncional em = new AparelhoMultifuncional();
        Internet internet = em;
        Ipod ipod = em;
        Phone phone = em;

        internet.navegar();
        ipod.tocar();
        phone.ligar();
    }

}
