
package com.desarrollo.vista;

import java.awt.event.KeyEvent;

public class Validations {
    public void validateNum(KeyEvent evt){
        char character=evt.getKeyChar();
        if(Character.isLetter(character)){
            evt.consume();
        }
    }
    public void validateLetters(KeyEvent evt){
        char character=evt.getKeyChar();
        if(character>=33 && character<=64 || character>=91 && character<=96||character>=123 && character<=126){ 
            evt.consume();
        }
    }
}
