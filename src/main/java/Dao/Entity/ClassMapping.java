package Dao.Entity;

/**
 *  @author zenggui
 *  @Date 2019/3/19
 */
public class ClassMapping {
    private Long classMappingId;
    private Long teachingClassId;
    private Long classId;

    public ClassMapping() {
    }

    public ClassMapping(Long teachingClassId, Long classId) {
        this.teachingClassId = teachingClassId;
        this.classId = classId;
    }

    public ClassMapping(Long classMappingId, Long teachingClassId, Long classId) {
        this.classMappingId = classMappingId;
        this.teachingClassId = teachingClassId;
        this.classId = classId;
    }

    public Long getClassMappingId() {
        return classMappingId;
    }

    public void setClassMappingId(Long classMappingId) {
        this.classMappingId = classMappingId;
    }

    public Long getTeachingClassId() {
        return teachingClassId;
    }

    public void setTeachingClassId(Long teachingClassId) {
        this.teachingClassId = teachingClassId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }
}
