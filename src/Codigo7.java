import java.util.HashMap; //Se importa la libreria para el hashmap
import java.util.Scanner; //Se importa la libreria para scanner

public class Codigo7 { 
public static void main(String[] args) { //Se agrega la clase main
    Scanner s = new Scanner(System.in); //Se completa el scanner system.in

    HashMap<String, String> capitales = new HashMap<>(); //se completa el nombre de capitales y se cambia por tipo string en ambos 
    
    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador", "San Salvador"); //Se completa con la capital 
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = ""; //Se arregla el string
    do {
      System.out.println("Escribe el nombre de un país y te diré su capital: "); //Se cambia por .out
      System.out.println("Para salir escribe 'salir' ");
      c = s.nextLine(); //Se cambia por nextline para recibir el string
      
      if (!c.equals("salir")) { //Se escribe bien equals
        if (capitales.containsKey(c)) { //Se completa el nombre de la variable y se cambia el value por Key porque estoy buscando la llave (pais)
          System.out.print("La capital de " + c); //Se pone el .out
          System.out.println(" es " + capitales.get(c)); //se pone bien capitales y se cambia el put por get porque queremos obtener el valor, no poner algo nuevo
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String ca = s.nextLine();
          capitales.put(c, ca);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    }while (!c.equals("salir"));  //Se completa bien el while con parentesis
  }
}//Codigo7

