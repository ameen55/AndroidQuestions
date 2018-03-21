package com.example.android.androidquestions.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.android.androidquestions.QuestionActivity;
import com.example.android.androidquestions.R;

import java.util.ArrayList;

/**
 * Created by AMEEN on 20/03/2018.
 */

public class QuestionAdapter extends BaseAdapter {
    // Declare Variables
    private final Context mContext;
    private final LayoutInflater inflater;
    private final ArrayList<Question> questions;

    public  QuestionAdapter(Context context , ArrayList<Question>questions){
        mContext = context;
        inflater = LayoutInflater.from(mContext);
        this.questions=questions;
    }

    @Override
    public int getCount() {
        return questions.size();
    }

    @Override
    public Object getItem(int position) {
        return questions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        View view = inflater.inflate(R.layout.list_item,parent, false);

        TextView txtTitle = (TextView) view.findViewById(R.id.title);

        txtTitle.setText(questions.get(position).getqName());
        // Listen for ListView Item Click
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Send single item click data to SingleItemView Class
                Intent intent = new Intent(mContext, QuestionActivity.class);
                // Pass all data rank
                intent.putExtra("qn",(questions.get(position).getqName()));
                // Pass all data country
                intent.putExtra("qa",(questions.get(position).getqAnsr()));
                // Pass all data flag
                // Start SingleItemView Class
                mContext.startActivity(intent);
            }
        });

        return view;
    }
}


