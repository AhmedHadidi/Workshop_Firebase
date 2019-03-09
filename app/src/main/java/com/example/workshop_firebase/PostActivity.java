package com.example.workshop_firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PostActivity extends AppCompatActivity {

    private Button btnlogout, btnpost;
    private EditText editpost;
    private TextView txtusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        btnlogout = (Button)findViewById(R.id.btnlogout);
        btnpost = (Button)findViewById(R.id.btnpost);
        editpost = (EditText)findViewById(R.id.editpost);
        txtusername = (TextView)findViewById(R.id.txtusername);
    }
}
