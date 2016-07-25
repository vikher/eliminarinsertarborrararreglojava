/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminarinsertarbuscar;

import java.util.Arrays;

/**
 *
 * @author vhern
 */
public class Eliminarinsertarbuscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] haystack = {1, 2, 3};
        int needle = 3;
        //insertar
        haystack = addElement(haystack, 5);
        haystack = addElement(haystack, 6);
        System.out.println("el elemnto insertado " + Arrays.toString(haystack));
        //buscar
        boolean found = Arrays.stream(haystack).anyMatch(x -> x == needle);
        if (found == true) {
            System.out.println("el elemnto existe");
        } else {
            System.out.println("el elemnto no existe");
        }
        //borrar
        int[] c = removeElement(haystack, 1);
        System.out.println("el elemnto " + Arrays.toString(c));
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
