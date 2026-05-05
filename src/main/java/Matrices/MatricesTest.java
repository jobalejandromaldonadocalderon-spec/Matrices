
package Matrices;


public class MatricesTest {
    public static void main(String[] args) {
        Matrices obj=new Matrices();
        
        System.out.println("INGRESE LA MATRIZ A");
        obj.llenarMatris(obj.getMatrisA());
        
        System.out.println("INGRESE LA MATRIS");
        obj.llenarMatris(obj.getMatrisB());
        
        System.out.println("LA MATRIZ A ES ");
        obj.imprimir(obj.getMatrisA());
        
        System.out.println("LA MATRIZ B ES ");
        obj.imprimir(obj.getMatrisB());
        
        System.out.println("LA SUMA DE LAS MATRISES A Y B ES");
        obj.sumar();
        obj.imprimir(obj.getSuma());
        
        System.out.println("LA RESTA DE LAS MATRISES A Y B ES");
        obj.resta();
        obj.imprimir(obj.getResta());
    }
}
