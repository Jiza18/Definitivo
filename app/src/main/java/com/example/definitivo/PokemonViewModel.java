package com.example.definitivo;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PokemonViewModel extends AndroidViewModel {
    private final Application app;
    private final PokeDB pokeDB;
    private final Dao dao;
    private LiveData<List<Pokemon>> pokemons;

    public PokemonViewModel(Application application) {
        super(application);

        this.app = application;
        this.pokeDB = PokeDB.getDatabase(this.getApplication());
        this.dao = pokeDB.getPokemonDao();
    }

    public LiveData<List<Pokemon>> getPokemons() {
        return dao.getPokemons();
    }

    void refresh() {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> {
            PokemonApi api = new PokemonApi();
            ArrayList<Pokemon> pokemonsApi = api.getPokemonsSimple();

            this.dao.deletePokemons();
            this.dao.addPokemons(pokemonsApi);
        });
    }
}

