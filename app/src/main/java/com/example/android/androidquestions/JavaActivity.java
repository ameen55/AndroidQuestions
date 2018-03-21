package com.example.android.androidquestions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.androidquestions.List.Question;
import com.example.android.androidquestions.List.QuestionAdapter;

import java.util.ArrayList;

public class JavaActivity extends AppCompatActivity {
    String[] javaQuestions;
    String[] javaAnsrs;
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
        javaQuestions = new String[] { "J Q 1", "J Q 2", "J Q 3", "J Q 4", "J Q 5", "J Q 6", "J Q 7", "J Q 8", "J Q 9", "J Q 10" };

        javaAnsrs = new String[] { "J A 1", "J A 2", "J A 3", "J A 4", "J A 5", "J A 6", "J A 7", "J A 8", "J A 9", "J A 10" };
        ListView list = (ListView) findViewById(R.id.list);
        for (int i = 0; i < javaQuestions.length; i++)
        {
            Question question = new Question(javaQuestions[i], javaAnsrs[i]);
            // Binds all strings into an array
            arraylist.add(question);
        }

        // Pass results to ListViewAdapter Class
        adapter = new QuestionAdapter(this, arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);
    }
}
