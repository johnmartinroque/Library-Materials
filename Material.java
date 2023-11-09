class Material {
    private final String title, genre, person;
    private final int year;

    Material(String title, String genre, String person, int year) {
        this.title = title;
        this.genre = genre;
        this.person = person;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }


    public String getGenre() {
        return genre;
    }


    public String getPerson() {
        return person;
    }


    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Person: " + person + ", Year: " + year;
    }
}
