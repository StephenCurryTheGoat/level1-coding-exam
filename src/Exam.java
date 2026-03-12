import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();

void setUp() {
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	button.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button.setBackground(Color.yellow);
	button2.setBackground(Color.red);
	button3.setBackground(Color.blue);
	button4.setBackground(Color.green);
	button.setOpaque(true);
	button2.setOpaque(true);
	button3.setOpaque(true);
	button4.setOpaque(true);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say -v " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
  JButton b = (JButton) arg0.getSource();
 if(b == button) {
	 System.out.println("yellow");
	 speak("yellow");
 }
 else if(b == button2) {
	 System.out.println("red");
	 speak("red");
 }
 else if(b == button3){
	 System.out.println("blue");
	 speak("blue");
 }
 else if(b == button4) {
	 System.out.println("green");
	 speak("green");
 }
}
}
