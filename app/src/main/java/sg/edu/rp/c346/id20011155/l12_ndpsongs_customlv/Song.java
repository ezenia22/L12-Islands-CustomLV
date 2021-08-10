package sg.edu.rp.c346.id20011155.l12_ndpsongs_customlv;

import java.io.Serializable;

public class Song implements Serializable {

    private int id;
    private String title;
    private String singers;
    private int yearReleased;
    private int stars;

    public Song(String title, String singers, int yearReleased, int stars) {
        this.title = title;
        this.singers = singers;
        this.yearReleased = yearReleased;
        this.stars = stars;
    }

    public Song(int id, String title, String singers, int yearReleased, int stars) {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.yearReleased = yearReleased;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public Song setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Song setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSingers() {
        return singers;
    }

    public Song setSingers(String singers) {
        this.singers = singers;
        return this;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public Song setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
        return this;
    }

    public int getStars() {
        return stars;
    }

    public Song setStars(int stars) {
        this.stars = stars;
        return this;
    }

//    @Override
//    public String toString() {
//        String starsString = "";
//        if (stars == 5){
//            starsString = "*****";
//        } else if (stars == 4){
//            starsString = "****";
//       }
//
//        //or
//        for(int i = 0; i < stars; i++){
//            starsString += "*";
//        }
//        return title + "\n" + singers + " - " + yearReleased + "\n" + starsString;
//    }

//    public String theStars(int stars) {
//        switch(stars) {
//            case 1:
//                return "*";
//            case 2:
//                return "* *";
//            case 3:
//                return "* * *";
//            case 4:
//                return "* * * *";
//            case 5:
//                return "* * * * *";
//            default:
//                return "";
//        }
//    }

    public String toStringYears()
    {
        String yr = "";
        yr = String.valueOf(getYearReleased());
        return yr;
    }
}
