/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej;

/**
 *
 * @author Estudiante
 */

public class Ejemplojava {
    static boolean esVocal(char letra){
        
        if(letra == 'A' | | letra == 'E' || letra == 'I' || letra == 'O'  || letra == 'U'|| ){
            
            return true;
        }
        
            return false ;
            
    }
    public static void main(String[] s) {
        
        char [][]letras ={{'A','B','C'},
                          {'E','F','H'},
                          {'Z','N','O'},
                          {'R','P','W'}
                         };
        
        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++){
                if(esVocal (letras[i][j])){
                    System.out.println("["+letras[i][j]+"]");
                }
            }
        }
        for(int i=0; i <letras.length; i++){
            for(int j = 0; j< letras.length;i++){
                if( esVocal(letras[i][j])){
                    System.out.println("["+letras[i][j]+"]");
                }
                
            }
        }
    }
    
}
