package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class TimeTable {
    private Integer timetableId;
    private Integer teachingClassId;
    private Integer teacherId;
    private Integer roomId;
    private Integer week;
    private Integer time;
    private Integer day;

    public TimeTable() {
    }

    public TimeTable(Integer teachingClassId, Integer teacherId, Integer week, Integer time) {
        this.teachingClassId = teachingClassId;
        this.teacherId = teacherId;
        this.week = week;
        this.time = time;
    }

    public TimeTable(Integer timetableId, Integer teachingClassId, Integer teacherId, Integer roomId,Integer week, Integer time,Integer day) {
        this.timetableId = timetableId;
        this.teachingClassId = teachingClassId;
        this.teacherId = teacherId;
        this.roomId = roomId;
        this.week = week;
        this.time = time;
        this.day = day;
    }

    public Integer getTimetableId() {
        return timetableId;
    }

    public void setTimetableId(Integer timetableId) {
        this.timetableId = timetableId;
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

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
