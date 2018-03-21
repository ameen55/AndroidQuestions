package com.example.android.androidquestions;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.androidquestions.List.Question;

public class QuestionActivity extends AppCompatActivity {
    TextView qTextView,aTextView;
    protected String qn,qa,dd;
    EditText editText;
    MediaPlayer mediaPlayer;
    ImageView clapImage;
    TypedArray setPicid;
    Question question;
    AnimationDrawable clapAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();
        // Get the results of rank
        qn = i.getStringExtra("qn");
        // Get the results of country
        qa = i.getStringExtra("qa");
        Toast.makeText(QuestionActivity.this, qa+ "\n"+qn, Toast.LENGTH_SHORT).show();

        Button bOk= (Button) findViewById(R.id.ok);
         clapImage = (ImageView) findViewById(R.id.image_view);


        // Locate the TextViews in singleitemview.xml
        qTextView = (TextView) findViewById(R.id.question_text_view);
        //aTextView = (TextView) findViewById(R.id.qaa);
        editText = (EditText) findViewById(R.id.editText);

        // Load the results into the TextViews
        qTextView.setText(qn);
        //aTextView.setText(qa);
        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dd=editText.getText().toString();
                if(qa.equals(dd)){
                    clapImage.setBackgroundResource(R.drawable.clap);
                    clapAnimation = (AnimationDrawable) clapImage.getBackground();
                    mediaPlayer = MediaPlayer.create(QuestionActivity.this, R.raw.correct);
                    mediaPlayer.start();
                    mediaPlayer = MediaPlayer.create(QuestionActivity.this, R.raw.clap);
                    mediaPlayer.start();
                    clapAnimation.start();
                    Toast.makeText(QuestionActivity.this, "true"+qa, Toast.LENGTH_SHORT).show();
                }
                else{ Toast.makeText(QuestionActivity.this, "false"+qa, Toast.LENGTH_SHORT).show();
                    mediaPlayer = MediaPlayer.create(QuestionActivity.this, R.raw.wrong);
                    mediaPlayer.start();
                }
            }
        });
    }
}
