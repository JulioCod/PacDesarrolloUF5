import java.util.Random;

public class Pasajeros {
    private Pasajero[] listaPasajeros;

    public Pasajeros (int numeroPasajeros){
        this.listaPasajeros = new Pasajero[numeroPasajeros];
        //Llenamos la lista de pasajeros
        for (int i = 0; i < listaPasajeros.length; i++) {
            Nombres nombres = new Nombres();
            String nombre = nombres.getNombreAleatorio();
            listaPasajeros[i] = new Pasajero(nombre, i);
        }
    }

    public Pasajero[] getListaPasajeros() {
        return listaPasajeros;
    }

    //desordenará la lista de pasajeros.
    //fuente clase números aleatorios: http://chuwiki.chuidiang.org/index.php?title=Generar_n%C3%BAmeros_aleatorios_en_Java
    public void desordenar() {
        // Instanciamos la clase Random
        Random aleatorio = new Random();
        Pasajero tmp;
        for (int i = 0; i < listaPasajeros.length; i++)
        {
            int sorteo = aleatorio.nextInt(listaPasajeros.length);      //posicion aleatoria dentro del array
            tmp = listaPasajeros[i];                                    //Guardamos el pasajero i en la memoria temporal
            listaPasajeros[i] = listaPasajeros[sorteo];                 //Ponemos en su sitio otro pasagero aleatorio
            listaPasajeros[sorteo] = tmp;                               //Y en el sitio que ha dejado libre ponemos a i
        }
    }

    @Override
    public String toString(){
        StringBuffer salida = new StringBuffer(listaPasajeros.length*10);
        for (int i = 0; i < listaPasajeros.length; i++) {
            salida.append(listaPasajeros[i].toString());
        }
        return salida.toString();
    }
}
