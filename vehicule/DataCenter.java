package vehicule;

public class DataCenter extends Batiment implements AvecClimatisation {


    public DataCenter(double temperature){
        super(20);

    }

    @Override
    public void refroidir() {

        super.temperature = 20;
    }


}
