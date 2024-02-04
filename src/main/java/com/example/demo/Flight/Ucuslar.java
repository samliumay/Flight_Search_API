package com.example.demo.Flight;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Ucuslar {
    @Id
    @SequenceGenerator(
            name = "havaalani_sequence",
            sequenceName = "havaalani_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "havaalani_sequence"
    )

    private int UcuslarID;
    @Column(name = "kalkis_havalani", nullable = false)

    private int kalkisHavalani ;
    @Column(name = "varis_havalani", nullable = false)
    private int varisHavalani;
    @Column(name = "kalkis_tarih_saat")
    private LocalDate kalkisTarihSaat;
    @Column(name = "donus_tarih_saat")

    private LocalDate donusTarihSaat;
    private float fiyat;

    public Ucuslar(int UcuslarID, int kalkisHavalani, int varisHavalani, LocalDate kalkisTarihSaat, LocalDate donusTarihSaat, float fiyat) {
        this.UcuslarID = UcuslarID;
        this.kalkisHavalani = kalkisHavalani;
        this.varisHavalani = varisHavalani;
        this.kalkisTarihSaat = kalkisTarihSaat;
        this.donusTarihSaat = donusTarihSaat;
        this.fiyat = fiyat;
    }

    public Ucuslar(int kalkisHavalani, int varisHavalani, LocalDate kalkisTarihSaat, LocalDate donusTarihSaat, float fiyat) {
        this.kalkisHavalani = kalkisHavalani;
        this.varisHavalani = varisHavalani;
        this.kalkisTarihSaat = kalkisTarihSaat;
        this.donusTarihSaat = donusTarihSaat;
        this.fiyat = fiyat;
    }

    public Ucuslar() {
    }

    public int getUcuslarID() {
        return UcuslarID;
    }

    public int getKalkisHavalani() {
        return kalkisHavalani;
    }

    public int getVarisHavalani() {
        return varisHavalani;
    }

    public LocalDate getKalkisTarihSaat() {
        return kalkisTarihSaat;
    }

    public LocalDate getDonusTarihSaat() {
        return donusTarihSaat;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setUcuslarID(int ID) {
        this.UcuslarID = ID;
    }

    public void setKalkisHavalani(int kalkisHavalani) {
        this.kalkisHavalani = kalkisHavalani;
    }

    public void setVarisHavalani(int varisHavalani) {
        this.varisHavalani = varisHavalani;
    }

    public void setKalkisTarihSaat(LocalDate kalkisTarihSaat) {
        this.kalkisTarihSaat = kalkisTarihSaat;
    }

    public void setDonusTarihSaat(LocalDate donusTarihSaat) {
        this.donusTarihSaat = donusTarihSaat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Ucuslar{" +
                "ID=" + UcuslarID +
                ", kalkisHavalani=" + kalkisHavalani +
                ", varisHavalani=" + varisHavalani +
                ", kalkisTarihSaat=" + kalkisTarihSaat +
                ", donusTarihSaat=" + donusTarihSaat +
                ", fiyat=" + fiyat +
                '}';
    }
}
