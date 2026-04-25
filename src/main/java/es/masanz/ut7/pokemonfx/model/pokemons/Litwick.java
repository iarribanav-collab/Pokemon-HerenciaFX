package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fantasma;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Litwick extends Pokemon implements Fantasma, Fuego {
    public Litwick(int nivel) {
        super(nivel);
    }

    @Override
    protected void asignarAtaques() {
        Ataque energibola = new Ataque("Energibola", 90, 100, Tipo.PLANTA, true, 10);
        asignarAtaque(energibola.getNombre(), energibola);

        Ataque ruedaFuego = new Ataque("Rueda Fuego", 70, 100, Tipo.FUEGO, false, 25);
        asignarAtaque(ruedaFuego.getNombre(), ruedaFuego);

        Ataque niebla = new Ataque("Niebla", 65, 100, Tipo.HIELO, true, 20);
        asignarAtaque(niebla.getNombre(), niebla);

        Ataque dobleEquipo = new Ataque("Doble Equipo", 120, 75, Tipo.NORMAL, false, 5);
        asignarAtaque(dobleEquipo.getNombre(), dobleEquipo);
    }

    @Override
    public int nivelEvolucion() {
        return 24;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Lampent(this.nivel);
        return pokemon;
    }

    @Override
    public Pokemon clone() {
        Pokemon pokemon = new Litwick(this.nivel);
        return pokemon;
    }
}
