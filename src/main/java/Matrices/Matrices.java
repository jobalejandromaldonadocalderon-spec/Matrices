
package Matrices;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Matrices {
    FastReader fr=new FastReader();
private int[][] matrisA=new int[3][3];
private int[][] matrisB=new int[3][3];
private int[][] suma=new int[3][3];
private int[][] resta=new int[3][3];
private int[][] multi=new int[3][3];

    public void llenarMatris(int[][] matris){
        for(int i=0; i< 3;i++){
            for(int j=0; j<3; j++){
                matris[i][j]=fr.nextInt();
            }
        }
    }
    
    
    public void imprimir(int[][] matris){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
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

    public FastReader getFr() {
        return fr;
    }

    public void setFr(FastReader fr) {
        this.fr = fr;
    }

    public int[][] getMatrisA() {
        return matrisA;
    }

    public void setMatrisA(int[][] matrisA) {
        this.matrisA = matrisA;
    }

    public int[][] getMatrisB() {
        return matrisB;
    }

    public void setMatrisB(int[][] matrisB) {
        this.matrisB = matrisB;
    }

    public int[][] getSuma() {
        return suma;
    }

    public void setSuma(int[][] suma) {
        this.suma = suma;
    }

    public int[][] getResta() {
        return resta;
    }

    public void setResta(int[][] resta) {
        this.resta = resta;
    }

    public int[][] getMulti() {
        return multi;
    }

    public void setMulti(int[][] multi) {
        this.multi = multi;
    }
    

    
    
    
    
    
    
     static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            } catch (Exception e) {
                return null;
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }
    
      

}
}
