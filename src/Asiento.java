public class Asiento {

    private int numeroAsiento;
    private int numeroBillete;
    private boolean ocupado = false;

    public Asiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroBillete() {
        return numeroBillete;
    }

    public void setNumeroBillete(int numeroBillete) {
        this.numeroBillete = numeroBillete;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString(){
        return String.format("Asiento numero: %s, Billete del Pasajero: , ¿Ocupado?: %s\n",
                String.valueOf(numeroAsiento) , String.valueOf(ocupado));
    }
}
