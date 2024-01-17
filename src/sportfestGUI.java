import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sportfestGUI {
    Schüler pSchüler;
    List<Schüler> teilnehmerlist;
    private JTextField textN;
    private JTextField textNN;
    private JButton hinzuB;
    private JPanel gfhfgtzhjnthn;
    private JTextArea textArea1;
    private JTextField textzeit;
    private JButton ausgebenB;
   

    public sportfestGUI() {
        teilnehmerlist = new List<Schüler>();
        hinzuB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(teilnehmerlist.isEmpty()){

                    Schüler pSchüler = new Schüler(textN.getText(), textNN.getText(), Double.valueOf(textzeit.getText()));
                    teilnehmerlist.append(pSchüler);

                    teilnehmerlist.toFirst();

                    textN.setText("");
                    textNN.setText("");
                    textzeit.setText("");
                    textArea1.setText(pSchüler.getVorname()+pSchüler.getNachname());
                } else
                {
                    Schüler pSchüler = new Schüler(textN.getText(), textNN.getText(), Double.valueOf(textzeit.getText()));
                    teilnehmerlist.toFirst();
                    while (teilnehmerlist.hasAccess() && pSchüler.getZeit() > teilnehmerlist.getContent().getZeit()) {

                        teilnehmerlist.next();


                    }
                    if (teilnehmerlist.hasAccess()) {
                        teilnehmerlist.insert(pSchüler);

                    } else {
                        teilnehmerlist.append(pSchüler);


                    }

                    textN.setText("");
                    textNN.setText("");
                    textzeit.setText("");
                    textArea1.setText(pSchüler.getVorname()+pSchüler.getNachname());





                }



            }}
        );


        ausgebenB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                teilnehmerlist.toFirst();
                while(teilnehmerlist.hasAccess()){
                    System.out.println(teilnehmerlist.getContent().getVorname()+", "+teilnehmerlist.getContent().getNachname()+", "+teilnehmerlist.getContent().getZeit() );
                    teilnehmerlist.next();
            }
        };















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
