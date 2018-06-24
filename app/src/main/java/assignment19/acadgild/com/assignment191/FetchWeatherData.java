package assignment19.acadgild.com.assignment191;

import android.content.Context;
import android.os.AsyncTask;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FetchWeatherData extends AsyncTask<Void,Void,String> implements Constants{
    //context not sure why its here but teacher had this so i followed suit
    private Context context;
    //reponse handler initialization
    private ResponseHandlerInterface responseHandler;
    //Constructor that accepts response handler and context
    FetchWeatherData(Context con,ResponseHandlerInterface responseHandlerInterface){
        //set the variable for context
        context = con;
        //set responsehandler
        responseHandler = responseHandlerInterface;
    }

    @Override
    protected String doInBackground(Void... voids) {
        //Create new httpclient
        OkHttpClient okHttpClient= new OkHttpClient();
        //Set the connection time out in case it cant connect
        okHttpClient.setConnectTimeout(120, TimeUnit.SECONDS);
        //set the read timeout in case it cant read the data in a timely manner
        okHttpClient.setReadTimeout(120,TimeUnit.SECONDS);
        //create a new request and pass the url address
        Request request = new Request.Builder().url(URL_ADDRESS).build();
        //initialize the string response data to null
        String responseData = null;
        try {
            //make a request from the client server
            Response response = okHttpClient.newCall(request).execute();
            //check if it was successful
            if (response.isSuccessful()){
                //Set response data to the response since it was successful
                responseData = response.body().string();
            }
            //catch exception in case an error occurs
        } catch (IOException e) {
            e.printStackTrace();
        }
        //send back the response
        return responseData;
    }
    //when finished with task
    @Override
    protected void onPostExecute(String response) {
        super.onPostExecute(response);
        //update main activity with the response
        responseHandler.updateActivity(response);
    }
}
