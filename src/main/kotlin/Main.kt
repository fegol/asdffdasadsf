import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val api = Retrofit.Builder()
    .baseUrl("https://anapioficeandfire.com/api/")
    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(ApiInterface::class.java)
fun main() {
    val a = "asdffsads"
    println(
        api.getHouseList()
            .execute()
            .body()
    )
}