package com.angoma.arianpc.androidpractica04;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Multipart;
import retrofit2.http.Part;

public interface ApiService {
    String API_BASE_URL = "http://10.0.2.2:8000/";

    @GET("/api/solicitud/")
    Call<List<Solicitud>> getSolicitudes();

    @FormUrlEncoded
    @POST("/api/solicitud/")
    Call<Solicitud> createSolicitud(@Field("email") String email,
                                    @Field("tipo") String tipo,
                                    @Field("motivo") String motivo);
    @Multipart
    @POST("/api/solicitud/")
    Call<Solicitud> createSolicitudWithImage(
            @Part("email") RequestBody email,
            @Part("tipo") RequestBody tipo,
            @Part("motivo") RequestBody motivo,
            @Part MultipartBody.Part imagen
    );
}
