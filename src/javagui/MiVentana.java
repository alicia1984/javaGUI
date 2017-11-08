/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;
//PASO1 IMPORTAR 
//import Gui.*;
import javax.swing.*;//libreria grafica standar multiplataforma
import java.awt.*;//libreria grafica del sistema OPERATIVO
/**
 *
 * @author LP 13
 */
//paso2 heredar mi  clase desde jframe
public class MiVentana extends JFrame{

  //paso 3 declara  los  elementos  que   vamos a  utulizar
    JPanel mipanel;//creacion  de objeto  panel
    JLabel milabel;
    JTextField mitexto;
    JButton miboton;
    
    //paso4 definicion del constructoc de la clase
    public MiVentana() //tiene  el  mismo  nombre  de la clase
    {
        //paso 5 crear e  inicializar los  objetos que utilizaremos
    mipanel = new JPanel();
    milabel = new JLabel();
    mitexto = new JTextField();//10 son  los  caracteres
    miboton = new JButton();
    // paso 6 agregar los elementos  al jframe
    this.add(mipanel);//agrego el panel al  frame
    mipanel.add(milabel);//agrego los  elementos al joanel
    mipanel.add(mitexto);
    mipanel.add(miboton);
    //paso7 propiedades de los  elementos
    milabel.setText("nombre");
    miboton.setText("enviar");
    
    }
}
    /*public static void main(String[] args) 
{
        // TODO code application logic here
   JFrame miventana = new JFrame(); // creamos un  objeto jframe
   miventana.setVisible(true);// esta  sentencia muestra la  ventana
   miventana.setBounds(0, 0, 400, 400);//le  asignamos tamaño a la  ventana
   miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//esta  sentencia cierra la ventana 
}      
    */
    

