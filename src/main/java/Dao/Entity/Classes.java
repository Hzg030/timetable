package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class Classes {
    private Long classId;
    private String institute;
    private String major;
    private String name;

    public Classes() {
    }

    public Classes(String institute, String major, String name) {
        this.institute = institute;
        this.major = major;
        this.name = name;
    }

    public Classes(Long classId, String institute, String major, String name) {
        this.classId = classId;
        this.institute = institute;
        this.major = major;
        this.name = name;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
