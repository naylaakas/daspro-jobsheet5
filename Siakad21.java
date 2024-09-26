import java.util.Scanner;
public class Siakad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        String nilaiAkhirHuruf, nilaiKualifikasi;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Nama: " + nama + " NIM:" + nim);
        System.out.println("Kelas: " + kelas + " Absen:" + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if(nilaiAkhir <= 100 && nilaiAkhir > 80){
            nilaiAkhirHuruf = "A";
            nilaiKualifikasi = "Sangat Baik";
        }
        else if(nilaiAkhir <= 80 && nilaiAkhir > 73){
            nilaiAkhirHuruf = "B+";
            nilaiKualifikasi = "Lebih dari Baik";
        }
        else if(nilaiAkhir <= 73 && nilaiAkhir > 65){
            nilaiAkhirHuruf = "B";
            nilaiKualifikasi = "Baik";
        }
        else if(nilaiAkhir <= 65 && nilaiAkhir > 60){
            nilaiAkhirHuruf = "C+";
            nilaiKualifikasi = "Lebih dari Cukup";
        }
        else if(nilaiAkhir <= 60 && nilaiAkhir > 50){
            nilaiAkhirHuruf = "C";
            nilaiKualifikasi = "Cukup";
        }
        else if(nilaiAkhir <= 50 && nilaiAkhir > 39){
            nilaiAkhirHuruf = "D";
            nilaiKualifikasi = "Kurang";
        } 
        else{
            nilaiAkhirHuruf = "E";
            nilaiKualifikasi = "Gagal";
        }

        System.out.println("Nilai huruf: " + nilaiAkhirHuruf);
        System.out.println("Nilai kualifikasi: " + nilaiKualifikasi);
    }
}