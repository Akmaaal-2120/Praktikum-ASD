package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        StackTugasMahasiswa15 stack = new StackTugasMahasiswa15(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Nilai: ");
            System.out.println("2. Menilai Tugas: ");
            System.out.println("3. Melihat Tugas teratas: ");
            System.out.println("4. Melihat Daftar tugas: ");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.err.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa15 mhs = new Mahasiswa15(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
            
                case 2:
                    Mahasiswa15 dinilai = stack.pop();
                    if(dinilai != null){
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                
                case 3:
                    Mahasiswa15 lihat = stack.peek();
                    if (lihat != null){
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        }while (pilih >= 1 && pilih <= 4);
    }
}
