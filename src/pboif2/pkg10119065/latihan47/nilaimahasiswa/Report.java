package pboif2.pkg10119065.latihan47.nilaimahasiswa;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program nilai mahasiswa
 *                         dengan objek
 */
public class Report {
    private double nilaiQuiz, nilaiUTS, nilaiUAS, nilaiAkhir;
    
    public double getQuiz() {
        return nilaiQuiz;
    }
    public void setQuiz(double quiz) {
        this.nilaiQuiz = quiz;
    }
    public double getUTS() {
        return nilaiUTS;
    }
    public void setUTS(double uts) {
        this.nilaiUTS = uts;
    }
    public double getUAS() {
        return nilaiUAS;
    }
    public void setUAS(double uas) {
        this.nilaiUAS = uas;
    }
    
    public double getNilaiAkhir() {
        return nilaiAkhir = (nilaiQuiz*0.2)+(nilaiUTS*0.3)+(nilaiUAS*0.5);
    }
    
    private char getIndex(double nilaiAkhir)
    {
        char index;
        
        if(nilaiAkhir > 80 && nilaiAkhir <= 100) index = 'A';
        else if(nilaiAkhir > 68 && nilaiAkhir <= 80) index = 'B';
        else if(nilaiAkhir > 56 && nilaiAkhir <= 68) index = 'E';
        else if(nilaiAkhir > 45 && nilaiAkhir <= 56) index = 'D';
        else index = 'E';
        return index;
    }
    
    private String getKeterangan(char index) {
      String ket;
      switch(index){
          case 'A':ket = "SANGAT BAGUS";break;
          case 'B':ket = "BAIK";break;
          case 'C':ket = "CUKUP";break;
          case 'D':ket = "KURANG";break;
          default:ket ="SANGAT KURANG";break;        
      }
       return ket;
    }
    public void show()
    {
        double nilaiAkhir = getNilaiAkhir();
        System.out.println("QUIZ        = "+nilaiQuiz);
        System.out.println("UTS         = "+nilaiUTS);
        System.out.println("UAS         = "+nilaiUAS);
        System.out.println("\nNILAI AKHIR = "+nilaiAkhir);
        System.out.println("\nINDEX       = "+getIndex(nilaiAkhir));
        System.out.println("KETERANGAN  = "+getKeterangan(getIndex(nilaiAkhir))+"\n");
    }
}
