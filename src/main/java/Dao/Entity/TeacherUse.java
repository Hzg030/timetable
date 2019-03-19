package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class TeacherUse {
    private Long teacherUseId;
    private Long teacherId;
    private String week;
    private String time;

    public TeacherUse() {
    }

    public TeacherUse(Long teacherId, String week, String time) {
        this.teacherId = teacherId;
        this.week = week;
        this.time = time;
    }

    public TeacherUse(Long teacherUseId, Long teacherId, String week, String time) {
        this.teacherUseId = teacherUseId;
        this.teacherId = teacherId;
        this.week = week;
        this.time = time;
    }

    public Long getTeacherUseId() {
        return teacherUseId;
    }

    public void setTeacherUseId(Long teacherUseId) {
        this.teacherUseId = teacherUseId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
