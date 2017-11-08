/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;
//PASO1 IMPORTAR  las librerias
//import Gui.*;
import javax.swing.*;//importamos todo el swing
import java.awt.*;//libreria grafica del sistema OPERATIVO
/**
 *
 * @author LP 13
 */
//paso2 heredar mi  clase desde jframe
public class Windows extends JFrame{

  //paso 3 declara  los  elementos   a  utulizar
    JPanel panel;//creacion  de objeto  panel
    JLabel label;
    JTextField text;
    JButton boton;
    
    //paso4 definicion del constructor de la clase
    public Windows() //tiene  el  mismo  nombre  de la clase
    {
        //paso 5 crear e  inicializar los  objetos 
    panel = new JPanel();//creo un objeto tipo panel
    label = new JLabel();
    text = new JTextField(15);//15 caracteres
    boton = new JButton();
    // paso 6 agregar los elementos  al jframe
    this.add(panel);//recomensdable agregar el panel al  frame
    panel.add(label);//agregar un objeto label al panel
    panel.add(text);
    panel.add(boton);
    //paso7 propiedades de los  elementos
    label.setText("nombre");
    boton.setText("enviar");
    panel.setBackground(Color.blue);//color  de fondo del panel
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
    

