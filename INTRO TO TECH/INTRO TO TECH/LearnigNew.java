import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnigNew implements ActionListener {
    JFrame accio;
    JButton button;
    JButton button2;
    LearnigNew(){
     accio=new JFrame("ACCIO SESSION");
     accio.setLayout(null);
     accio.setVisible(true);
     accio.setSize(500,500);
     accio.setResizable(false);
     button=new JButton("click");
     accio.add(button);
     button.setLocation(200,200);
     button.setSize(100,50);
     button.addActionListener(this);

     button2=new JButton("click2");
     button2.setSize(100,50);
     button2.setLocation(100,200);
     button2.addActionListener(this);
     accio.add(button2);
    }
    public static void main(String[] args ){
     LearnigNew obj=new LearnigNew();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equals("click")){
        accio.getContentPane().setBackground(Color.blue);
        }
        if(s.equals("click2")){
            accio.getContentPane().setBackground(Color.black);
        }
    }
}
