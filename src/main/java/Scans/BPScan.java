package Scans;

import java.time.LocalDate;

public class BPScan extends Scan{

    private int systolic;
    private int diastolic;
    private String duration;
    public BPScan(int year, int month, int day, int systolic, int diastolic, String duration) {
        super(year, month, day);
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.duration = duration;
    }

    public String getScanDate(){
        LocalDate date = LocalDate.of(year, month, day);
        return date.toString();
    }

    public String getDuration(){
        return this.duration;
    }

    public int getSystolic(){
        return this.systolic;
    }

    public int getDiastolic(){
        return this.diastolic;
    }
}
