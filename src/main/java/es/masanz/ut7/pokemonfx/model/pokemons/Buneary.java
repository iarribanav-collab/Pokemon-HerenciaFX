package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Normal;

public class Buneary extends Pokemon implements Normal {

    public Buneary(int nivel) {
        super(nivel);
    }

    @Override
    protected void asignarAtaques() {
        Ataque patadaBaja = new Ataque("Patada Baja", 70, 100, Tipo.LUCHA, false, 15);
        asignarAtaque(patadaBaja.getNombre(), patadaBaja);

        Ataque bote = new Ataque("Bote", 85, 85, Tipo.VOLADOR, false, 5);
        asignarAtaque(bote.getNombre(), bote);

        Ataque rayoHielo = new Ataque("Rayo Hielo", 90, 100, Tipo.HIELO, true, 10);
        asignarAtaque(rayoHielo.getNombre(), rayoHielo);

        Ataque encanto = new Ataque("Encanto", 75, 100, Tipo.HADA, true,20);
        asignarAtaque(encanto.getNombre(), encanto);
    }

    @Override
    public int nivelEvolucion() {
        return 25;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Lopunny(this.nivel);
        return pokemon;
    }
}
