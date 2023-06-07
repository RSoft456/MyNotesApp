package com.example.api.ramsha.mynotes;

public class NotesDataModel {
    String heading,text,date;

    public NotesDataModel(String heading, String text, String date) {
        this.heading = heading;
        this.text = text;
        this.date = date;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
