/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import java.io.FileWriter;
import java.io.StringWriter;
import org.json.simple.*;

/**
 *
 * @author alumno
 */
import com.google.gson.Gson;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // JSONObject obj = new JSONObject();
        // obj.put("nombre", "foo");
        // obj.put("numero", new Integer(100));
        // obj.put("saldo", new Double(1000.21));
        // obj.put("cliente_vip", new Boolean(true));
        // obj.put("nickname", null);
        // System.out.println("RESULTADO\n");
        // System.out.println(obj);        
                
        // TODO code application logic here
        // Gson gson = new Gson();
        // int[] ints = {1, 2, 3, 4, 5};
        // String[] strings = {"abc", "def", "ghi"};

        // Serialization
        // gson.toJson(ints);     // ==> [1,2,3,4,5]
        // gson.toJson(strings);  // ==> ["abc", "def", "ghi"]

        // Deserialization
        // int[] ints2 = gson.fromJson("[1,2,3,4,5]", int[].class); 
        
        // Deserialization        
        Gson gson = new Gson();        
        TelefonoMovil[] ints2 = gson.fromJson(
"  [" +
"    {\n" +
"      \"descripcion\": \"Galaxy S7 (Claro)\",\n" +
"      \"pantalla\": \"4.3\\\"\",\n" +
"      \"camara\": \"12MP\",\n" +
"      \"procesador\": \"2.7Ghz\"\n" +
"    },\n" +
"    {\n" +
"      \"descripcion\": \"iPhone 6 (Claro)\",\n" +
"      \"pantalla\": \"6.2\\\"\",\n" +
"      \"camara\": \"8MP\",\n" +
"      \"procesador\": \"2.3Ghz\"\n" +
"    }\n" +
"  ]", TelefonoMovil[].class); 
        // ==> ints2 will be same as ints
        for (TelefonoMovil ints21 : ints2) {
            System.out.println("Nombre : " + ints21.getDescripcion());
        }
        
    }
    
}
