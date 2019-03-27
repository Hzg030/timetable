package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class ClassMapping {
    private Integer classMappingId;
    private Integer teachingClassId;
    private Integer classId;

    public ClassMapping() {
    }

    public ClassMapping(Integer teachingClassId, Integer classId) {
        this.teachingClassId = teachingClassId;
        this.classId = classId;
    }

    public ClassMapping(Integer classMappingId, Integer teachingClassId, Integer classId) {
        this.classMappingId = classMappingId;
        this.teachingClassId = teachingClassId;
        this.classId = classId;
    }

    public Integer getClassMappingId() {
        return classMappingId;
    }

    public void setClassMappingId(Integer classMappingId) {
        this.classMappingId = classMappingId;
    }

    public Integer getTeachingClassId() {
        return teachingClassId;
    }

    public void setTeachingClassId(Integer teachingClassId) {
        this.teachingClassId = teachingClassId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
