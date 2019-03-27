package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class TeacherUse {
    private Integer teacherUseId;
    private Integer teacherId;
    private Integer week;
    private Integer time;
    private Integer day;

    public TeacherUse() {
    }

    public TeacherUse(Integer teacherId, Integer week, Integer time) {
        this.teacherId = teacherId;
        this.week = week;
        this.time = time;
    }

    public TeacherUse(Integer teacherUseId, Integer teacherId, Integer week, Integer time) {
        this.teacherUseId = teacherUseId;
        this.teacherId = teacherId;
        this.week = week;
        this.time = time;
    }

    public Integer getTeacherUseId() {
        return teacherUseId;
    }

    public void setTeacherUseId(Integer teacherUseId) {
        this.teacherUseId = teacherUseId;
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
}
