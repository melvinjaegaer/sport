public class Schüler {

    public class schüler {
        String vorname;
        String nachname;
        double zeit;

        schüler(String pvorname, String pnachmane, double pzeit){
            vorname=pvorname;
            nachname=pnachmane;
            zeit=pzeit;


        }
        public String getVorname() {
            return vorname;
        }

        public String getNachname() {
            return nachname;
        }
        public double getZeit() {
            return zeit;
        }
    }

   }
