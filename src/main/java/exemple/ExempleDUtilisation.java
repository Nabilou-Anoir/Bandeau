package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va changer de police");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Monospaced 15 Bold");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);

        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne de 45°...");
        monBandeau.setRotation(Math.PI / 2.0f);
        monBandeau.sleep(1000);
        monBandeau.setRotation(0.0f);

        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.setMessage("On va changer de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(3000);
        monBandeau.close();

        Bandeau bandeau = new Bandeau();

        Scenario scenario = new Scenario();
        scenario.ajouterEffet(new Clignotant(5), 3);
        scenario.ajouterEffet(new JeuDuPendu(), 5);
        scenario.ajouterEffet(new Zoom(50), 2);

        scenario.afficherBandeau(bandeau);
    }
}
