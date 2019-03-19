package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class RoomUse {
    private Long roomUseId;
    private Long roomId;
    private String week;
    private String time;

    public RoomUse() {
    }

    public RoomUse(Long roomId, String week, String time) {
        this.roomId = roomId;
        this.week = week;
        this.time = time;
    }

    public RoomUse(Long roomUseId, Long roomId, String week, String time) {
        this.roomUseId = roomUseId;
        this.roomId = roomId;
        this.week = week;
        this.time = time;
    }

    public Long getRoomUseId() {
        return roomUseId;
    }

    public void setRoomUseId(Long roomUseId) {
        this.roomUseId = roomUseId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
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
