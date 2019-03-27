package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class Teacher {
    private Integer teacherId;
    private String username;
    private String password;
    private String name;
    private String phoneNumber;
    private String intitute;
    private String major;
    private String email;

    public Teacher() {
    }

    public Teacher(String username, String password, String name, String phoneNumber, String intitute, String major, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.intitute = intitute;
        this.major = major;
        this.email = email;
    }

    public Teacher(Integer teacherId, String username, String password, String name, String phoneNumber, String intitute, String major, String email) {
        this.teacherId = teacherId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.intitute = intitute;
        this.major = major;
        this.email = email;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIntitute() {
        return intitute;
    }

    public void setIntitute(String intitute) {
        this.intitute = intitute;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
