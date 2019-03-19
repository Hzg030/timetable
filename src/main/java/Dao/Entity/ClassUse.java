package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class ClassUse {
    private Long classUseId;
    private Long classId;
    private String week;
    private String time;

    public ClassUse() {
    }

    public ClassUse(Long classId, String week, String time) {
        this.classId = classId;
        this.week = week;
        this.time = time;
    }

    public ClassUse(Long classUseId, Long classId, String week, String time) {
        this.classUseId = classUseId;
        this.classId = classId;
        this.week = week;
        this.time = time;
    }

    public Long getClassUseId() {
        return classUseId;
    }

    public void setClassUseId(Long classUseId) {
        this.classUseId = classUseId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
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
