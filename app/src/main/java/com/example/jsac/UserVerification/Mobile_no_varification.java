package com.example.jsac.UserVerification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jsac.R;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;




public class Mobile_no_varification extends AppCompatActivity {

    EditText textBox;
    Button reg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_no_varification);
        getSupportActionBar().hide();

        //textbox
        textBox = findViewById(R.id.registration);
        //textbox end

        // Regester component here
        reg=(Button) findViewById(R.id.reg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a=0;//sendData(textBox.getText().toString());
                if(a==0)
                {
                    Context context = getApplicationContext();
                    CharSequence text = "OTP Sent Success!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Intent i = new Intent(Mobile_no_varification.this,Otp_verifaction.class);
                    startActivity(i);
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Error!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });



    }

//    private int sendData(String data) {
////        String NAMESPACE = "http://localhost/";
////        String METHOD_NAME = "Mobile_Number_Verifiy";
////        String SOAP_ACTION = NAMESPACE + METHOD_NAME;
////        String URL = "https://localhost:44376/WebService1.asmx";
////
////        String soapRequest =
////                "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
////                        "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
////                        "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" " +
////                        "xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
////                        "<soap:Body>" +
////                        "<" + METHOD_NAME + " xmlns=\"" + NAMESPACE + "\">" +
////                        "<editTextValue>" + data + "</editTextValue>" +
////                        "</" + METHOD_NAME + ">" +
////                        "</soap:Body>" +
////                        "</soap:Envelope>";
////
////        try {
////            URL url = new URL(URL);
////            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
////            connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
////            connection.setRequestMethod("POST");
////            connection.setDoOutput(true);
////
////            OutputStream outputStream = connection.getOutputStream();
////            outputStream.write(soapRequest.getBytes());
////            outputStream.flush();
////            outputStream.close();
////
////            int responseCode = connection.getResponseCode();
////
////            if (responseCode == HttpURLConnection.HTTP_OK) {
////                InputStream inputStream = connection.getInputStream();
////                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
////                StringBuilder stringBuilder = new StringBuilder();
////                String line;
////                while ((line = bufferedReader.readLine()) != null) {
////                    stringBuilder.append(line);
////                }
////                inputStream.close();
////                bufferedReader.close();
////                return 0;
////            } else {
////                return 1;
////            }
////        } catch (Exception e) {
////            e.printStackTrace();
////            return 1;
////        }
//    }

}
