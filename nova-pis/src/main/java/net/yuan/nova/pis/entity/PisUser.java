package net.yuan.nova.pis.entity;

import java.util.Date;

import net.yuan.nova.core.shiro.vo.User;

public class PisUser {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.USER_ID
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String userId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.USER_NAME
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String userName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.NICK
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String nick;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.USER_ICON
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String userIcon;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.PASSWORD
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String password;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.SALT
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String salt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.EMAIL
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String email;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.TEL
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String tel;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.TYPE
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String type;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.VIP_LEVEL
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String vipLevel;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.STATUS
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String status;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.SORT
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private Short sort;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.CREATETIME
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private Date createTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.PROMO_CODE
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String promoCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column PIS_USER.PROMO_CODE_P
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	private String promoCodeP;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.USER_ID
	 *
	 * @return the value of PIS_USER.USER_ID
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.USER_ID
	 *
	 * @param userId
	 *            the value for PIS_USER.USER_ID
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.USER_NAME
	 *
	 * @return the value of PIS_USER.USER_NAME
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.USER_NAME
	 *
	 * @param userName
	 *            the value for PIS_USER.USER_NAME
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.NICK
	 *
	 * @return the value of PIS_USER.NICK
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.NICK
	 *
	 * @param nick
	 *            the value for PIS_USER.NICK
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setNick(String nick) {
		this.nick = nick == null ? null : nick.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.USER_ICON
	 *
	 * @return the value of PIS_USER.USER_ICON
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getUserIcon() {
		return userIcon;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.USER_ICON
	 *
	 * @param userIcon
	 *            the value for PIS_USER.USER_ICON
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon == null ? null : userIcon.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.PASSWORD
	 *
	 * @return the value of PIS_USER.PASSWORD
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.PASSWORD
	 *
	 * @param password
	 *            the value for PIS_USER.PASSWORD
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.SALT
	 *
	 * @return the value of PIS_USER.SALT
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.SALT
	 *
	 * @param salt
	 *            the value for PIS_USER.SALT
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setSalt(String salt) {
		this.salt = salt == null ? null : salt.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.EMAIL
	 *
	 * @return the value of PIS_USER.EMAIL
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.EMAIL
	 *
	 * @param email
	 *            the value for PIS_USER.EMAIL
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.TEL
	 *
	 * @return the value of PIS_USER.TEL
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.TEL
	 *
	 * @param tel
	 *            the value for PIS_USER.TEL
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.TYPE
	 *
	 * @return the value of PIS_USER.TYPE
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.TYPE
	 *
	 * @param type
	 *            the value for PIS_USER.TYPE
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.VIP_LEVEL
	 *
	 * @return the value of PIS_USER.VIP_LEVEL
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getVipLevel() {
		return vipLevel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.VIP_LEVEL
	 *
	 * @param vipLevel
	 *            the value for PIS_USER.VIP_LEVEL
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel == null ? null : vipLevel.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.STATUS
	 *
	 * @return the value of PIS_USER.STATUS
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.STATUS
	 *
	 * @param status
	 *            the value for PIS_USER.STATUS
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.SORT
	 *
	 * @return the value of PIS_USER.SORT
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public Short getSort() {
		return sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.SORT
	 *
	 * @param sort
	 *            the value for PIS_USER.SORT
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setSort(Short sort) {
		this.sort = sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.CREATETIME
	 *
	 * @return the value of PIS_USER.CREATETIME
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.CREATETIME
	 *
	 * @param createtime
	 *            the value for PIS_USER.CREATETIME
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.PROMO_CODE
	 *
	 * @return the value of PIS_USER.PROMO_CODE
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getPromoCode() {
		return promoCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.PROMO_CODE
	 *
	 * @param promoCode
	 *            the value for PIS_USER.PROMO_CODE
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode == null ? null : promoCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column PIS_USER.PROMO_CODE_P
	 *
	 * @return the value of PIS_USER.PROMO_CODE_P
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public String getPromoCodeP() {
		return promoCodeP;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column PIS_USER.PROMO_CODE_P
	 *
	 * @param promoCodeP
	 *            the value for PIS_USER.PROMO_CODE_P
	 *
	 * @mbggenerated Wed Mar 23 14:22:23 CST 2016
	 */
	public void setPromoCodeP(String promoCodeP) {
		this.promoCodeP = promoCodeP == null ? null : promoCodeP.trim();
	}

	public User toUser() {
		User user = new User();
		if ("A".equals(this.getType())) {
			user.setType(User.Type.staff);
		} else {
			user.setType(User.Type.pubUser);
		}
		user.setUserId(this.getUserId());
		user.setUserName(this.getNick());
		user.setLoginName(this.getUserName());
		user.setPassword(this.getPassword());
		user.setSalt(this.getSalt());
		user.setEmail(this.getEmail());
		user.setPhoneNumber(this.getTel());
		return user;
	}
}