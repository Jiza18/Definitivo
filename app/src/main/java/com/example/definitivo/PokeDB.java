package com.example.definitivo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Pokemon.class}, version = 1)
 abstract class PokeDB extends RoomDatabase {
    private static PokeDB INSTANCE;

    public static PokeDB getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(
                            context.getApplicationContext(),
                            PokeDB.class,"db"
                    ).build();
        }
        return INSTANCE;
    }

    public abstract Dao getPokemonDao();
}
