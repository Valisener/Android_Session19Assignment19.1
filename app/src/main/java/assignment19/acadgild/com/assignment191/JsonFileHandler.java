/*package assignment19.acadgild.com.assignment191;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class JsonFileHandler implements Constants{


    public String getJsonFile() {
        //Initialize response to null
        String response = null;
        try {
            //make a new url with the url address
            URL url = new URL(URL_ADDRESS);
            //make an http connection to the website
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //Tell it to use get when requesting the information
            connection.setRequestMethod("GET");
            //Read the connection response
            InputStream inputStream = new BufferedInputStream(connection.getInputStream());
            //Convert the response to a string
            response = convertToString(inputStream);
            // catch exception
        } catch (MalformedURLException e) {
            e.printStackTrace();
            // catch exception
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    private String convertToString(InputStream inputStream) throws IOException {
        //Create a buffered reader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //create a new string builder
        StringBuilder stringBuilder = new StringBuilder();
        //a string that contains the sentence
        String sentence;

        try {
            while ((sentence = bufferedReader.readLine()) != null) {
                stringBuilder.append(sentence).append('\n');
            }
            // catch exception
        } catch (IOException e) {
            e.printStackTrace();
            }
            //close input stream
            finally {
            inputStream.close();;
        }
        // return the string builder as a string
        return stringBuilder.toString();
    }
}
*/