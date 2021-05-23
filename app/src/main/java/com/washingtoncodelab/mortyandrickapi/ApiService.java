package com.washingtoncodelab.mortyandrickapi;

interface ApiService {
    public static final String BASE_URL= "https://rickandmortyapi.com/api/";
    @GET("character/")
    Call<RickyMorty> getRepository();
}
