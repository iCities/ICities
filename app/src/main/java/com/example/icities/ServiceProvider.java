package com.example.icities;

import com.example.icities.Clases.City;
import com.example.icities.Clases.CityCollection;
import com.example.icities.Clases.Place;
import com.example.icities.Clases.PlaceCollection;
import com.example.icities.Clases.Userdata;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ServiceProvider {
    @GET("city/creator/{uid}")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<CityCollection> getAllCities(@Path("uid") String uid);

    @GET("city/{id}")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<City> getCity(@Path("id") int id);

    @GET("place/city/{id}")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<PlaceCollection> getAllPlaces(@Path("id") int id);

    @GET("place/{id}")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<Place> getPlace(@Path("id") int id);

    @GET("user/{uid}")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<Userdata> getUser(@Path("uid") String uid);

    @PUT("city")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> editCity(@Body City city);

    @PUT("place")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> editPlace(@Body Place place);

    @PUT("user")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> editUser(@Body Userdata user);

    @POST("city")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> insertCity(@Body City city);

    @POST("place/{cityId}")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> insertPlace(@Path("cityId") int id, @Body Place place);

    @POST("user")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> insertUser(@Body Userdata userdata);

    @DELETE("city/{id}")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> deleteCity(@Path("id") int id);

    @DELETE("city/{id}/force")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> deleteCityForce(@Path("id") int id);

    @DELETE("place/{id}")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> deletePlace(@Path("id") int id);

    @DELETE("user/{uid}")
    @Headers({"Accept: application/xml", "Content-Type: application/xml"})
    Call<JsonResponse> deleteUser(@Path("uid") String uid);

}

