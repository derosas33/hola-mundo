/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6e4;

/**
 *
 * @author Tomy
 */
public class G6e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo r1= new Rectangulo();
        r1.crearRactangulo();
        System.out.println("El area es: "+r1.Area());
        System.out.println("El perimetro es: "+r1.Perimetro());
        r1.Dibujo();
    }
    
}
