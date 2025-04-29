package Jobsheet9;

import java.util.Scanner;

public class SuratDemo15 {
    public static void main(String[] args) {
        StackSurat15 stack = new StackSurat15(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin ");
            System.out.println("2. Proses Surat Izin ");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat ");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.err.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin: ");
                    String jenis = scan.nextLine();
                    char jenis1 = jenis.charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    Surat15 srt = new Surat15(id, nama, kelas, jenis1, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", srt.namaMahasiswa);
                    break;
            
                case 2:
                    Surat15 diproses = stack.pop();
                    if(diproses != null){
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                        System.out.print("Konfirmasikan(YA/TIDAK): ");
                        String konf = scan.nextLine().toUpperCase();
                        if(konf.equalsIgnoreCase("YA")){
                            System.out.printf("Surat %s diproses \n", diproses.namaMahasiswa, konf);
                        }else{
                            System.out.println("Tidak diproses");
                        }
                    }
                    break;
                
                case 3:
                    Surat15 lihat = stack.peek();
                    if (lihat != null){
                        System.out.println("Surat terakhir kali dikirim oleh " + lihat.namaMahasiswa);
                    }
                    break;
                
                case 4:
                    System.out.println("Cari surat nama mahasiswa: ");
                    String cari = scan.nextLine().toUpperCase();
                    boolean found = false;
                    System.out.println("IdSurat\tNama\tKelas\tJenisIzin\tDurasi");
                    for (int i = 0; i <= stack.top; i++) {
                        if (stack.stack[i].namaMahasiswa.toUpperCase().equalsIgnoreCase(cari)) {
                            System.out.println(stack.stack[i].idSurat + "\t" + 
                                            stack.stack[i].namaMahasiswa + "\t" +
                                            stack.stack[i].kelas + "\t" +
                                            stack.stack[i].jenisIzin + "\t" +
                                            stack.stack[i].durasi);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Data tidak ditemukan.");
                    }

                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        }while (pilih >= 1 && pilih <= 5);
    }
}
