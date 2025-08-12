
package programdependencia.model;

public class Motor {
    private int cilinidros;
    private double cilindradas;

    @Override
    public String toString() {
        return "Motor{" + "cilinidros=" + cilinidros + ", cilindradas=" + cilindradas + '}';
    }

    public int getCilinidros() {
        return cilinidros;
    }

    public void setCilinidros(int cilinidros) {
        this.cilinidros = cilinidros;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Motor(int cilinidros, double cilindradas) {
        this.cilinidros = cilinidros;
        this.cilindradas = cilindradas;
    }
}
