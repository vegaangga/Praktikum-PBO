
package Tugas.Overriding;

public class Main {
    public static void main(String[] args){
        Manusia ma = new Manusia();
        Dosen ds = new Dosen();
        Mahasiswa mh = new Mahasiswa();
        
        ma.makan();
        ds.makan();
        mh.makan();
        
    }
}
