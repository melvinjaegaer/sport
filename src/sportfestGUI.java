import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sportfestGUI {
    private JTextField textN;
    private JTextField textNN;
    private JButton hinzuB;
    private JPanel gfhfgtzhjnthn;
    private JTextArea textArea1;
    Schüler schüler;

    List<Schüler> teilnehmerlist;
   

    public sportfestGUI() {
        hinzuB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teilnehmerlist = new List<Schüler>();
                schüler  = new Schüler ();
                if(teilnehmerlist.isEmpty()){

     if(!textN.getText().equals(null)&&!textNN.getText().equals(null))  {
         teilnehmerlist.append(schüler);
         textN.setText("");
         textNN.setText("");



     }
             
              


            }


                if(!textN.getText().equals(null)&&!textNN.getText().equals(null))  {
                    teilnehmerlist.append(schüler);
                    textN.setText("");
                    textNN.setText("");



                    }











            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("sportfestGUI");
        frame.setContentPane(new sportfestGUI().gfhfgtzhjnthn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
