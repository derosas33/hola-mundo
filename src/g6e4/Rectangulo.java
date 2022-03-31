
package g6e4;

import java.util.Scanner;

public class Rectangulo {
    
    Scanner leer = new Scanner(System.in);
    
    private int altura;
    private int base;
    private String atrib1;
    
    public Rectangulo(){
    }
    public Rectangulo(int altura, int base){
        this.altura=altura;
        this.base=base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public void crearRactangulo(){
        System.out.println("Ingrese altura");
        altura=leer.nextInt();
        System.out.println("Ingrese base");
        base=leer.nextInt();
    }
    public int Area(){
        int Area;
        Area=base*altura;
        return Area;
    }
    public int Perimetro(){
        int Perimetro;
        Perimetro=(base+altura)*2;
        return Perimetro;
    }
    public void Dibujo(){
        System.out.println("El rectangulo es: ");
        for (int i=1;i<=altura;i++){
            for (int j=1;j<=base;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
