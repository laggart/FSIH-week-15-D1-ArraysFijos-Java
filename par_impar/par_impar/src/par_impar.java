public class par_impar {
    public static void main(String[] args) throws Exception {
        int [] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; 
        int [] arrayPares = new int[10];
        int [] arrayImpares = new int[10];

        int cuantosPares = 0;
        int cuantosImpares = 0;

                
        for(int i = 0; i < myArray.length; i++) {
            if (myArray[i]%2 == 0) {
                arrayPares[cuantosPares] = myArray[i];
                cuantosPares++;
            } else {
                arrayImpares[cuantosImpares] = myArray[i];
                cuantosImpares++;
            }
        }
        
        System.out.println("\nimpares:");
        for(int i = 0; i < myArray.length; i++) {
            if (myArray[i]%2 != 0) {
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println("Números pares:");
        for (int i = 0; i < cuantosPares; i++){
            System.out.print(arrayPares[i] + " ");
        }

        System.out.println("\nTodos los números:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("");
        
    }
}
