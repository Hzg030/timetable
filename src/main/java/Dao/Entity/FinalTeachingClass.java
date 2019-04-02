package Dao.Entity;

public class FinalTeachingClass {
    private Integer teachingClassId;
    private String className;
    private Integer teacherId;
    private String teacherName;
    private String nstitute;
    private String major;
    private String phoneNumber;
    private String email;
    private Integer number;
    private Integer totalCount;

    public FinalTeachingClass(Integer teachingClassId, String className, Integer teacherId,String teacherName, String nstitute, String major, String phoneNumber, String email, Integer number, Integer totalCount) {
        this.teachingClassId = teachingClassId;
        this.className = className;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.nstitute = nstitute;
        this.major = major;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.number = number;
        this.totalCount = totalCount;
    }

    public FinalTeachingClass(String className, Integer teacherId,String teacherName, String nstitute, String major, String phoneNumber, String email, Integer number, Integer totalCount) {
        this.className = className;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.nstitute = nstitute;
        this.major = major;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.number = number;
        this.totalCount = totalCount;
    }

    public Integer getTeachingClassId() {
        return teachingClassId;
    }

    public void setTeachingClassId(Integer teachingClassId) {
        this.teachingClassId = teachingClassId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getNstitute() {
        return nstitute;
    }

    public void setNstitute(String nstitute) {
        this.nstitute = nstitute;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
