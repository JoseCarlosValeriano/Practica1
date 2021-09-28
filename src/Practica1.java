import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

class Practica1 {

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
        reader.close();
        // Se instancia el fichero y el escritor de cuyo archivo volcaremos el resultado
        FileWriter fichero = null;
        PrintWriter pw = null;
        fichero = new FileWriter("/Users/josecarlos/Documents/FP Grado Superior/2º Curso/Programación multimedia y dispositivos móviles - Goyo/1º Tema/Practica1-1Hecha.txt");
        pw = new PrintWriter(fichero);
        //Imprimimos con un numero random los nombres aleatorios con sus notas aleatorias
        for (int i = 0; i < 10; i++) {
            Random rand2 = new Random();
            int n2 = rand2.nextInt(39);

            System.out.print("\n" + Nombres.get(n2));
            System.out.print("    | " + Notas.get(i));
            System.out.print("    | " + Notas.get(i + 1));
            System.out.print("    | " + Notas.get(i + 2));
            System.out.print("    | " + Notas.get(i + 3));
            System.out.print("|     La media es: " + ((Notas.get(i) + Notas.get(i + 2) + Notas.get(i + 3))) / 4);

            pw.print("\n" + Nombres.get(n2));
            pw.print("    | " + Notas.get(i));
            pw.print("    | " + Notas.get(i + 1));
            pw.print("    | " + Notas.get(i + 2));
            pw.print("    | " + Notas.get(i + 3));
            pw.print("|     La media es: " + ((Notas.get(i) + Notas.get(i + 2) + Notas.get(i + 3))) / 4);
        }
        pw.close();
        System.out.println("Se ha creado el archivo: " + fichero );
    }
    public static void main(String[] args) throws IOException {
        Mostrar("/Users/josecarlos/Documents/FP Grado Superior/2º Curso/Programación multimedia y dispositivos móviles - Goyo/1º Tema/Listado de nombres aleatorios.csv");
    }
}