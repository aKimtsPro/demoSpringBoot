package bstrom.akim.demoSpringBoot.demo.viaConfig;

public class CalculatriceMock implements Calculatrice {
    @Override
    public double addition(double a, double b) {
        return 0;
    }

    @Override
    public double getDernierResultat() {
        return 0;
    }

    @Override
    public void setDernierResultat(double dernierResultat) { }
}
