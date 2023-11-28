package Scans;

import java.net.URL;
import java.time.LocalDate;

public class MRIScan extends Scan {

    private String imageURL;
    private int fieldstrength;

    public MRIScan(int year, int month, int day, String imageURL, int fieldstrength) {
        super(year, month, day);
        this.imageURL = imageURL;
        this.fieldstrength = fieldstrength;

    }

    public String getScanDate() {
        LocalDate date = LocalDate.of(year, month, day);
        return date.toString();
    }

    public int getFieldStrength(){
        return this.fieldstrength;
    }

}