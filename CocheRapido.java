
public class CocheRapido extends Coche {

    private double nitro;

    public CocheRapido() {
        super();
        this.nitro = 80;
    }

    public double getNitro() {
        return nitro;
    }

    public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito) {
        double nitroRestante = getNitro();
        if(nitroRestante > 0) {
                   
        }
        else {

        }
        return 0;
    }

}