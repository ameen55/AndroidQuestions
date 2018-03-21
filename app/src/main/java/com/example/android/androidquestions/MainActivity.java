package com.example.android.androidquestions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.androidquestions.List.Question;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    EditText editTexe;
    Question question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //textInputEditText = (TextInputEditText) findViewById(R.id.name_input);
        editTexe = (EditText) findViewById(R.id.name_input);


        final Button javaButton = (Button) findViewById(R.id.java_button);
        javaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question = new Question();
                String name= javaButton.getText().toString() + "\n"+ editTexe.getText().toString();
                intent = new Intent(MainActivity.this,JavaActivity.class);
                question.setMyName(name);
                intent.putExtra("my",question);
                startActivity(intent);
            }
        });
        final Button xmlButton = (Button) findViewById(R.id.xml_button);
        xmlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question = new Question();
                String name= xmlButton.getText().toString() + "\n"+ editTexe.getText().toString();
                intent = new Intent(MainActivity.this,XmlActivity.class);
                question.setMyName(name);
                intent.putExtra("my",question);
                startActivity(intent);
            }
        });
    }

}
