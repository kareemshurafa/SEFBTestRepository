import Scans.BPScan;
import Scans.MRIScan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.net.MalformedURLException;
import java.net.URL;
public class Main {

    public static void main(String [] args){

        // Initialise patients with name and age
        Patient patient1 = new Patient("Daphne Von Oram", 62, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        Patient patient2 = new Patient("Sebastian Compton", 31, "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");

        // Add the scans
        patient1.addScan(new MRIScan(2023, 9, 14, "https://martinh.netfirms.com/BIOE60010/mri1.jpg",2));
        patient1.addScan(new BPScan(2023, 9, 15, 130, 70, "ST"));
        patient2.addScan(new MRIScan(2023, 11, 19, "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4));
        patient2.addScan(new BPScan(2023, 11, 20, 150, 80, "VST"));

        // Window for Doctor Output
        JFrame frame = new JFrame("Doctor View");
        frame.setSize(800,800);

        JPanel displayPanel = new JPanel();


        JLabel label1 = new JLabel();
        URL imageURL1= null;
        try {
            imageURL1 = new URL(patient1.getPictureURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon1 = new ImageIcon(imageURL1);
        label1.setIcon(thisImageIcon1);

        JLabel label2 = new JLabel();
        URL imageURL2= null;
        try {
            imageURL2 = new URL(patient2.getPictureURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon2 = new ImageIcon(imageURL2);
        label2.setIcon(thisImageIcon2);

        displayPanel.setLayout(new GridLayout(3, 4));

        displayPanel.add(label1);
        displayPanel.add(label2);


        JLabel textLabel1 = new JLabel("Name: "+ patient1.getPatientName() + "\n Age: "+ patient1.getPateintAge());
        JLabel textLabel2 = new JLabel("Name: "+ patient2.getPatientName() + "\n Age: "+ patient2.getPateintAge());

        displayPanel.add(textLabel1);
        displayPanel.add(textLabel2);

        JLabel label3 = new JLabel();
        URL imageURL3= null;
        try {
            imageURL3 = new URL(patient1.getMRIURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon3 = new ImageIcon(imageURL3);
        label3.setIcon(thisImageIcon3);

        JLabel label4 = new JLabel();
        URL imageURL4= null;
        try {
            imageURL4 = new URL(patient2.getMRIURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon4 = new ImageIcon(imageURL4);
        label4.setIcon(thisImageIcon4);

        displayPanel.add(label3);
        displayPanel.add(label4);



        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });



        // Admin view
        patient1.getAdminView();
        patient2.getAdminView();









    }
}
