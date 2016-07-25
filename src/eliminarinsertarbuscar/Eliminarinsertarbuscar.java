package Eliminarinsertarbuscar;

import java.util.Arrays;
import java.util.Scanner;

public class Eliminarinsertarbuscar {

    public static void main(String[] args) {
        int choiceentry;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Ingresa \"1 insertar\", \"2 borrar\", \"3 buscar\" o \"4 salir\"");
            choiceentry = scan.nextInt();
            int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            switch (choiceentry) {
                case 1:
                    System.out.println("ingresaste insertar");
                    System.out.println("el arreglo original es " + Arrays.toString(arreglo));
                    //insertar
                    System.out.println("inserta el nuevo elemento");
                    Scanner scan1 = new Scanner(System.in);
                    int elemento = scan1.nextInt();
                    arreglo = addElement(arreglo, elemento);
                    System.out.println("el nuevo arreglo es " + Arrays.toString(arreglo));

                    break;
                case 2:
                    //borrar
                    System.out.println("ingresaste borrar");
                    System.out.println("el arreglo original es " + Arrays.toString(arreglo));
                    System.out.println("inserta el indice del elemento borrar");
                    Scanner scan2 = new Scanner(System.in);
                    int borrar = scan2.nextInt();
                    int[] c = removeElement(arreglo, borrar);
                    System.out.println("el nuevo arreglo es " + Arrays.toString(c));
                    break;
                case 3:
                    System.out.println("ingresaste buscar");
                    System.out.println("el arreglo original es " + Arrays.toString(arreglo));
                    //buscar
                    System.out.println("inserta el elemento a buscar");
                    Scanner scan3 = new Scanner(System.in);
                    int buscar = scan3.nextInt();
                    boolean found = Arrays.stream(arreglo).anyMatch(x -> x == buscar);
                    if (found == true) {
                        System.out.println("el elemento existe");
                    } else {
                        System.out.println("el elemento no existe");
                    }
                    
                    break;
                case 4:
                    System.out.println("saliendo del programa");
                    break;
                default:
                    System.out.println("La opcion debe ser entre 1 y 4.");
            }
        } while (choiceentry != 4);
    }

    public static int[] removeElement(int[] original, int element) {
        int[] n = new int[original.length - 1];
        System.arraycopy(original, 0, n, 0, element);
        System.arraycopy(original, element + 1, n, element, original.length - element - 1);
        return n;
    }

    static int[] addElement(int[] a, int e) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }

}
