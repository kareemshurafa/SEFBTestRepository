package Scans;

import java.time.LocalDate;

public abstract class Scan {

    // Create parent class containing date of scan/measurement
    // Implement more specific fields in sub-classes


    protected int year;
    protected int month;
    protected int day;
    protected LocalDate ld;

    public Scan(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public abstract String getScanDate();


    public int getFieldStrength(){
        return 0;
    }

    public String getDuration() {
        return "";
    }
}
