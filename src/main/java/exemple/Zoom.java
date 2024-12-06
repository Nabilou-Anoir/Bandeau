package exemple;

import bandeau.Bandeau;
import java.awt.Font;

public class Zoom extends Effet {
    private final int maxSize;

    public Zoom(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void afficherBandeau(Bandeau bandeau) {
        for (int i = 10; i <= maxSize; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, i));
            bandeau.setMessage("Zoom...");
            bandeau.sleep(200);
        }
    }
}