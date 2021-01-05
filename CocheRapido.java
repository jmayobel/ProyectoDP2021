
public class CocheRapido extends Coche {

    private double nitro;

    public CocheRapido(String nombre, Velocidad velocidad, Combustible combustible) {
        super(nombre, velocidad, combustible);
        this.nitro = 80;
    }

    public double getNitro() {
        return nitro;
    }

    @Override
    public double getVelocidadReal(PilotoInterfaz piloto, Circuito circuito) {
        double nitroRestante = getNitro();
        double velocidadNitro = super.getVelocidadReal(piloto, circuito);
        if(nitroRestante >= super.getVelocidadReal(piloto, circuito)*0.2) {
            velocidadNitro = super.getVelocidadReal(piloto, circuito) + super.getVelocidadReal(piloto, circuito)*0.2;
            nitroRestante = super.getVelocidadReal(piloto, circuito)*0.2 - nitroRestante;
        }
        else {
            velocidadNitro = super.getVelocidadReal(piloto, circuito) + nitroRestante;
            nitroRestante = 0;
        }
        return velocidadNitro;
    }

}