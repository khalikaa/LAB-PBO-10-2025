package praktikum_6;

public interface IBergerak {
    boolean mulai();
    boolean berhenti();
    double getKecepatan();
    void setKecepatan(double kecepatan);  //tidak mengembalikan apa apa tapi dia menyimpan nilai
}