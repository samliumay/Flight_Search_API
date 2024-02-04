package com.example.demo.Flight;

import jakarta.persistence.*;


@Entity
@Table
public class Havaalani {
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
    private Integer HavaalaniID;
    private String sehir;

    public Havaalani(int HavaalaniID, String sehir) {
        this.HavaalaniID = HavaalaniID;
        this.sehir = sehir;
    }

    public Havaalani(String sehir) {
        this.sehir = sehir;
    }

    public Havaalani() {

    }

    public int getHavaalaniID() {
        return HavaalaniID;
    }

    public String getSehir() {
        return sehir;
    }

    public void setHavaalaniID(int ID) {
        this.HavaalaniID = ID;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    @Override
    public String toString() {
        return "havaalani{" +
                "ID=" + HavaalaniID +
                ", sehir='" + sehir + '\'' +
                '}';
    }
}
