package bstrom.akim.demoSpringBoot.viaConfig;

public class CalculatriceImpl implements Calculatrice {

    private double dernierResultat;

    public double addition(double a, double b){
        return dernierResultat = a + b;
    }

    public double getDernierResultat() {
        return dernierResultat;
    }

    public void setDernierResultat(double dernierResultat) {
        this.dernierResultat = dernierResultat;
    }
}
