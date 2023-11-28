import Scans.Scan;
import Scans.MRIScan;
import Scans.BPScan;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Patient {

    private final String name;
    private final int age;

    private final String pictureURL;

    // Make ArrayList containing all the scans of that Patient
    private ArrayList<Scan> scans = new ArrayList<Scan>();

    public Patient(String name, int age, String pictureURL){
        this.name = name;
        this.age = age;
        this.pictureURL = pictureURL;
    }

    public void addScan(Scan scan){
        scans.add(scan);
    }

    public void getAdminView() {
        for (Scan sc : scans) {
            if (sc instanceof MRIScan){
                System.out.println("Patient: " + this.name + ": MRI: " + sc.getFieldStrength() + " Tesla, "
                        + sc.getScanDate());
            }
            else if (sc instanceof BPScan){
                System.out.println("Patient: " + this.name + ": BP: " + sc.getDuration() + ", " + sc.getScanDate());
            }
        }

    }

    public String getPictureURL(){
        return this.pictureURL;
    }
}
