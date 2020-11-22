package exception.factorielle;

import com.sun.org.apache.xml.internal.resolver.CatalogException;

public class FactorielleN {

    public static <cat> void main(String[] args) {

        int result;

        try {
            result = calculerFactorielle(-10);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            result = calculerFactorielle(+12);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            result = calculerFactorielle(+13);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int calculerFactorielle(int nb) throws Exception {

        int factNb;
        int factNbPrec;

        if (nb<0) {
            throw (new Exception("nombre passé en paramètre négatif"));
        }

        if (nb == 0) {
            nb = 1;
        }

        factNb = nb;
        factNbPrec = factNb;

        for (int i = nb - 1; i != 0; i--) {
            factNb = factNb * i;
            if (factNb/i!=factNbPrec) {
                throw (new Exception("dépassement de capacité"));
            }
            factNbPrec = factNb;
        }

        return factNb;
    }

}
