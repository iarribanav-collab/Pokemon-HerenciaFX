package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fantasma;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Chandelure extends Pokemon implements Fuego, Fantasma {
    public Chandelure(int nivel) {
        super(nivel);
    }

    @Override
    protected void asignarAtaques() {
        Ataque bolaSombra = new Ataque("Bola Sombra", 80, 100, Tipo.FANTASMA, true, 15);
        asignarAtaque(bolaSombra.getNombre(), bolaSombra);

        Ataque llamaEmbrujada = new Ataque("Llama Embrujada", 75, 100, Tipo.FUEGO, true, 10);
        asignarAtaque(llamaEmbrujada.getNombre(), llamaEmbrujada);

        Ataque bombaAcida = new Ataque("Bomba Acida", 40, 100, Tipo.VENENO, true, 20);
        asignarAtaque(bombaAcida.getNombre(), bombaAcida);

        Ataque psiquico = new Ataque("Psiquico", 90, 100, Tipo.PSIQUICO, true, 10);
        asignarAtaque(psiquico.getNombre(), psiquico);
    }

    @Override
    public int nivelEvolucion() {
        return 0;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }
}
