package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class Room {
    private Integer roomId;
    private String roomNumber;
    private Integer buildingId;

    public Room() {
    }

    public Room(String roomNumber, Integer buildingId) {
        this.roomNumber = roomNumber;
        this.buildingId = buildingId;
    }

    public Room(Integer roomId, String roomNumber, Integer buildingId) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.buildingId = buildingId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }
}
