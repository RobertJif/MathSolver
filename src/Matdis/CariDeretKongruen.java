/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matdis;

/**
 *
 * @author USER
 */
public class CariDeretKongruen {
      private int nilai1,nilai2;
      private String hasil = "";
      private int x;
      private int n = 1;
    public CariDeretKongruen(){
    }
    public CariDeretKongruen(int nilai1 ,int nilai2){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }
    public String cetakLabel(){
        return nilai1+"( Mod "+nilai2+" )";
    }
    public int[] cariDeret(int ulang){
      int [] a = new int[ulang];
      for(int i=0 ;i <a.length;i++){
          a[i] = nilai1 + ( n * nilai2 );
          n = n+1;
      }
      return a;
    }
    
    public String cetakHasil(int ulang){
        int [] b = new int[ulang];
        b = cariDeret(ulang);
        for(int j = 0;j<ulang;j++){
            hasil = hasil + " " + b[j];
        }
        return hasil;
    }
}
