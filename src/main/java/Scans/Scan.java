package Scans;

import java.time.LocalDate;

public abstract class Scan implements ScanDate{


    protected int year;
    protected int month;
    protected int day;
    protected LocalDate ld;

    public Scan(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

}
