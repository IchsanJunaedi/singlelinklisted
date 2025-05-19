public class DemoKelas {
    public static void main(String[] args) {
        Siswa ican = new Siswa("Ican");

        Kelas k = new Kelas(ican);

        Siswa michael = new Siswa("Michael");
        k.tambahDiBelakang(michael);
        k.tambahDiBelakang(new Siswa("Karung"));
        k.tambahDiBelakang(new Siswa("Dewa"));
        k.tambahDiBelakang(new Siswa("Garry"));

        k.tampilkanSemua();

        System.out.println("\nJumlah siswa : " + k.jumlahSiswa());
        System.out.println("Siswa di index 2 : " + k.ambilDi(2).nama);
        System.out.println("Urutan Michael : " + k.urutan("Michael"));

        System.out.println("\nMenghapus 'Karung'...");
        k.hapus("Karung");

        System.out.println("\nSetelah penghapusan:");
        k.tampilkanSemua();

        System.out.println("\nJumlah siswa sekarang : " + k.jumlahSiswa());
    }
}
