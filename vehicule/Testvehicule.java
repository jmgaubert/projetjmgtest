package vehicule;

public class Testvehicule {

    public static void main(String[] args) {
     //   vehicule transport = new vehicule(4);
     //   transport.direBonjour();
     //   Velo transportv = new Velo();
     //   transportv.direBonjour();

     //   Maison maison = new Maison(25.0);
     //   System.out.println("temperature : "+maison.temperature);
     //   maison.chauffer();
     //   System.out.println("temperature : "+maison.temperature);
     //   maison.refroidir();
     //   System.out.println("temperature : "+maison.temperature);

        Batiment batiment = new Batiment(30.);
        System.out.println("temperature : "+batiment.temperature);

        DataCenter datacenter = new DataCenter(25.0);
        System.out.println("temperature : "+datacenter.temperature);
        System.out.println("temperature : "+datacenter.temperature);
        datacenter.refroidir();
        System.out.println("temperature : "+datacenter.temperature);
        datacenter.refroidir();
        System.out.println("temperature : "+datacenter.temperature);

        Maison maison = new Maison(35.);
        System.out.println("temperature : "+maison.temperature);
        maison.chauffer();
        System.out.println("temperature : "+maison.temperature);
        maison.chauffer();System.out.println("temperature : "+maison.temperature);
        maison.refroidir();
        System.out.println("temperature : "+maison.temperature);

    }
}
