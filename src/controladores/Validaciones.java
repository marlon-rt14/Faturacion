
package controladores;


public class Validaciones {
    
    public static void validarCedula(java.awt.event.KeyEvent evt){
        if(!(Character.isDigit(evt.getKeyChar()))){
            evt.consume();
        }
    }
}
