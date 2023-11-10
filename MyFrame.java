import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
    ImageIcon image;
    JButton searchTitleButton;
    JButton showLibraryButton;
    JButton sortTitleButton;
    JButton sortGenreButton;
    JButton sortPersonButton;
    JButton sortYearButton;
    JTextField textField;
    JButton exit;
    Books[] Material1;
    CD[] Material2;
    DVD[] Material3;
    MyFrame(Books[] material1, CD[] material2, DVD[] material3){
        Material1 = material1;
        Material2 = material2;
        Material3 = material3;

        searchTitleButton = new JButton("Search Title");
        searchTitleButton.setBounds(80,10,150,50);
        searchTitleButton.addActionListener(this);

        showLibraryButton = new JButton();
        showLibraryButton.setBounds(150,100,150,50);
        showLibraryButton.addActionListener(this);
        showLibraryButton.setText("Show all");
        showLibraryButton.setHorizontalAlignment(SwingConstants.CENTER);

        sortTitleButton = new JButton();
        sortTitleButton.setBounds(150,160,150,50);
        sortTitleButton.addActionListener(this);
        sortTitleButton.setText("Sort by Title");

        sortGenreButton = new JButton();
        sortGenreButton.setBounds(150,220,150,50);
        sortGenreButton.addActionListener(this);
        sortGenreButton.setText("Sort by Genre");

        sortPersonButton = new JButton();
        sortPersonButton = new JButton();
        sortPersonButton.setBounds(100,280,250,50);
        sortPersonButton.addActionListener(this);
        sortPersonButton.setText("Sort by Author / Artist / Director");

        sortYearButton = new JButton();
        sortYearButton.setBounds(150,340,150,50);
        sortYearButton.addActionListener(this);
        sortYearButton.setText("Sort by Year");

        textField = new JTextField();
        textField.setBounds(230, 10, 150, 50);

        exit = new JButton();
        exit.setBounds(150,400,150,50);
        exit.addActionListener(this);
        exit.setText("Exit");

        image = new ImageIcon("D:\\IntelliJ\\Library Materials GUI\\Library Materials\\src\\lebron.png");
        this.setIconImage(image.getImage());
        this.setTitle("Library Materials App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(searchTitleButton);
        this.add(textField);
        this.add(showLibraryButton);
        this.add(sortTitleButton);
        this.add(sortGenreButton);
        this.add(sortPersonButton);
        this.add(sortYearButton);
        this.add(exit);
        exit.setHorizontalAlignment(SwingConstants.CENTER);
    }
    public void actionPerformed(ActionEvent e ){
        if (e.getSource() == showLibraryButton) {
            JFrame frame = new JFrame("Library Content");
            JPanel panel = new JPanel(new GridLayout(0, 1));
            JTextArea booksTextArea = new JTextArea();
            JTextArea cdTextArea = new JTextArea();
            JTextArea dvdTextArea = new JTextArea();
            for (int i = 0; i < Material1.length; i++) {
                Books book = Material1[i];
                booksTextArea.append("Book " + (i + 1) + ": " + book.getTitle() + ", " + book.getGenre() + ", " + book.getPerson() + ", " + book.getYear() + "\n");
            }
            for (int i = 0; i < Material2.length; i++) {
                CD cd = Material2[i];
                cdTextArea.append("CD " + (i + 1) + ": " + cd.getTitle() + ", " + cd.getGenre() + ", " + cd.getPerson() + ", " + cd.getYear() + "\n");
            }
            for (int i = 0; i < Material3.length; i++) {
                DVD dvd = Material3[i];
                dvdTextArea.append("DVD " + (i + 1) + ": " + dvd.getTitle() + ", " + dvd.getGenre() + ", " + dvd.getPerson() + ", " + dvd.getYear() + "\n");
            }
            panel.add(booksTextArea);
            panel.add(cdTextArea);
            panel.add(dvdTextArea);
            frame.add(panel);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }
        else if (e.getSource() == sortTitleButton) {
            Arrays.sort(Material1, (a, b) -> a.getTitle().compareTo(b.getTitle()));
            Arrays.sort(Material2, (a, b) -> a.getTitle().compareTo(b.getTitle()));
            Arrays.sort(Material3, (a, b) -> a.getTitle().compareTo(b.getTitle()));
            JFrame frame = new JFrame("Sorted by Title");
            JPanel panel = new JPanel(new GridLayout(0, 1));
            JTextArea booksTextArea = new JTextArea();
            JTextArea cdTextArea = new JTextArea();
            JTextArea dvdTextArea = new JTextArea();
            for (int i = 0; i < Material1.length; i++) {
                Books book = Material1[i];
                booksTextArea.append("Book " + (i + 1) + ": " + book.getTitle() + ", " + book.getGenre() + ", " + book.getPerson() + ", " + book.getYear() + "\n");
            }
            for (int i = 0; i < Material2.length; i++) {
                CD cd = Material2[i];
                cdTextArea.append("CD " + (i + 1) + ": " + cd.getTitle() + ", " + cd.getGenre() + ", " + cd.getPerson() + ", " + cd.getYear() + "\n");
            }
            for (int i = 0; i < Material3.length; i++) {
                DVD dvd = Material3[i];
                dvdTextArea.append("DVD " + (i + 1) + ": " + dvd.getTitle() + ", " + dvd.getGenre() + ", " + dvd.getPerson() + ", " + dvd.getYear() + "\n");
            }
            panel.add(booksTextArea);
            panel.add(cdTextArea);
            panel.add(dvdTextArea);
            frame.add(panel);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }
        else if (e.getSource() == sortGenreButton) {
            Arrays.sort(Material1, (a, b) -> a.getGenre().compareTo(b.getGenre()));
            Arrays.sort(Material2, (a, b) -> a.getGenre().compareTo(b.getGenre()));
            Arrays.sort(Material3, (a, b) -> a.getGenre().compareTo(b.getGenre()));
            JFrame frame = new JFrame("Sorted by Genre");
            JPanel panel = new JPanel(new GridLayout(0, 1));
            JTextArea booksTextArea = new JTextArea();
            JTextArea cdTextArea = new JTextArea();
            JTextArea dvdTextArea = new JTextArea();
            for (int i = 0; i < Material1.length; i++) {
                Books book = Material1[i];
                booksTextArea.append("Book " + (i + 1) + ": " + book.getTitle() + ", " + book.getGenre() + ", " + book.getPerson() + ", " + book.getYear() + "\n");
            }
            for (int i = 0; i < Material2.length; i++) {
                CD cd = Material2[i];
                cdTextArea.append("CD " + (i + 1) + ": " + cd.getTitle() + ", " + cd.getGenre() + ", " + cd.getPerson() + ", " + cd.getYear() + "\n");
            }
            for (int i = 0; i < Material3.length; i++) {
                DVD dvd = Material3[i];
                dvdTextArea.append("DVD " + (i + 1) + ": " + dvd.getTitle() + ", " + dvd.getGenre() + ", " + dvd.getPerson() + ", " + dvd.getYear() + "\n");
            }
            panel.add(booksTextArea);
            panel.add(cdTextArea);
            panel.add(dvdTextArea);
            frame.add(panel);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }
        else if (e.getSource() == sortPersonButton) {
            Arrays.sort(Material1, (a, b) -> a.getPerson().compareTo(b.getPerson()));
            Arrays.sort(Material2, (a, b) -> a.getPerson().compareTo(b.getPerson()));
            Arrays.sort(Material3, (a, b) -> a.getPerson().compareTo(b.getPerson()));
            JFrame frame = new JFrame("Sorted by Author / Artist / Director");
            JPanel panel = new JPanel(new GridLayout(0, 1));
            JTextArea booksTextArea = new JTextArea();
            JTextArea cdTextArea = new JTextArea();
            JTextArea dvdTextArea = new JTextArea();
            for (int i = 0; i < Material1.length; i++) {
                Books book = Material1[i];
                booksTextArea.append("Book " + (i + 1) + ": " + book.getTitle() + ", " + book.getGenre() + ", " + book.getPerson() + ", " + book.getYear() + "\n");
            }
            for (int i = 0; i < Material2.length; i++) {
                CD cd = Material2[i];
                cdTextArea.append("CD " + (i + 1) + ": " + cd.getTitle() + ", " + cd.getGenre() + ", " + cd.getPerson() + ", " + cd.getYear() + "\n");
            }
            for (int i = 0; i < Material3.length; i++) {
                DVD dvd = Material3[i];
                dvdTextArea.append("DVD " + (i + 1) + ": " + dvd.getTitle() + ", " + dvd.getGenre() + ", " + dvd.getPerson() + ", " + dvd.getYear() + "\n");
            }
            panel.add(booksTextArea);
            panel.add(cdTextArea);
            panel.add(dvdTextArea);
            frame.add(panel);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }
        else if (e.getSource()==sortYearButton){
            Arrays.sort(Material1, (a, b) -> Integer.compare(a.getYear(), b.getYear()));
            Arrays.sort(Material2, (a, b) -> Integer.compare(a.getYear(), b.getYear()));
            Arrays.sort(Material3, (a, b) -> Integer.compare(a.getYear(), b.getYear()));
            JFrame frame = new JFrame("Sorted by Year");
            JPanel panel = new JPanel(new GridLayout(0, 1));
            JTextArea booksTextArea = new JTextArea();
            JTextArea cdTextArea = new JTextArea();
            JTextArea dvdTextArea = new JTextArea();
            for (int i = 0; i < Material1.length; i++) {
                Books book = Material1[i];
                booksTextArea.append("Book " + (i + 1) + ": " + book.getTitle() + ", " + book.getGenre() + ", " + book.getPerson() + ", " + book.getYear() + "\n");
            }
            for (int i = 0; i < Material2.length; i++) {
                CD cd = Material2[i];
                cdTextArea.append("CD " + (i + 1) + ": " + cd.getTitle() + ", " + cd.getGenre() + ", " + cd.getPerson() + ", " + cd.getYear() + "\n");
            }
            for (int i = 0; i < Material3.length; i++) {
                DVD dvd = Material3[i];
                dvdTextArea.append("DVD " + (i + 1) + ": " + dvd.getTitle() + ", " + dvd.getGenre() + ", " + dvd.getPerson() + ", " + dvd.getYear() + "\n");
            }
            panel.add(booksTextArea);
            panel.add(cdTextArea);
            panel.add(dvdTextArea);
            frame.add(panel);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }
        else if (e.getSource()==sortYearButton){
            Arrays.sort(Material1, (a, b) -> Integer.compare(a.getYear(), b.getYear()));
            Arrays.sort(Material2, (a, b) -> Integer.compare(a.getYear(), b.getYear()));
            Arrays.sort(Material3, (a, b) -> Integer.compare(a.getYear(), b.getYear()));
            JFrame frame = new JFrame("Sorted by Year");
            JPanel panel = new JPanel(new GridLayout(0, 1));
            JTextArea booksTextArea = new JTextArea();
            JTextArea cdTextArea = new JTextArea();
            JTextArea dvdTextArea = new JTextArea();
            for (int i = 0; i < Material1.length; i++) {
                Books book = Material1[i];
                booksTextArea.append("Book " + (i + 1) + ": " + book.getTitle() + ", " + book.getGenre() + ", " + book.getPerson() + ", " + book.getYear() + "\n");
            }
            for (int i = 0; i < Material2.length; i++) {
                CD cd = Material2[i];
                cdTextArea.append("CD " + (i + 1) + ": " + cd.getTitle() + ", " + cd.getGenre() + ", " + cd.getPerson() + ", " + cd.getYear() + "\n");
            }
            for (int i = 0; i < Material3.length; i++) {
                DVD dvd = Material3[i];
                dvdTextArea.append("DVD " + (i + 1) + ": " + dvd.getTitle() + ", " + dvd.getGenre() + ", " + dvd.getPerson() + ", " + dvd.getYear() + "\n");
            }
            panel.add(booksTextArea);
            panel.add(cdTextArea);
            panel.add(dvdTextArea);
            frame.add(panel);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }
        else if (e.getSource() == searchTitleButton) {
            String searchTitle = textField.getText();
            boolean found = false;
            try {
                if (searchTitle.trim().isEmpty()) {
                    throw new Exception("Input is blank.");
                }
                for (Books book : Material1) {
                    if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    for (CD cd : Material2) {
                        if (cd.getTitle().equalsIgnoreCase(searchTitle)) {
                            found = true;
                            break;
                        }
                    }
                }
                if (!found) {
                    for (DVD dvd : Material3) {
                        if (dvd.getTitle().equalsIgnoreCase(searchTitle)) {
                            found = true;
                            break;
                        }
                    }
                }
                if (found) {
                    JOptionPane.showMessageDialog(null, "We have that material.", "Material Available ", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "We don't have " + textField.getText() + ". Try checking your spelling.", "Material Not Available ", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception f) {
                JOptionPane.showMessageDialog(null, "Input is blank. Please enter a title.", "Blank Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource()==exit){
            System.exit(0);
        }
    }
}
