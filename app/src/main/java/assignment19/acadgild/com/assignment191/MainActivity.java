package assignment19.acadgild.com.assignment191;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;

import assignment19.acadgild.com.assignment191.adapter.WeatherAdapter;
import assignment19.acadgild.com.assignment191.models.WeatherModel;

public class MainActivity extends AppCompatActivity implements ResponseHandlerInterface{
    //initialize a recycler view
    RecyclerView weatherRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the layout
        setContentView(R.layout.activity_main);
        //reference the recyclerview to the corresponding id
        weatherRecyclerView = findViewById(R.id.weather_recyclerview);
        //create new instance of fetchweatherdata that grabs the data
        FetchWeatherData fetchWeatherData = new FetchWeatherData(MainActivity.this,this);
        //executes the task in background
        fetchWeatherData.execute();
    }

    //receives information from the asynk task
    @Override
    public void updateActivity(String data) {
        //create an array list for weather models
        ArrayList<WeatherModel> weatherArrayList = new ArrayList<>();
        //create new gson
        Gson gson = new Gson();
        //parse the JSON string and put it into a weather model
        WeatherModel weatherModel = gson.fromJson(data,WeatherModel.class);
        //add the weather model to the array list
        weatherArrayList.add(weatherModel);
        //create new adapter with an array list
        WeatherAdapter weatherAdapter = new WeatherAdapter(weatherArrayList);
        //Create a linearlayout manager with it being vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        //Set the layout manager
        weatherRecyclerView.setLayoutManager(linearLayoutManager);
        //set adapter to the recyclerview
        weatherRecyclerView.setAdapter(weatherAdapter);
    }
}