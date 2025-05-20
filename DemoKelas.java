public class DemoKelas {
    public static void main(String[] args) {
        Siswa ican = new Siswa("Ican");

        Kelas k = new Kelas(ican);

        Siswa michael = new Siswa("Michael");
        k.tambahDiBelakang(michael);
        k.tambahDiBelakang(new Siswa("Karung"));
        k.tambahDiBelakang(new Siswa("Dewa"));
        k.tambahDiBelakang(new Siswa("Garry"));

        System.out.println("Data awal:");
        k.tampilkanSemua();

        System.out.println("\nJumlah siswa : " + k.jumlahSiswa());
        System.out.println("Siswa di index 2 : " + k.ambilDi(2).nama);
        System.out.println("Urutan Michael : " + k.urutan("Michael"));

        System.out.println("\nMenambah 'Nina' di depan...");
        k.tambahDiDepan(new Siswa("Nina"));
        k.tampilkanSemua();

        System.out.println("\nMenambah 'Oding' setelah 'Dewa'...");
        k.tambahSetelah("Dewa", new Siswa("Oding"));
        k.tampilkanSemua();

        System.out.println("\nMenghapus 'Karung'...");
        k.hapus("Karung");
        k.tampilkanSemua();

        System.out.println("\nJumlah siswa sekarang : " + k.jumlahSiswa());
    }
}
