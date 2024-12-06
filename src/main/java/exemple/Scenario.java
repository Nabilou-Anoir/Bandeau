package exemple;


import bandeau.Bandeau;
import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private final List<EffetRepetition> effets = new ArrayList<>();

    public void ajouterEffet(Effet effet, int repetitions) {
        effets.add(new EffetRepetition(effet, repetitions));
    }

    public void afficherBandeau(Bandeau bandeau) {
        for (EffetRepetition effetRepetition : effets) {
            for (int i = 0; i < effetRepetition.repetitions; i++) {
                effetRepetition.effet.afficherBandeau(bandeau);
            }
        }
    }

    private static class EffetRepetition {
        Effet effet;
        int repetitions;

        EffetRepetition(Effet effet, int repetitions) {
            this.effet = effet;
            this.repetitions = repetitions;
        }
    }
}