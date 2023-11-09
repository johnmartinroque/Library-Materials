import javax.swing.*;
public class LibraryMaterials extends JFrame {
    public static void main(String[] args) {
        Books[] Material1 = new Books[5];
        Books book1 = new Books("Harry Potter and the Cursed Child", "Fiction", "J.K. Rowling", 2016);
        Books book2 = new Books("The Sixth Extinction", "Non-Fiction", "Elizabeth Kolbert", 2014);
        Books book3 = new Books("The Red Tent", "Historical", "Anita Diamant", 1997);
        Books book4 = new Books("The Stranger", "Novel", "Albert Camus", 1942);
        Books book5 = new Books("Dune", "Novel", "Frank Herbert", 1965);
        Material1[0]=book1;
        Material1[1]=book2;
        Material1[2]=book3;
        Material1[3]=book4;
        Material1[4]=book5;

        CD[] Material2 = new CD[5];
        CD cd1 = new CD("The Eminem Show", "Hip-Hop", "Eminem", 2002);
        CD cd2 = new CD("Starboy", "R&B", "The Weeknd", 2005);
        CD cd3 = new CD("Speak Now", "Country", "Taylor Swift", 2010);
        CD cd4 = new CD("Heroes & Villains", "Hip-Hop", "Metro Boomin", 2022);
        CD cd5 = new CD("Sweetener", "Pop", "Ariana Grande", 2018);
        Material2[0]=cd1;
        Material2[1]=cd2;
        Material2[2]=cd3;
        Material2[3]=cd4;
        Material2[4]=cd5;

        DVD[] Material3 = new DVD[5];
        DVD dvd1 = new DVD("The Dark Knight", "Action", "Christopher Nolan", 2009);
        DVD dvd2 = new DVD("Avengers: Endgame", "Sci-fi", "Anthony Russo", 2019);
        DVD dvd3 = new DVD("Forrest Gump", "Romance", "Robert Zemeckis", 1994);
        DVD dvd4 = new DVD("Orphan", "Horror", "Jaume Collet-Serra", 2009);
        DVD dvd5 = new DVD("Despicable Me", "Comedy", "Pierre Coffin", 2010);
        Material3[0]=dvd1;
        Material3[1]=dvd2;
        Material3[2]=dvd3;
        Material3[3]=dvd4;
        Material3[4]=dvd5;

        MyFrame myFrame = new MyFrame(Material1,Material2,Material3);
    }
}


