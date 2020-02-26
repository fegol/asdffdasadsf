import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("https://anapioficeandfire.com/api/houses/")
    fun getHouseList():Call<List<HouseList>>

}