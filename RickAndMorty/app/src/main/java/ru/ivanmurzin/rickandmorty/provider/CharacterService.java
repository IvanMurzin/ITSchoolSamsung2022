package ru.ivanmurzin.rickandmorty.provider;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.ivanmurzin.rickandmorty.model.response.AllCharacters;

public interface CharacterService {
    @GET("character")
    Call<AllCharacters> getAllCharacters(@Query("page") int page);
}
