package com.example.childdictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class TextAdapter extends ArrayAdapter<Word> {

    private static final String TAG = "TextAdapter";
    private Context mContext;
    int mResource;


    public TextAdapter(Context context, int resource, ArrayList<Word> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the word info
        String englishText = getItem(position).getEnglishText();
        String arabicText = getItem(position).getArabicText();
        int imageResourceId = getItem(position).getImageResourceId();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView englishWord = convertView.findViewById(R.id.english_text);
        englishWord.setText(englishText);
        TextView arabicWord = convertView.findViewById(R.id.arabic_text);
        arabicWord.setText(arabicText);
        ImageView imageView = convertView.findViewById(R.id.image_view);
        imageView.setImageResource(imageResourceId);

        return convertView;
    }
}
