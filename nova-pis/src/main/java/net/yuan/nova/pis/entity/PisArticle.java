package net.yuan.nova.pis.entity;

import java.util.Date;

public class PisArticle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PISP_ARTICLE.ID
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PISP_ARTICLE.TILE
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    private String tile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PISP_ARTICLE.SOURCE
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PISP_ARTICLE.PUB_TIME
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    private Date pubTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PISP_ARTICLE.STATUS
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PISP_ARTICLE.COVER
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    private String cover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PISP_ARTICLE.VIEW_TIMES
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    private Long viewTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PISP_ARTICLE.CONTENT
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PISP_ARTICLE.ID
     *
     * @return the value of PISP_ARTICLE.ID
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PISP_ARTICLE.ID
     *
     * @param id the value for PISP_ARTICLE.ID
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PISP_ARTICLE.TILE
     *
     * @return the value of PISP_ARTICLE.TILE
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public String getTile() {
        return tile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PISP_ARTICLE.TILE
     *
     * @param tile the value for PISP_ARTICLE.TILE
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public void setTile(String tile) {
        this.tile = tile == null ? null : tile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PISP_ARTICLE.SOURCE
     *
     * @return the value of PISP_ARTICLE.SOURCE
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PISP_ARTICLE.SOURCE
     *
     * @param source the value for PISP_ARTICLE.SOURCE
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PISP_ARTICLE.PUB_TIME
     *
     * @return the value of PISP_ARTICLE.PUB_TIME
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public Date getPubTime() {
        return pubTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PISP_ARTICLE.PUB_TIME
     *
     * @param pubTime the value for PISP_ARTICLE.PUB_TIME
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PISP_ARTICLE.STATUS
     *
     * @return the value of PISP_ARTICLE.STATUS
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PISP_ARTICLE.STATUS
     *
     * @param status the value for PISP_ARTICLE.STATUS
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PISP_ARTICLE.COVER
     *
     * @return the value of PISP_ARTICLE.COVER
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PISP_ARTICLE.COVER
     *
     * @param cover the value for PISP_ARTICLE.COVER
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PISP_ARTICLE.VIEW_TIMES
     *
     * @return the value of PISP_ARTICLE.VIEW_TIMES
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public Long getViewTimes() {
        return viewTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PISP_ARTICLE.VIEW_TIMES
     *
     * @param viewTimes the value for PISP_ARTICLE.VIEW_TIMES
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public void setViewTimes(Long viewTimes) {
        this.viewTimes = viewTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PISP_ARTICLE.CONTENT
     *
     * @return the value of PISP_ARTICLE.CONTENT
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PISP_ARTICLE.CONTENT
     *
     * @param content the value for PISP_ARTICLE.CONTENT
     *
     * @mbggenerated Wed Apr 06 22:39:45 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}