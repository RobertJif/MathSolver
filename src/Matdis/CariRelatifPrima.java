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
public class CariRelatifPrima {
    private int nilai1,nilai2;

    private int x;
    public CariRelatifPrima(){
    }
    public CariRelatifPrima(int nilai1 ,int nilai2){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }
    public int PBBeuclideanNegatif(int nilai1, int nilai2){
    
       if (nilai2==0) return nilai1;
     
     else {
           int x = nilai1/nilai2;
        int y = x - 1;
        int z = y * nilai2;
        int i = nilai1 - z ;
        return PBBeuclidean(nilai2,i);
       }
     
    }
   
     public int PBBeuclidean(int nilai1, int nilai2){
     if (nilai2==0) return nilai1;
     else return PBBeuclidean(nilai2,nilai1%nilai2);
     
    }
     public String cetakHasil(){
     if(PBBeuclideanNegatif(nilai1,nilai2)==1){
         return nilai1+" dan "+nilai2+" Relatif Prima!";
        }
        else{
            return nilai1+" dan "+nilai2+" Tidak Relatif Prima!";
        }    
     }
}
