/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_2311103159_habib.rafi.i;

/**
 *
 * @author asus
 */
public class KomputerPremium extends Komputer{
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status          : " + (ruangPrivat ? "Ruangan Premium" : "Ruangan Standar"));

        if (ruangPrivat) {
            System.out.println("\nFasilitas Ruang Premium:");
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps");
        } else {
            System.out.println("\nFasilitas Ruang Standar:");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
    }

    public void pesanRuang(boolean ruangPrivat) {
        this.ruangPrivat = ruangPrivat;
        System.out.println("\nRuang berhasil dipesan dengan status: " + (ruangPrivat ? "Premium" : "Standar"));
    }
}
