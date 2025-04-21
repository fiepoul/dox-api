package com.example.doxapi.model;

public class Film {
    private Long id;
    private String title;
    private String description;
    private String director;
    private int runtime; // in minutes
    private String posterUrl;
    private String screeningTime; // e.g., "10:00 - 11:30"

    // Constructor
    public Film(Long id, String title, String description, String director, int runtime, String posterUrl, String screeningTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.director = director;
        this.runtime = runtime;
        this.posterUrl = posterUrl;
        this.screeningTime = screeningTime;
    }

    // Default constructor
    public Film() {
    }

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getRuntime() {
        return runtime;
    }
    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
    public String getPosterUrl() {
        return posterUrl;
    }
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
    public String getScreeningTime() {
        return screeningTime;
    }
    public void setScreeningTime(String screeningTime) {
        this.screeningTime = screeningTime;
    }
}

