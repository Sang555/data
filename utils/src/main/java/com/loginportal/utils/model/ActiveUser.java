package com.loginportal.utils.model;

import java.sql.Timestamp;

public class ActiveUser {
	private Long activeUserID;
	private Long userID;
	private String emailID;
	private String userAgent;
	private String ipAddress;
	private String location;
	private Timestamp loggedInTime;

	public ActiveUser() {
		super();
	}

	public Long getActiveUserID() {
		return activeUserID;
	}

	public void setActiveUserID(Long activeUserID) {
		this.activeUserID = activeUserID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Timestamp getLoggedInTime() {
		return loggedInTime;
	}

	public void setLoggedInTime(Timestamp loggedInTime) {
		this.loggedInTime = loggedInTime;
	}

	@Override
	public String toString() {
		return "ActiveUser [activeUserID=" + activeUserID + ", userID=" + userID + ", emailID=" + emailID
				+ ", userAgent=" + userAgent + ", ipAddress=" + ipAddress + ", location=" + location + ", loggedInTime="
				+ loggedInTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activeUserID == null) ? 0 : activeUserID.hashCode());
		result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((loggedInTime == null) ? 0 : loggedInTime.hashCode());
		result = prime * result + ((userAgent == null) ? 0 : userAgent.hashCode());
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActiveUser other = (ActiveUser) obj;
		if (activeUserID == null) {
			if (other.activeUserID != null)
				return false;
		} else if (!activeUserID.equals(other.activeUserID))
			return false;
		if (emailID == null) {
			if (other.emailID != null)
				return false;
		} else if (!emailID.equals(other.emailID))
			return false;
		if (ipAddress == null) {
			if (other.ipAddress != null)
				return false;
		} else if (!ipAddress.equals(other.ipAddress))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (loggedInTime == null) {
			if (other.loggedInTime != null)
				return false;
		} else if (!loggedInTime.equals(other.loggedInTime))
			return false;
		if (userAgent == null) {
			if (other.userAgent != null)
				return false;
		} else if (!userAgent.equals(other.userAgent))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}

}
