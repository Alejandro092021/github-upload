
package Arquitectura.com.Financiera.presentacion;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ValidacionPresentacion {
    public JFrame jframe;
    
    public ValidacionPresentacion(){
        
    }
    
    
    public void permitirSoloNumeros(KeyEvent evt){
                char c = evt.getKeyChar();
                if(!Character.isDigit(c)){
                    evt.consume();
                }
    }
    
        public void permitirSoloOchoNumeros(KeyEvent evt, JTextField campo){
                char c = evt.getKeyChar();
                int tamaño = (int)campo.getText().length();
                if(!Character.isDigit(c) || tamaño >= 8){
                    evt.consume();
                }
    }
        
        public void permitirNumerosDecimales(KeyEvent evt, JTextField campo){
                char c = evt.getKeyChar();
                if(!Character.isDigit(c) && c != '.')
                    evt.consume();
                if(c == '.' && campo.getText().contains("."))
                    evt.consume();
    }
}
