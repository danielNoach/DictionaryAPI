package com.example.dictionaryapi.Models;

public class Phonetics {
    String text = "";
    String audio = "";

    public void setText(String text) {
        this.text = text;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getText() {
        return text;
    }

    public String getAudio() {
        return audio;
    }
}
