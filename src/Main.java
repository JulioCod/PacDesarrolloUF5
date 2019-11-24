import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese numero de asientos");
        int tamano = sc.nextInt();
        Avion ryanair = new Avion(tamano);
        ryanair.getEmbarque().desordenar(); //desordenar
        //Hacer que el primero en embarcar pierda la tarjeta.
        ryanair.getEmbarque().getListaPasajeros()[0].setTieneTarjEmb(false);
        ryanair.Embarque();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Con este otro código se puede lanzar muchas veces el problema y ver que curiosamente la probabilidad es del 50%///////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        int contar = 0;
        for (int i = 0; i < 100; i++) {

            int tamano = 50;
            Avion ryanair = new Avion(tamano);
            ryanair.getEmbarque().desordenar();
            ryanair.getEmbarque().getListaPasajeros()[0].setTieneTarjEmb(false);
            contar = contar + ryanair.Estaditica();
        }
        System.out.printf("La probabilidad de que el último asiento sea ocupado por el pasajero correco es del %d",
                contar);
        */





    }
}
