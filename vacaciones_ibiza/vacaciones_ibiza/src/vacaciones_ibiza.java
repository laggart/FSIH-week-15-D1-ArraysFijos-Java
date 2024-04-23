import java.util.Scanner;

public class vacaciones_ibiza {
    public static void main(String[] args) throws Exception {

        String[] participantes = {"Montse", "Neus", "Nuria", "Carme", "Gemma"}; // Array participantes

        Scanner teclado = new Scanner(System.in);

        boolean continuar = true; // Variable de control

        while(continuar){
            int indicePremiado = (int)(Math.random() * participantes.length); // generamos el indice ganador
            String ganador = participantes[indicePremiado]; // Elegimos al premiado

            System.out.println("El ganador es: " + ganador + " enhorabuena!"); 

            System.out.println("Quieres elegir otro ganador? (S/N)"); //pregunta para salir del bucle
            String respuesta = teclado.nextLine();

            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        teclado.close();
    }
}
