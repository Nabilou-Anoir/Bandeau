package exemple;

import bandeau.Bandeau;

public class JeuDuPendu extends Effet {
    @Override
    public void afficherBandeau(Bandeau bandeau) {
        String message = "Jeu du Pendu";
        StringBuilder affichage = new StringBuilder();
        for (char c : message.toCharArray()) {
            affichage.append(c);
            bandeau.setMessage(affichage.toString());
            bandeau.sleep(300);
        }
    }
}
