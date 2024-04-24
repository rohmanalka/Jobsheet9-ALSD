package Tugas;
import java.util.Scanner;

public class QueueMain21 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Pasien baru");
        System.out.println("2. Pasien keluar");
        System.out.println("3. Daftar Semua Pasien");
        System.out.println("4. Cek Pasien terdepan");
        System.out.println("5. Cek Pasien belakang");
        System.out.println("6. Cek Pasien berdasarkan nama");
        System.out.println("---------------------------- ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue21 antri = new Queue21(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Alamat: ");
                    String alamat = sc.next();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    Pasien21 ps = new Pasien21(nama, alamat, umur);
                    antri.enqueue(ps);
                    break;
                case 2:
                    Pasien21 data = antri.dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0) {
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.alamat + " " + data.umur);
                    }
                    break;
                case 3:
                    antri.daftarPasien();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan Nama :");
                    String getNama = sc.next();
                    antri.peekPosition(getNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}