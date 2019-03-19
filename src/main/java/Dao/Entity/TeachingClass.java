package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class TeachingClass {
    private Long teachingClassId;
    private Long teacherId;
    private String institute;
    private String major;
    private String year;
    private String team;
    private Long totalCount;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeachingClass() {
    }

    public TeachingClass(Long teacherId, String institute, String major, String year, String team, Long totalCount, String name) {
        this.teacherId = teacherId;
        this.institute = institute;
        this.major = major;
        this.year = year;
        this.team = team;
        this.totalCount = totalCount;
        this.name = name;
    }

    public TeachingClass(Long teachingClassId, Long teacherId, String institute, String major, String year, String team, Long totalCount, String name) {
        this.teachingClassId = teachingClassId;
        this.teacherId = teacherId;
        this.institute = institute;
        this.major = major;
        this.year = year;
        this.team = team;
        this.totalCount = totalCount;
        this.name = name;
    }

    public Long getTeachingClassId() {
        return teachingClassId;
    }

    public void setTeachingClassId(Long teachingClassId) {
        this.teachingClassId = teachingClassId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
