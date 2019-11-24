public class Avion {
    private Asiento[] listaAsientos;
    private Pasajeros embarque;

    public Avion(int numeroPasajeros) {
        this.listaAsientos = new Asiento[numeroPasajeros];
        for (int i = 0; i < listaAsientos.length; i++) {
            listaAsientos[i] = new Asiento(i);
        }
        embarque = new Pasajeros(numeroPasajeros);
    }

    public Pasajeros getEmbarque() {
        return embarque;
    }

    public Asiento[] getListaAsientos() {
        return listaAsientos;
    }

    public void Embarque(){
        for (int i = 0; i < listaAsientos.length; i++){
            if (i<listaAsientos.length - 1) embarque.getListaPasajeros()[i].ocuparAsiento(this);
            else {
                System.out.println("\n\n\nÚltimo pasajero:");
                embarque.getListaPasajeros()[i].ocuparAsiento(this);
                System.out.println("Asiento correcto: " + embarque.getListaPasajeros()[i].isEmbarqueCorrecto());
            }
        }
    }

    //Creo la clase estadística que devuelve un valor para poder resolver el problema de la revista.
    public int Estaditica(){
        int valor = 0;
        for (int i = 0; i < listaAsientos.length; i++){
            if (i<listaAsientos.length - 1) embarque.getListaPasajeros()[i].ocuparAsiento(this);
            else {
                embarque.getListaPasajeros()[i].ocuparAsiento(this);
                System.out.println("Asiento correcto: " + embarque.getListaPasajeros()[i].isEmbarqueCorrecto());
                valor = embarque.getListaPasajeros()[i].isEmbarqueCorrecto() ? 1:0;
            }
        }
        return valor;
    }
}

