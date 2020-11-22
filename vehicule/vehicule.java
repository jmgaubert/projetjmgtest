package vehicule;

public class vehicule {

    int nombreRoues;

    vehicule(int nombreRoues) {

        this.nombreRoues = nombreRoues;

    }

    public void direBonjour() {

    //    System.out.println("Bonjour, je suis un véhicule à " + nombreRoues + " roues");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "vehicule{" +
                "nombreRoues=" + nombreRoues +
                '}';
    }
}
