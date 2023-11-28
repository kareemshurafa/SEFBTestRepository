import Scans.Scan;
import Scans.MRIScan;
import Scans.BPScan;

import java.net.URL;
import java.util.ArrayList;

public class Patient {

    private final String name;
    private final int age;

    private URL pictureURL;

    // Make ArrayList containing all the scans of that Patient
    private ArrayList<Scan> scans = new ArrayList<Scan>();

    public Patient(String name, int age){
        this.name = name;
        this.age = age;
        //this.pictureURL = pictureURL;
    }

    public void addScan(Scan scan){
        scans.add(scan);
    }

    public void getAdminView(){
        for (Scan sc:scans){
            System.out.println("Patient: "+ this.name + ": MRI: "+ scan.getFieldStrength());
        }

    }

}
