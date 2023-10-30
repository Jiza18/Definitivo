package com.example.definitivo;

import androidx.lifecycle.LiveData;
import androidx.room.*;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    @Query("select * from Pokemon")
    LiveData<List<Pokemon>> getPokemons();

    @Insert
    void addPokemon(Pokemon pokemon);

    @Insert
    void addPokemons(List<Pokemon> pokemons);

    @Delete
    void deletePokemon(Pokemon pokemon);

    @Query("DELETE FROM pokemon")
    void deletePokemons();

}
