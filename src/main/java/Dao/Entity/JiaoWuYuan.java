package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class JiaoWuYuan {
    private Long jiaowuyuanId;
    private String username;
    private String password;
    private String name;
    private String phoneNumber;
    private String institute;
    private String email;

    public JiaoWuYuan() {
    }

    public JiaoWuYuan(String username, String password, String name, String phoneNumber, String institute, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.institute = institute;
        this.email = email;
    }

    public JiaoWuYuan(Long jiaowuyuanId, String username, String password, String name, String phoneNumber, String institute, String email) {
        this.jiaowuyuanId = jiaowuyuanId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.institute = institute;
        this.email = email;
    }

    public Long getJiaowuyuanId() {
        return jiaowuyuanId;
    }

    public void setJiaowuyuanId(Long jiaowuyuanId) {
        this.jiaowuyuanId = jiaowuyuanId;
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

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
