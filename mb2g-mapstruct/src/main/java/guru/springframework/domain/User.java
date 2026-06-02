package guru.springframework.domain;

/**
 * Created by jt on 2018-12-09.
 */
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String favoriteColor;

    public User() {
    }

    public User(String firstName, String lastName, String email,  String favoriteColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.favoriteColor = favoriteColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) { this.favoriteColor = favoriteColor; }
}
