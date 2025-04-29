package Jobsheet9;

public class Mahasiswa15{
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa15(String nama, String nim, String kelas){
        this.nama= nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}