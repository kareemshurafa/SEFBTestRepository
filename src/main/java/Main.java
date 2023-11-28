import Scans.BPScan;
import Scans.MRIScan;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.net.URL;
public class Main {

    public static void main(String [] args){

        // Initialise patients with name and age
        Patient patient1 = new Patient("Daphne Von Oram", 62);
        Patient patient2 = new Patient("Sebastian Compton", 31);

        // Add the scans
        patient1.addScan(new MRIScan(2023, 9, 14, "https://martinh.netfirms.com/BIOE60010/mri1.jpg",2));
        patient1.addScan(new BPScan(2023, 9, 15, 130, 70, "ST"));
        patient2.addScan(new MRIScan(2023, 11, 19, "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4));
        patient2.addScan(new BPScan(2023, 11, 20, 150, 80, "VST"));

        // Window for Doctor Output
        JFrame frame = new JFrame("Doctor View");
        frame.setSize(500,500);

        JPanel displayPanel = new JPanel();




        // Admin view





    }
}
