package assignment19.acadgild.com.assignment191.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import assignment19.acadgild.com.assignment191.R;
import assignment19.acadgild.com.assignment191.models.WeatherModel;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
    //initialize an array list for weather model
    private ArrayList<WeatherModel> arrayList;
    public WeatherAdapter( ArrayList<WeatherModel> weatherArrayList) {
        //set the array list to the one thats passed
        arrayList = weatherArrayList;
    }

    @NonNull
    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //        Create view with the custom layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_layout, null);
        //        make a new viewholder with the view
        WeatherAdapter.ViewHolder viewHolder = new WeatherAdapter.ViewHolder(view);
         //        return the viewholder
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.ViewHolder holder, int position) {
        //set the value to the holder variable thats associated with it
        holder.latTextView.setText(arrayList.get(position).getCoord().getLat());
        //set the value to the holder variable thats associated with it
        holder.longTextView.setText(arrayList.get(position).getCoord().getLon());
        //set the value to the holder variable thats associated with it
        holder.weatherMainTextView.setText(arrayList.get(position).getWeather()[position].getMain());
        //set the value to the holder variable thats associated with it
        holder.weatherDescrTextView.setText(arrayList.get(position).getWeather()[position].getDescription());
        //set the value to the holder variable thats associated with it
        holder.mainTempTextView.setText(arrayList.get(position).getMain().getTemp());
        //set the value to the holder variable thats associated with it
        holder.mainPressureTextView.setText(arrayList.get(position).getMain().getPressure());
        //set the value to the holder variable thats associated with it
        holder.mainHumidityTextView.setText(arrayList.get(position).getMain().getHumidity());
        //set the value to the holder variable thats associated with it
        holder.mainTempMaxTextView.setText(arrayList.get(position).getMain().getTemp_max());
        //set the value to the holder variable thats associated with it
        holder.mainTempMinTextView.setText(arrayList.get(position).getMain().getTemp_min());
        //set the value to the holder variable thats associated with it
        holder.visibilityTextView.setText(arrayList.get(position).getVisibility());
        //set the value to the holder variable thats associated with it
        holder.windSpeedTextView.setText(arrayList.get(position).getWind().getSpeed());
        //set the value to the holder variable thats associated with it
        holder.windDegTextView.setText(arrayList.get(position).getWind().getDeg());
        //set the value to the holder variable thats associated with it
        holder.countryTextView.setText(arrayList.get(position).getSys().getCountry());
        //set the value to the holder variable thats associated with it
        holder.countryNameTextView.setText(arrayList.get(position).getName());
        //set the value to the holder variable thats associated with it
        holder.weatherIdTextView.setText(arrayList.get(position).getWeather()[position].getId());
        //set the value to the holder variable thats associated with it
        holder.cloudsTextView.setText(arrayList.get(position).getClouds().getAll());
        //set the value to the holder variable thats associated with it
        holder.baseStationsTextView.setText(arrayList.get(position).getBase());
        //set the value to the holder variable thats associated with it
        holder.codTextView.setText(arrayList.get(position).getCod());
        //set the value to the holder variable thats associated with it
        holder.sunsetTextView.setText(arrayList.get(position).getSys().getSunset());
        //set the value to the holder variable thats associated with it
        holder.sunriseTextView.setText(arrayList.get(position).getSys().getSunrise());
        //set the value to the holder variable thats associated with it
        holder.idTextView.setText(arrayList.get(position).getId());
        //set the value to the holder variable thats associated with it
        holder.idSysTextView.setText(arrayList.get(position).getSys().getId());
        //set the value to the holder variable thats associated with it
        holder.dtTextView.setText(arrayList.get(position).getDt());
        //set the value to the holder variable thats associated with it
        holder.typeTextView.setText(arrayList.get(position).getSys().getType());
        //set the value to the holder variable thats associated with it
        holder.messageTextView.setText(arrayList.get(position).getSys().getMessage());
    }

    @Override
    public int getItemCount() {
        //return the array list size
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //create textview variables that holds all the info
        TextView latTextView,longTextView
                ,weatherMainTextView
                ,weatherDescrTextView
                ,mainTempTextView
                ,mainPressureTextView
                ,mainHumidityTextView
                ,mainTempMaxTextView
                ,mainTempMinTextView
                ,visibilityTextView
                ,windSpeedTextView
                ,windDegTextView
                ,countryTextView
                ,countryNameTextView
                , weatherIdTextView
                , cloudsTextView
                ,baseStationsTextView
                ,codTextView
                ,sunriseTextView
                ,sunsetTextView
                ,idTextView
                ,dtTextView
                ,typeTextView
                ,idSysTextView
                ,messageTextView
                ;

        public ViewHolder(View itemView) {
            super(itemView);
            //reference the textview item to the corresponding id
            latTextView = itemView.findViewById(R.id.textview_lat_modify);
            //reference the textview item to the corresponding id
            longTextView = itemView.findViewById(R.id.textView_long_modify);
            //reference the textview item to the corresponding id
            weatherMainTextView = itemView.findViewById(R.id.textView_Main_Modify);
            //reference the textview item to the corresponding id
            weatherDescrTextView = itemView.findViewById(R.id.textView_Main_Desc_Modify);
            //reference the textview item to the corresponding id
            mainTempTextView  = itemView.findViewById(R.id.textView_Main_Temp);
            //reference the textview item to the corresponding id
            mainPressureTextView = itemView.findViewById(R.id.textView_Main_Pressure);
            //reference the textview item to the corresponding id
            mainHumidityTextView = itemView.findViewById(R.id.textView_Main_Humidity);
            //reference the textview item to the corresponding id
            mainTempMaxTextView = itemView.findViewById(R.id.textView_Main_Temp_Max);
            //reference the textview item to the corresponding id
            mainTempMinTextView = itemView.findViewById(R.id.textView_Main_Temp_Min);
            //reference the textview item to the corresponding id
            visibilityTextView = itemView.findViewById(R.id.textView_Visibilty_Modify);
            //reference the textview item to the corresponding id
            windSpeedTextView = itemView.findViewById(R.id.textView_Wind_Speed_Modify);
            //reference the textview item to the corresponding id
            windDegTextView = itemView.findViewById(R.id.textView_Wind_Deg_Modify);
            //reference the textview item to the corresponding id
            countryTextView = itemView.findViewById(R.id.textView_Country_Initials);
            //reference the textview item to the corresponding id
            countryNameTextView = itemView.findViewById(R.id.textView_Country_Modify);
            //reference the textview item to the corresponding id
            weatherIdTextView = itemView.findViewById(R.id.textView_Weather_Id_Change);
            //reference the textview item to the corresponding id
            cloudsTextView = itemView.findViewById(R.id.textView_Clouds_Modify);
            //reference the textview item to the corresponding id
            baseStationsTextView = itemView.findViewById(R.id.textView_Base_Stations);
            //reference the textview item to the corresponding id
            codTextView = itemView.findViewById(R.id.textView_Cod);
            //reference the textview item to the corresponding id
            sunriseTextView = itemView.findViewById(R.id.textView_Sunrise);
            //reference the textview item to the corresponding id
            sunsetTextView = itemView.findViewById(R.id.textView_Sunset);
            //reference the textview item to the corresponding id
            idTextView = itemView.findViewById(R.id.textView_Id);
            //reference the textview item to the corresponding id
            idSysTextView= itemView.findViewById(R.id.textView_Sys_id);
            //reference the textview item to the corresponding id
            dtTextView = itemView.findViewById(R.id.textView_Dt);
            //reference the textview item to the corresponding id
            typeTextView = itemView.findViewById(R.id.textView_Type);
            //reference the textview item to the corresponding id
            messageTextView = itemView.findViewById(R.id.textView_Sys_Message);
        }
    }
}