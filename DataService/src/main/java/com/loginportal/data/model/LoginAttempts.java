package com.loginportal.data.model;

import java.time.LocalDateTime;

public class LoginAttempts {
	private Long attemptId;
	private int numberOfAttempts;
	private LocalDateTime lastAttempt;
	private Boolean blocked;
	private Long userID;

	public LoginAttempts() {
		super();
	}

	public Long getAttemptId() {
		return attemptId;
	}

	public void setAttemptId(Long attemptId) {
		this.attemptId = attemptId;
	}

	public int getNumberOfAttempts() {
		return numberOfAttempts;
	}

	public void setNumberOfAttempts(int numberOfAttempts) {
		this.numberOfAttempts = numberOfAttempts;
	}

	public LocalDateTime getLastAttempt() {
		return lastAttempt;
	}

	public void setLastAttempt(LocalDateTime lastAttempt) {
		this.lastAttempt = lastAttempt;
	}

	public Boolean getBlocked() {
		return blocked;
	}

	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "LoginAttempts [attemptId=" + attemptId + ", numberOfAttempts=" + numberOfAttempts + ", lastAttempt="
				+ lastAttempt + ", isBlocked=" + blocked + ", userID=" + userID + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attemptId == null) ? 0 : attemptId.hashCode());
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + ((lastAttempt == null) ? 0 : lastAttempt.hashCode());
		result = prime * result + numberOfAttempts;
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
		LoginAttempts other = (LoginAttempts) obj;
		if (attemptId == null) {
			if (other.attemptId != null)
				return false;
		} else if (!attemptId.equals(other.attemptId))
			return false;
		if (blocked != other.blocked)
			return false;
		if (lastAttempt == null) {
			if (other.lastAttempt != null)
				return false;
		} else if (!lastAttempt.equals(other.lastAttempt))
			return false;
		if (numberOfAttempts != other.numberOfAttempts)
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}
}
