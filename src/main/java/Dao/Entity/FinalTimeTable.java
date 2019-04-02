package Dao.Entity;

public class FinalTimeTable {
    private Integer courseId;
    private String courseName;
    private String teacherName;
    private Integer teacherId;
    private Integer week;
    private Integer time;
    private Integer day;
    private String roomNumber;
    private String buildingName;

    public FinalTimeTable(Integer courseId, String courseName, String teacherName, Integer teacherId
            , Integer week, Integer time, Integer day, String roomNumber, String buildingName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.week = week;
        this.time = time;
        this.day = day;
        this.roomNumber = roomNumber;
        this.buildingName = buildingName;
    }

    public FinalTimeTable(String courseName, String teacherName, Integer teacherId
            , Integer week, Integer time, Integer day, String roomNumber, String buildingName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.week = week;
        this.time = time;
        this.day = day;
        this.roomNumber = roomNumber;
        this.buildingName = buildingName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }


}
