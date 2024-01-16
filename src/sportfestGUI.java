import com.sun.jdi.DoubleValue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sportfestGUI {
    private JTextField textN;
    private JTextField textNN;
    private JButton hinzuB;
    private JPanel gfhfgtzhjnthn;
    private JTextArea textArea1;
    private JTextField textzeit;
    Schüler pSchüler;

    List<Schüler> teilnehmerlist;
   

    public sportfestGUI() {
        hinzuB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teilnehmerlist = new List<Schüler>();
                pSchüler  = new Schüler();
                    if(teilnehmerlist.isEmpty()){
                        Schüler Schüler = new Schüler(textN.getText(), textNN.getText(), Double.valueOf(textzeit.getText()));
                            teilnehmerlist.append(pSchüler);

                            teilnehmerlist.toFirst();
                            textArea1.setText(textN.getText()+" "+ textNN.getText()+" "+textzeit.getText());
                            textN.setText("");
                            textNN.setText("");
                            textzeit.setText("");



             
              


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
