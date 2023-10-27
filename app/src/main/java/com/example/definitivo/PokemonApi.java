package com.example.definitivo;

import android.net.Uri;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class PokemonApi {
    String BASE_URL = "https://pokeapi.co/api/v2/";

    ArrayList<Pokemon> getPokemonsSimple(){

        Uri builtUri = Uri.parse(BASE_URL)
                .buildUpon()
                .appendPath("pokemon")
                .build();
        String url = builtUri.toString();

        return doCall(url);
    }



    private ArrayList<Pokemon> doCall(String url) {
        try {
            String JsonResponse = HttpUtils.get(url);
            return processJson(JsonResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private ArrayList<Pokemon> processJson(String jsonResponse){
        ArrayList<Pokemon> pokemos = new ArrayList<>();

        try {
            JSONObject data = new JSONObject(jsonResponse);
            JSONArray jsonPokemons = data.getJSONArray("results");
            for (int i = 0; i < jsonPokemons.length(); i++){
                JSONObject jsonPokemon = jsonPokemons.getJSONObject(i);

                Pokemon pokemon =  new Pokemon();
                pokemon.setName(jsonPokemon.getString("name"));
                pokemon.setUrlInfo(jsonPokemon.getString("url"));

                /*String info = HttpUtils.get(pokemon.getUrlInfo());
                JSONObject jsonInfo = jsonPokemons.getJSONObject(i);
                pokemon.setAbility(jsonInfo.getString("ability"));*/


                pokemos.add(pokemon);
            }
        }catch (JSONException e){
            e.printStackTrace();
        }

        return pokemos;
    }

}


