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
public class CariStatusKongruen {
    private int nilai1,nilai2,nilai3;

    private int x;
    private int coba;
    
    public CariStatusKongruen(){}
    public CariStatusKongruen(int nilai1 ,int nilai2,int nilai3){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }
    
    public int cariNilai(){
        x = (nilai1-nilai2)%nilai3;
        return x;
    }
    public String cetakHasil(){
        int cetak = cariNilai();
        if(cetak==0){
            return "Kongruen";
        }
        else{
            return "Tidak Kongruen";
        }
    }
}
