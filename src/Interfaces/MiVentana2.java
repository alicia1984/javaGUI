/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
//paso 8 importar la clase con la ventana
import javagui.Windows;//import paquete.clase
import javax.swing.JFrame;
/**
 *
 * @author LP 13
 */
public class MiVentana2 {

    public static void main(String[] args) 
    {
        // TODO code application logic here
   Windows ventana = new Windows(); // creo un  objeto  tipo windows
 ventana.setVisible(true);
  ventana.setBounds(0, 0, 600, 600);
   ventana.setTitle("Mi Primera aplicacion  con  ventanas");//  siguiente  ints. le  pone  titulo a la  ventana
  ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//la  siguiente  sentencia  es para  finalizar el  proyecto  al  cerrar
    
    }  
}
