package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Charmeleon extends Pokemon implements Fuego {
    public Charmeleon(int nivel) {
        super(nivel);
    }

    @Override
    protected void asignarAtaques() {
        Ataque punioTrueno = new Ataque("Puño Trueno", 75, 100, Tipo.ELECTRICO, false, 15);
        asignarAtaque(punioTrueno.getNombre(), punioTrueno);

        Ataque colmilloIgneo = new Ataque("Colmillo Igneo", 65, 95, Tipo.FUEGO, false, 15);
        asignarAtaque(colmilloIgneo.getNombre(), colmilloIgneo);

        Ataque colaFerrea = new Ataque("Cola Ferrea", 100, 75, Tipo.ACERO, false, 15);
        asignarAtaque(colaFerrea.getNombre(), colaFerrea);

        Ataque garraUmbria = new Ataque("Garra Umbria", 70, 100, Tipo.FANTASMA, false, 15);
        asignarAtaque(garraUmbria.getNombre(), garraUmbria);
    }

    @Override
    public int nivelEvolucion() {
        return 36;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Charizard(this.nivel);
        return pokemon;
    }
}
