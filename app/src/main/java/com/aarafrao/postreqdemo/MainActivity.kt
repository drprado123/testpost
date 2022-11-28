package com.aarafrao.postreqdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        networkrequest("this can be any info we need it to")
    }
}


fun networkparser(text:String)
{
    for (i in 1..5)
    {

    }
}
fun networkrequest(info: String){
    val imageloc = "https://assets.stickpng.com/images/587185d57b7f6103e35c6cc7.png"
    val requestModel = RequestModel("OmegaCalendarBot", info,imageloc)

    val response = ServiceBuilder.buildService(ApiInterface::class.java)
    response.sendReq(requestModel).enqueue(
        object : Callback<ResponseModel> {
            override fun onResponse(
                call: Call<ResponseModel>,
                response: Response<ResponseModel>
            ) {
                return
            }

            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                return
            }

        }
    )
}


//https://discord.com/api/webhooks/1042640071779680327/nfJauDqQ8BWP5iFIckpXrcBqqH_y50EE2VQdEfVLBONy4-SgN4IqKY8OL0tTNj8GgHlc
//https://discord.com/api/webhooks/1042645972729204776/cj9-zSz_sazT-WT_STxjz5T9apTwHhNkvs7nvHX97VL0PJKgvcqXqy7YutyckmsOaPOb