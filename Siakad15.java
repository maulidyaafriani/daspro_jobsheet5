import java.util.Scanner;
public class Siakad15 {
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);

       String nama, nim, nilaiHuruf = "", kualifikasi = "";
       char kelas;
       byte absen;
       double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

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
       nilaiUjian= sc.nextDouble();
       

       nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;

       if(nilaiAkhir>80){
         kualifikasi = "Sangat baik ";
         nilaiHuruf = "A ";
       }
       else if (nilaiAkhir>73) {
         kualifikasi = "Lebih dari baik ";
         nilaiHuruf = "B+";
       }
       else if (nilaiAkhir>65){
        kualifikasi =  "Baik";
        nilaiHuruf = "B";
       }
       else if (nilaiAkhir>60) {
        kualifikasi = "Lebih dari cukup ";
        nilaiHuruf = "C+";
       }
       else if (nilaiAkhir>50) {
        kualifikasi = "Cukup ";
        nilaiHuruf = "C";
       }
       else if (nilaiAkhir>39) {
        kualifikasi = "Kurang ";
        nilaiHuruf = "D";
       }
       else if (nilaiAkhir <= 39) {
        kualifikasi = "Gagal ";
        nilaiHuruf = "E";
        
       }
       System.out.println("Nama: " + nama + " NIM: " + nim);
       System.out.println("Kelas: " + kelas + "Absen: " + absen);
       System.out.println("Nilai Akhir: " + nilaiAkhir);
       System.out.println("Jadi kualifikasinya adalah " + kualifikasi);
       System.out.println("Jadi nilai hurufnya adalah " + nilaiHuruf);

       sc.close();


}
}
