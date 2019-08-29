package com.loginportal.utils.model;

import java.sql.Timestamp;

public class Deactivate {
	private Long deactivateId;
	private Long userID;
	private Timestamp deactivateTime;

	public Deactivate() {
		super();
	}

	public Long getDeactivateId() {
		return deactivateId;
	}

	public void setDeactivateId(Long deactivateId) {
		this.deactivateId = deactivateId;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public Timestamp getDeactivateTime() {
		return deactivateTime;
	}

	public void setDeactivateTime(Timestamp deactivateTime) {
		this.deactivateTime = deactivateTime;
	}

	@Override
	public String toString() {
		return "Deactivate [deactivateId=" + deactivateId + ", userID=" + userID + ", deactivateTime=" + deactivateTime
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deactivateId == null) ? 0 : deactivateId.hashCode());
		result = prime * result + ((deactivateTime == null) ? 0 : deactivateTime.hashCode());
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
		Deactivate other = (Deactivate) obj;
		if (deactivateId == null) {
			if (other.deactivateId != null)
				return false;
		} else if (!deactivateId.equals(other.deactivateId))
			return false;
		if (deactivateTime == null) {
			if (other.deactivateTime != null)
				return false;
		} else if (!deactivateTime.equals(other.deactivateTime))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}

}
