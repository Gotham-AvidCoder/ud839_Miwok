package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;
    private int mAudioTranslationID;


    public Word (String defaultTranslation, String miwokTranslation, int audioTranslationID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioTranslationID = audioTranslationID;

    }

    public Word (String defaultTranslation, String miwokTranslation, int imageReourceID, int audioTranslationID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageReourceID;
        mAudioTranslationID = audioTranslationID;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getAudioTranslationID() {
        return mAudioTranslationID;
    }



}
