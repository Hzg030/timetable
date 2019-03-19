package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class Room {
    private Long roomId;
    private String roomNumber;
    private Long buildingId;

    public Room() {
    }

    public Room(String roomNumber, Long buildingId) {
        this.roomNumber = roomNumber;
        this.buildingId = buildingId;
    }

    public Room(Long roomId, String roomNumber, Long buildingId) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.buildingId = buildingId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }
}
