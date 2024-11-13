/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_2311103159_habib.rafi.i;

/**
 *
 * @author asus
 */
public class KomputerVIP extends Komputer {
    protected boolean vipCard;
    private String username;
    private int durasiBermain;
    private int tambahanBillingJam;
    private int tambahanBillingMenit;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status: " + (vipCard ? "Member VIP" : "Non VIP"));

        if (vipCard) {
            System.out.println("\nBenefit Member VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        } else {
            System.out.println("\nBenefit Member VIP: KOCAK LU, BUKAN VIP NGAREP BENEFIT");
        }

        if (username != null) {
            System.out.println("\nLogin dengan username: " + username);
            System.out.println("Bermain selama: " + durasiBermain + " jam");
            System.out.println("Nambah billing selama: " + tambahanBillingJam + " jam " + tambahanBillingMenit + " menit");
        }
    }

    public void login(String username, boolean vipCard) {
        this.username = username;
        this.vipCard = vipCard;
        System.out.println("\nLogin berhasil untuk username: " + username);
    }

    public void bermain(int jam) {
        this.durasiBermain = jam;
        System.out.println("Bermain selama " + jam + " jam");
    }

    public void bermain(int jam, int menitTambahan) {
        this.tambahanBillingJam = jam;
        this.tambahanBillingMenit = menitTambahan;
        System.out.println("Nambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
}
