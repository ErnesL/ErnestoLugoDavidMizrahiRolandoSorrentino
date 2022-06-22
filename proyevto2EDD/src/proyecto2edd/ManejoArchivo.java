/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2edd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import static proyecto2edd.Metodos.hashFunc;

/**
 *
 * @author davidmizrahi
 */
public class ManejoArchivo {
    //Esta funcionalidad permite la creacion y escritura del archivo.
      public static void crearArchivo(String resumenes){
          
    
        //File archivo = new File(nombreArchivo);
        
        try{
            PrintWriter pw = new PrintWriter("test//resumenes.txt");

        
//            PrintWriter salida = new PrintWriter(archivo);
//            salida.close();
            pw.print(resumenes);
            System.out.println("Se ha creado el archivo.");
            
            
        }catch(FileNotFoundException ex){ex.printStackTrace(System.out);}
    }
      
    public static void lecturaArchivo(String resumen, Articulo articulo){
    
       
            Scanner scanner = new Scanner(resumen);
          
            String linea = "";
            String string = "";


            while(scanner.hasNext()){
            
                linea = scanner.nextLine();
                if(linea.equals("Autores"))break; 

                articulo.setTitulo(linea);
//                System.out.println(articulo.getTitulo());
//            while(scanner.hasNext()){
//            
//                linea = scanner.nextLine();
//                string+= linea;
//                if(linea.equals("Resumen"))break;
//
//
//                    
//                }
//
//                
//            
//        }
            
//                Lista<String> lista = new Lista<>();
//                string = string.replace(" ", "/");
//                String[] stringArray = string.split("/");
//                //System.out.println(stringArray.length);
//                for (int i = 0; i < stringArray.length; i++) {
//                    //String string1 = stringArray[i];
//                    if(stringArray[i] == "Raquel"){System.out.println(i);
//}//else{System.out.println("hoola");}
//
//                    if(i == 0){
//                    
//                        stringArray[i] = stringArray[0].substring(7);
//                    }

                    
            
        }
//                lista.imprimirValores();

//               hashFunc(articulo);
           
//    }
    }
    public static void eliminarArchivo(){
    File f0 = new File("test//resumenes.txt");   
    if (f0.delete()) {   
      System.out.println(f0.getName()+ " file is deleted successfully.");  
    } else {  
      System.out.println("Unexpected error found in deletion of the file.");  
    }   
    
    }
}
        
        

