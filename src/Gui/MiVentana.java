/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
//PASO1 IMPORTAR 
import javax.swing.*;//libreria grafica standar multiplataforma
import java.awt.*;//libreria grafica del sistema OPERATIVO
//paso 8 importar la clase que  contiene la gui
import gui.MiVentana;
/**
 *
 * @author LP 13
 */
public class MiVentana {

    public static void main(String[] args) 
    {
        // TODO code application logic here
  MiVentana miventana = new MiVentana(); // creamos un  objeto jframe
   miventana.setVisible(true);// esta  sentencia muestra la  ventana
   miventana.setBounds(0, 0, 400, 400);//le  asignamos tamaño a la  ventana
   miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//esta  sentencia cierra la ventana 
        
    }
    
}
