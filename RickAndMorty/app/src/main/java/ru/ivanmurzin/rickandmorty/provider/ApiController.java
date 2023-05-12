package ru.ivanmurzin.rickandmorty.provider;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.ivanmurzin.rickandmorty.model.response.AllCharacters;
import ru.ivanmurzin.rickandmorty.model.response.Character;

public class ApiController {
    private final Retrofit retrofit;
    private final CharacterService service;
    private int page = 1;

    public void incPage() {
        ++page;
    }

    public ApiController() {
        this.retrofit = new Retrofit.Builder().baseUrl("https://rickandmortyapi.com/api/").addConverterFactory(GsonConverterFactory.create()).build();
        this.service = retrofit.create(CharacterService.class);
    }

    public List<Character> getAllCharacters() {
        Call<AllCharacters> request = service.getAllCharacters(page);
        try {
            Response<AllCharacters> response = request.execute();
            if (response.isSuccessful() && response.body() != null) {
                return response.body().results;
            } else return null;
        } catch (IOException e) {
            return null;
        }
    }
}
