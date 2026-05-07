
package Matrices;

import java.util.Scanner;

public class Matrices {
   private  Scanner op=new Scanner(System.in);
private long[][] matrisA=new long[3][3];
private long[][] matrisB=new long[3][3];
private long[][] suma=new long[3][3];
private long[][] resta=new long[3][3];
private long[][] multi=new long[3][3];

    public void llenarMatris(long[][] matris){
        
        for(int i=0; i< 3;i++){
            for(int j=0; j<3; j++){
                boolean valido=false;
                while(!valido){
                    
                try{
                matris[i][j]=Long.parseLong(op.next());
                valido=true;
                }catch(Exception e){
                    System.out.println("ERROR, INGRESE UN NUMERO ENTERO");
                }
               
                }
            }
        }
    }
    
    
    public void imprimir(long[][] matris){
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris.length; j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    public void sumar(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               suma[i][j]=matrisA[i][j] + matrisB[i][j];
                       
                       
            }
        }
    }
    
     public void resta(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               resta[i][j]=matrisA[i][j] - matrisB[i][j];
                       
                       
            }
        }
    }
     
     public void multiplicar(){
         for(int i=0; i< 3; i++){
             for(int j=0; j < 3; j++){
                 int suma=0;
                 for(int z=0; z<3; z++){
                     suma+=matrisA[i][z] * matrisB[z][j];
                 }
                 multi[i][j]=suma;
             }
         }
     }

    public Scanner getOp() {
        return op;
    }

    public void setOp(Scanner op) {
        this.op = op;
    }

    public long[][] getMatrisA() {
        return matrisA;
    }

    public void setMatrisA(long[][] matrisA) {
        this.matrisA = matrisA;
    }

    public long[][] getMatrisB() {
        return matrisB;
    }

    public void setMatrisB(long[][] matrisB) {
        this.matrisB = matrisB;
    }

    public long[][] getSuma() {
        return suma;
    }

    public void setSuma(long[][] suma) {
        this.suma = suma;
    }

    public long[][] getResta() {
        return resta;
    }

    public void setResta(long[][] resta) {
        this.resta = resta;
    }

    public long[][] getMulti() {
        return multi;
    }

    public void setMulti(long[][] multi) {
        this.multi = multi;
    }

    
     
     
}
