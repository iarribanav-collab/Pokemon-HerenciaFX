package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Wartortle extends Pokemon implements Agua {
    public Wartortle(int nivel) {
        super(nivel);
    }

    @Override
    protected void asignarAtaques() {
        Ataque hidroariete = new Ataque("Hidroairete", 85, 100, Tipo.AGUA, false, 10);
        asignarAtaque(hidroariete.getNombre(), hidroariete);

        Ataque mordisco = new Ataque("Mordisco", 60, 100, Tipo.SINIESTRO, false, 25);
        asignarAtaque(mordisco.getNombre(), mordisco);

        Ataque ventisca = new Ataque("Ventisca", 110, 70, Tipo.HIELO, true, 5);
        asignarAtaque(ventisca.getNombre(), ventisca);

        Ataque bofetonLodo = new Ataque("Bofeton Lodo", 20, 100, Tipo.TIERRA, true, 10);
        asignarAtaque(bofetonLodo.getNombre(), bofetonLodo);
    }

    @Override
    public int nivelEvolucion() {
        return 36;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Blastoise(this.nivel);
        return pokemon;
    }

    @Override
    public Pokemon clone() {
        Pokemon pokemon = new Wartortle(this.nivel);
        return pokemon;
    }
}
