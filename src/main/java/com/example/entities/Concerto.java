import com.example.entities.Evento;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

@Entity
public class Concerto extends Evento {

    public enum Genere {CLASSICO, ROCK, POP}

    @Enumerated(EnumType.STRING)
    private Genere genere;

    private boolean inStreaming;

    // Costruttori, getters, setters

    public Concerto() {}

    public Concerto (String nome, Date data, Genere genere, boolean inStreaming) {
        super (nome, data);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }
}
