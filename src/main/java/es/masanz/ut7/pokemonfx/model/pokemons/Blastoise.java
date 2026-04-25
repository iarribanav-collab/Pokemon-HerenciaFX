package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Blastoise extends Pokemon implements Agua {
    public Blastoise(int nivel) {
        super(nivel);
    }

    @Override
    protected void asignarAtaques() {
        Ataque hidroariete = new Ataque("Hidroairete", 85, 100, Tipo.AGUA, false, 10);
        asignarAtaque(hidroariete.getNombre(), hidroariete);

        Ataque mordisco = new Ataque("Mordisco", 60, 100, Tipo.SINIESTRO, false, 25);
        asignarAtaque(mordisco.getNombre(), mordisco);

        Ataque cabezazoZen = new Ataque("Cabezazo Zen", 80, 90, Tipo.PSIQUICO, false, 15);
        asignarAtaque(cabezazoZen.getNombre(), cabezazoZen);

        Ataque fachada  = new Ataque("Fachada", 70, 100, Tipo.NORMAL, false, 20);
        asignarAtaque(fachada.getNombre(), fachada);
    }

    @Override
    public int nivelEvolucion() {
        return 0;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    public Pokemon clone() {
        Pokemon pokemon = new Blastoise(this.nivel);
        return pokemon;
    }


}
