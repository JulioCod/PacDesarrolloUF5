import java.util.Random;

class Pasajero {
    private String nombre;
    private int numeroAsiento;
    private boolean tieneTarjEmb = true;
    private boolean embarqueCorrecto;

    public Pasajero(String nombre, int numeroAsiento){
        this.nombre = nombre;
        this.numeroAsiento = numeroAsiento;
    };

    public void setNombre(String nombre){
        this.nombre = nombre;
    };

    public void setNumeroAsiento(int numeroAsiento){
        this.numeroAsiento = numeroAsiento;
    }

    public void setTieneTarjEmb(boolean tieneTarjEmb) {
        this.tieneTarjEmb = tieneTarjEmb;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public boolean getTieneTarjEmb() {
        return tieneTarjEmb;
    }

    public boolean isEmbarqueCorrecto() {
        return embarqueCorrecto;
    }

    @Override
    public String toString(){
        return String.format("Pasajero: %s, Asiento que le corresponde: %d, ¿Tiene tarjeta de embarque?: %s\n",
                nombre , numeroAsiento, String.valueOf(tieneTarjEmb));
    }

    //Vamos a crear ocupar asiento recibe una array list de asiento y busca uno libre.
    public void ocuparAsiento (Avion avion){
        if (tieneTarjEmb){
            //Se sienta en su asiento o en el siguiente que encuentre libre
            int max = avion.getListaAsientos().length;
            int asientoprobar = numeroAsiento;
            while (avion.getListaAsientos()[asientoprobar].isOcupado()) {
                if (asientoprobar + 1 < max) {
                    asientoprobar = asientoprobar + 1;
                }
                else asientoprobar = 0;
            }
            avion.getListaAsientos()[asientoprobar].setNumeroBillete(numeroAsiento);
            avion.getListaAsientos()[asientoprobar].setOcupado(true);
            embarqueCorrecto = this.numeroAsiento == asientoprobar ? true : false;
            System.out.printf("%s que tenía la plaza %d se ha sentado en el asiento: %d\n",
                    this.nombre, this.numeroAsiento,asientoprobar);
        }
            //Si no tiene tarjeta de embarque empieza a buscar por uno aleatorio para disimular.
        else {
            int max = avion.getListaAsientos().length;
            Random random = new Random(); // http://chuwiki.chuidiang.org/index.php?title=Generar_n%C3%BAmeros_aleatorios_en_Java
            int asientoprobar = random.nextInt(max);
            while (avion.getListaAsientos()[asientoprobar].isOcupado()) {
                if (asientoprobar + 1 < max) {
                    asientoprobar = asientoprobar + 1;
                }
                else asientoprobar = 0;
            }
            avion.getListaAsientos()[asientoprobar].setNumeroBillete(numeroAsiento);
            avion.getListaAsientos()[asientoprobar].setOcupado(true);
            embarqueCorrecto = this.numeroAsiento == asientoprobar ? true : false;
            System.out.printf("%s que tenía la plaza %d se ha sentado en el asiento: %d\n",
                    this.nombre, this.numeroAsiento,asientoprobar);
        }
    }
}
