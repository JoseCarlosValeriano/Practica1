import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class Practica1 {

    public static void Mostrar(String archivo) throws FileNotFoundException, IOException {

        // Array de Nombres y Notas
        ArrayList<String> Nombres = new ArrayList<>();
        ArrayList<Double> Notas = new ArrayList<>();
        FileReader f = new FileReader(archivo);
        BufferedReader reader = new BufferedReader(f);

        // Añadir Nombres y notas con while
        while ((reader.readLine()) != null) {
            Nombres.add((reader.readLine()));
            // Genera numero random que por cada vuelta del bucle cambiara para obtener las 4 notas en el rango del 0 al 10
            for (int e = 0; e < 4; e++) {
                Random rand = new Random();
                Double n = (double) rand.nextInt(10);
                Notas.add(n);
            }
        }


}

}
