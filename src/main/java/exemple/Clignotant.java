package exemple;

import bandeau.Bandeau;
import java.awt.Color;

public class Clignotant extends Effet {
    private final int repetitions;

    public Clignotant(int repetitions) {
        this.repetitions = repetitions;
    }

    @Override
    public void afficherBandeau(Bandeau bandeau) {
        for (int i = 0; i < repetitions; i++) {
            bandeau.setMessage("Clignotant...");
            bandeau.setForeground(Color.RED);
            bandeau.sleep(500);
            bandeau.setForeground(Color.WHITE);
            bandeau.sleep(500);
        }
    }
}