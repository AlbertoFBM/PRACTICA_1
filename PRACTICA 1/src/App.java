import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al menú de ejercicios!!!");
        System.out.println("Estas son los ejercicios que puedes ver:");
        mostrarMenu();
        System.out.println("Ahora elige que ejercicio quieres ver:");
        mostrarEjercicios();
    }
    public static void mostrarMenu(){
        // Primer ejercicio
        System.out.println("1.- Leer 5 números (con bucle por favor, no pongáis 5 scanner" +
        " consecutivos) y mostrarlos en el mismo orden introducido. Lo 5 números se deben" +
        " almacenar en un array.");
        // Segundo ejercicio
        System.out.println("2.- Leer 5 números y mostrarlos en orden inverso al introducido.");
        // Tercer ejercicio
        System.out.println("3.- Leer 5 números por teclado y a continuación realizar la media de los" +
        " números positivos, la media de los negativos y contar el número de ceros que se han" +
        " introducido por teclado.");
        // Cuarto ejercicio
        System.out.println("4.- Reciba como parámetro un texto y devuelva la cantidad de caracteres" +
        " que incorpora el texto.");
        // Quinto ejercicio
        System.out.println("5.- Reciba como parámetro un texto y devuelva el texto invertido.");
        // Sexto ejercicio
        System.out.println("6.- Reciba como parámetro un texto y lo devuelva sin espacios en blanco.");
        // Séptimo ejercicio
        System.out.println("7.- Reciba como parámetro dos cadenas y las devuelva concatenadas.");
        // Octavo ejercicio
        System.out.println("8.- Reciba como parámetro una cadena y una vocal, el método sustituye" +
        " todas las vocales de la cadena por la vocal que se ha pasado como parámetro (no" + 
        " devuelve nada).");
        // Noveno ejercicio
        System.out.println("9.- Reciba como parámetro una cadena, y muestre el código ASCII de cada" +
        " uno de los caracteres de la cadena (no devuelve nada el método).");
    }
    public static void mostrarEjercicios(){
        Scanner lector = new Scanner(System.in);
        int opcion = lector.nextInt();
        switch(opcion){
            case 1:
                System.out.println("<--   Has elegido el ejercicio 1:   -->");
                almacenarNumeros();
                break;
            case 2:
                System.out.println("<--   Has elegido el ejercicio 2:   -->");
                invertirNumeros();
                break;
            case 3:
                System.out.println("<--   Has elegido el ejercicio 3:   -->");
                hacerMedias();
                break;
            case 4:
                System.out.println("<--   Has elegido el ejercicio 4:   -->");
                //cuartoEjercicio();
                break;
            case 5:
                System.out.println("<--   Has elegido el ejercicio 5:   -->");
                //quintoEjercicio();
                //devuelve strings
                break;
            case 6:
                System.out.println("<--   Has elegido el ejercicio 6:   -->");
                //sexto ejercicio();
                break;
            case 7:
                System.out.println("<--   Has elegido el ejercicio 7:   -->");
                //septimoEjercicio();
                break;
            default:
                System.out.println("Escribe el número correcto del ejercicio que quieras ver");
                break;
        }
    }
    public static void almacenarNumeros(){
        Scanner lectorNumeros = new Scanner(System.in);
        int [] mi_array = new int [5];
        int i;
        for(i=0; i<mi_array.length; i++){
            System.out.printf("Introduzca un número %d: ", i+1);
            mi_array[i] = lectorNumeros.nextInt();
        }
        System.out.println("Los números que has puesto són los siguientes:");
        for(i=0; i<mi_array.length; i++){
            System.out.printf("%d - ", mi_array[i]);
        }  
    }
    public static void invertirNumeros(){
        Scanner lectorNumeros = new Scanner(System.in);
        int [] mi_array2 = new int [5];
        int i;
        for(i=0; i<mi_array2.length; i++){
            System.out.printf("Introduzca un número %d: ", i+1);
            mi_array2[i] = lectorNumeros.nextInt();
        }
        System.out.println("Los números que has puesto en orden invertidos són los siguientes:");
        for (i = mi_array2.length - 1; i >= 0 ; i--) {
            System.out.printf("%d - ", mi_array2[i]);
        }
    }
    public static void hacerMedias(){
        Scanner lectorNumeros = new Scanner(System.in);
        int [] mi_array3 = new int [5];
        int i;
        for(i=0; i<mi_array3.length; i++){
            System.out.printf("Introduce un número %d: ", i+1);
            mi_array3[i] = lectorNumeros.nextInt();
            if(mi_array3[i] > 0){
                
            }
        }
    }
}
