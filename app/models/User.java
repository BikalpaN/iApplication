package models;

import io.ebean.*;
import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User extends Model {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String passwordHash;
    @Formats.DateTime(pattern="dd/MM/yyyy")
    private Date joinDate;
    private int type;

    //Static finder that will return a user based on the extend methods of Model
    public static final Finder<Long, User> find = new Finder<>(User.class);

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
