package Encapstulation;

public class EncapsulationBuah {
    // Data members of class EncapsulationBuah
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;

    // declaration of constructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah) {
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }

    // declaring setter for all fields
    public void setName(String namaBuah) {
        this.namaBuah = namaBuah;
    }

    public void setPrice(String hargaBuah) {
        this.hargaBuah = hargaBuah;
    }

    public void setColor(String warnaBuah) {
        this.warnaBuah = warnaBuah;
    }

    // Declaring Getter for all fields
    public String getName() {
        return namaBuah;
    }

    public String getPrice() {
        return hargaBuah;
    }

    public String getColor() {
        return warnaBuah;
    }
}
