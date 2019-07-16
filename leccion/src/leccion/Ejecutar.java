
package leccion;

public class Ejecutar {
    public static void main(String[] args) {
         Animales objetoanimal = new Animales("perro",20,50,"blanco",6);
         Aves objetoanimal2 = new Aves("Carroña", "aerea", "buitre", 8, 50, "negro",5);
         Mamiferos objetoanimal3=new Mamiferos("Bipedo", true, "Canguro", 30, 1.80, "cafe", 20);
         objetoanimal.alimentarse();
         objetoanimal2.alimentarse();
         objetoanimal3.alimentarse();
         System.out.println(objetoanimal.informacionAnimal());
         System.out.println(objetoanimal2.informacionAnimal());
         System.out.println(objetoanimal3.informacionAnimal());
    }
    
}
