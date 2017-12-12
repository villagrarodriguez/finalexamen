/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import com.gvillena.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author MiguelGz
 */
public class Metodo {
      Vector vPrincipal =new Vector();
    
        public void guardar(Metodo unmetodo){
            vPrincipal.addElement(unmetodo);
                                 
        }    
        
        public void guardarArchivo(Metodo cliente){
            try {
                FileWriter fw=new FileWriter("RegistroVentas.txt",true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter pw=new PrintWriter(bw);
                pw.print("Nombre del Titular: ");
                pw.print("|Tarjeta :");
                pw.print("|Vence en :");
                pw.print("|Proviene de la Ciudad de :");
                pw.print("Equipo :"+"Caracteristicas :");
                pw.print("|Pantalla :");
                pw.print("|Camara : ");
                pw.print("|Procesador:");
                pw.print("|Tipo de Plan: ");
                pw.print("|Precio del Equipo :");
               
                
                        }catch (Exception e){
                JOptionPane.showMessageDialog(null, e );
                
        
        }
    
     }
    
    
}
