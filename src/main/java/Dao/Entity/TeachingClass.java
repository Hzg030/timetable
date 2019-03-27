package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class TeachingClass {
    private Integer teachingClassId;
    private Integer teacherId;
    private String institute;
    private String major;
    private Integer totalCount;
    private String name;
    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeachingClass() {
    }

    public TeachingClass(Integer teacherId, String institute, String major, String year, String term, Integer totalCount, String name) {
        this.teacherId = teacherId;
        this.institute = institute;
        this.major = major;
        this.totalCount = totalCount;
        this.name = name;
    }

    public TeachingClass(Integer teachingClassId, Integer teacherId, String institute, String major, String year, String term, Integer totalCount, String name) {
        this.teachingClassId = teachingClassId;
        this.teacherId = teacherId;
        this.institute = institute;
        this.major = major;
        this.totalCount = totalCount;
        this.name = name;
    }

    public Integer getTeachingClassId() {
        return teachingClassId;
    }

    public void setTeachingClassId(Integer teachingClassId) {
        this.teachingClassId = teachingClassId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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


    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
