package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class ClassUse {
    private Integer classUseId;
    private Integer classId;
    private Integer week;
    private Integer time;
    private Integer day;

    public ClassUse() {
    }

    public ClassUse(Integer classId, Integer week, Integer time) {
        this.classId = classId;
        this.week = week;
        this.time = time;
    }

    public ClassUse(Integer classUseId, Integer classId, Integer week, Integer time) {
        this.classUseId = classUseId;
        this.classId = classId;
        this.week = week;
        this.time = time;
    }

    public Integer getClassUseId() {
        return classUseId;
    }

    public void setClassUseId(Integer classUseId) {
        this.classUseId = classUseId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
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
