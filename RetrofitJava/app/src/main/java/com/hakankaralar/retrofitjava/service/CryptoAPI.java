package com.hakankaralar.retrofitjava.service;

import com.hakankaralar.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json


    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")


    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();
}
