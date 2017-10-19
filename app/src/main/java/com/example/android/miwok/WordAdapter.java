package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int mBackgroundColor;


    public WordAdapter(Activity context, ArrayList<Word> words, int color){
        super(context, 0, words);
        mBackgroundColor = color;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word word = getItem(position);

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_translation_text_view);
        defaultTranslation.setText(word.getDefaultTranslation());

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_translation_text_view);
        miwokTranslation.setText(word.getMiwokTranslation());

        ImageView imageRepresentation = (ImageView) listItemView.findViewById(R.id.image_view);
        imageRepresentation.setImageResource(word.getImageResourceID());
        if (word.getImageResourceID() == 0) imageRepresentation.setVisibility(View.GONE);
        else imageRepresentation.setVisibility(View.VISIBLE);

        View wordsListView = listItemView.findViewById(R.id.words_list_container);
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        wordsListView.setBackgroundColor(color);

        return listItemView;
    }
}
