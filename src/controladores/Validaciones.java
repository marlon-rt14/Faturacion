
package controladores;


public class Validaciones {
    
    public static void validarCedula(java.awt.event.KeyEvent evt){
        if(!(Character.isDigit(evt.getKeyChar()))){
            //SI PRECIONA UNA TECLA QUE NO SEA UN NUMERO
            //EL EVENTO SE CONSUMIRA Y NO ESCRIBIRA
            evt.consume();
        }
    }
}
