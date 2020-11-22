package vehicule;

public class Maison extends Batiment implements AvecChauffage, AvecClimatisation {

    public Maison(double temperature){
        super(temperature);
    //    super(20);
    }

    @Override
    public void chauffer() {
        temperature = temperature+1;
    }

    @Override
    public void refroidir() {
        temperature = temperature-1;
    }
}
