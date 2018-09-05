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
public class CariInvers {
    private int nilai1,nilai2,nilai3;
    private int temp1,temp2;
    private int x;
    private int nilaiX;
    String akhirnya="";
    String akhirnya2="";
    public CariInvers(int nilai1,int nilai2){
        temp1=nilai1;
        temp2=nilai2;
        nilai3=0;
    }
    public int cariNilaiInvers(int nilai1,int nilai2,int nilai3){
      
        int x = 1 - (nilai2*nilai3);
      int x1 = x / nilai1;
      if(x%nilai1==0){
          nilaiX= x1;
          return x1;
      }
      else{
          return cariNilaiInvers(nilai1,nilai2,nilai3+1);
      }
         
  }
    public String cetakHasil(){
        return nilaiX+"( Mod "+temp2+" ) :";
        
    }
    public int []isiDeret(int ulang){
        int cetakan[]=new int[ulang];
        
        int tambah=1;
        for(int c=0;c<ulang;c++){
            temp1= nilaiX + ( tambah * temp2 );
            tambah = tambah+1;
            cetakan[c]=temp1;
        }
        
        return cetakan;
    }
    public int []isiDeret2(int ulang){
        int cetakan[]=new int[ulang];
        
        int tambah=1;
        for(int c=0;c<ulang;c++){
            temp1= nilaiX - ( tambah * temp2 );
            tambah = tambah+1;
            cetakan[c]=temp1;
        }
        
        return cetakan;
    }
    public String cetak(int ulang){
        int [] a = new int[ulang];
        a = isiDeret(ulang);
        
        for(int i = 0;i < a.length;i++){
            akhirnya = akhirnya+" "+a[i]+" ";
        }
        return akhirnya;
    }
    public String cetak2(int ulang){
        int [] a = new int[ulang];
        a = isiDeret2(ulang);
        
        for(int i = 0;i < a.length;i++){
            akhirnya2 = akhirnya2+" "+a[i]+" ";
        }
        return akhirnya2;
    }
            
    
    
}
