package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class RoomUse {
    private Integer roomUseId;
    private Integer roomId;
    private Integer week;
    private Integer time;
    private Integer day;

    public RoomUse() {
    }

    public RoomUse(Integer roomId, Integer week, Integer time) {
        this.roomId = roomId;
        this.week = week;
        this.time = time;
    }

    public RoomUse(Integer roomUseId, Integer roomId, Integer week, Integer time) {
        this.roomUseId = roomUseId;
        this.roomId = roomId;
        this.week = week;
        this.time = time;
    }

    public Integer getRoomUseId() {
        return roomUseId;
    }

    public void setRoomUseId(Integer roomUseId) {
        this.roomUseId = roomUseId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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
