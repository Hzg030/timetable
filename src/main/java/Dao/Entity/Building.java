package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class Building {
    private Integer buildingId;
    private String name;
    private String location;
    private String state;

    public Building() {
    }

    public Building(Integer buildingId, String name, String location, String state) {
        this.buildingId = buildingId;
        this.name = name;
        this.location = location;
        this.state = state;
    }

    public Building(String name, String location, String state) {
        this.name = name;
        this.location = location;
        this.state = state;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
