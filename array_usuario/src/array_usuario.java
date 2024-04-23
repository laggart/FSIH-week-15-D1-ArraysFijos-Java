import java.util.Scanner;

public class array_usuario {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Pedimos el tamaño del Array
        System.out.println("Introduce el tamaño que quieras para el array:");

        int tamanoArray = teclado.nextInt();

        //Creamos un array con el tamaño recibido

        int[] arrayUser = new int[tamanoArray];

        //Pedimos los valores con un bucle for hasta que el tamaño = al tamaño dado por el User 

        for (int i = 0; i < arrayUser.length; i++) {
            System.out.println("Cual es el " + (i + 1) + " elemento del Array?");
            arrayUser[i] = teclado.nextInt();
        }

        // Imprimimos el array 
    
        System.out.println("tu array es:");
        for (int i = 0; i < arrayUser.length; i++){
            System.out.print(arrayUser[i] + " ");
        }
        // Limpiamos el %
        System.out.println("");

        teclado.close();
    }
}
