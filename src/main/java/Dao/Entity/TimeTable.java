package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class TimeTable {
    private Long timetableId;
    private Long teachingClassId;
    private Long teacherId;
    private String week;
    private String time;

    public TimeTable() {
    }

    public TimeTable(Long teachingClassId, Long teacherId, String week, String time) {
        this.teachingClassId = teachingClassId;
        this.teacherId = teacherId;
        this.week = week;
        this.time = time;
    }

    public TimeTable(Long timetableId, Long teachingClassId, Long teacherId, String week, String time) {
        this.timetableId = timetableId;
        this.teachingClassId = teachingClassId;
        this.teacherId = teacherId;
        this.week = week;
        this.time = time;
    }

    public Long getTimetableId() {
        return timetableId;
    }

    public void setTimetableId(Long timetableId) {
        this.timetableId = timetableId;
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
