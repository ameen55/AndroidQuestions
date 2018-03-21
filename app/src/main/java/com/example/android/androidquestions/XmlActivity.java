package com.example.android.androidquestions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.androidquestions.List.Question;
import com.example.android.androidquestions.List.QuestionAdapter;

import java.util.ArrayList;

public class XmlActivity extends AppCompatActivity {
    String[] xmlQuestions;
    String[] xmlAnsrs;
    QuestionAdapter adapter;
    ArrayList<Question> arraylist = new ArrayList<Question>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent intent = this.getIntent();
        Question question1= (Question) intent.getSerializableExtra("my");
        TextView nameTextView = (TextView) findViewById(R.id.name_text_view);
        nameTextView.setText(nameTextView.getText()+question1.getMyName());
        // Generate sample data
        xmlQuestions = new String[] { "What is the attribute that Present the text in ALL CAPS.", "What is the attribute that Size of the text. ", "What is the attribute that Style (bold, italic, bolditalic) for the text. ", "J Q 4", "X Q 5", "X Q 6", "X Q 7", "X Q 8", "X Q 9", "X Q 10" };

        xmlAnsrs = new String[] { "android:textAllCaps", "android:textSize", "android:textStyle", "X A 4", "X A 5", "X A 6", "X A 7", "X A 8", "X A 9", "X A 10" };
        ListView list = (ListView) findViewById(R.id.list);
        for (int i = 0; i < xmlQuestions.length; i++)
        {
            // Binds all strings into an array
            arraylist.add(new Question(xmlQuestions[i], xmlAnsrs[i]));
        }

        // Pass results to ListViewAdapter Class
        adapter = new QuestionAdapter(this, arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);
    }
}
