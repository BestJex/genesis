package edu.yctc.genesis.entity;

import java.util.Date;

public class ClassScoreDO {

    /** 主键 */
    private long id;
    /** 用户id */
    private long userId;
    /** 课时id */
    private long lessonId;
    /** 得分 */
    private double score;
    /** 创建时间 */
    private Date createTime;
    /** 修改时间 */
    private Date modifyTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getLessonId() {
        return lessonId;
    }

    public void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "ClassScoreDO [id=" + id + ", userId=" + userId + ", lessonId=" + lessonId + ", score=" + score
            + ", createTime=" + createTime + ", modifyTime=" + modifyTime + "]";
    }
}
