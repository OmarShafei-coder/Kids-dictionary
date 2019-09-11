package com.example.childdictionary;

public class Word {

    private String englishText;
    private String arabicText;
    private int audioResourceId;
    private int imageResourceId;

    public Word(String englishText, String arabicText, int imageResourceId, int audioResourceId) {
        this.englishText = englishText;
        this.arabicText = arabicText;
        this.audioResourceId = audioResourceId;
        this.imageResourceId = imageResourceId;
    }

    //For phrases
    public Word(String englishText, String arabicText, int audioResourceId) {
        this.englishText = englishText;
        this.arabicText = arabicText;
        this.audioResourceId = audioResourceId;
    }

    public String getEnglishText() {
        return englishText;
    }

    public String getArabicText() {
        return arabicText;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
