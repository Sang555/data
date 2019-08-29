package com.loginportal.utils.model;

import java.sql.Timestamp;

public class Token {
	private Long tokenID;
	private String token;
	private Timestamp createdDate;
	private String tokenType;
	private Long userID;
	
	public Token() {
		super();
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public Long getTokenID() {
		return tokenID;
	}
	public void setTokenID(Long tokenID) {
		this.tokenID = tokenID;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	@Override
	public String toString() {
		return "Token [userID=" + userID + ", tokenID=" + tokenID + ", token=" + token + ", createdDate=" + createdDate
				+ ", tokenType=" + tokenType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result + ((tokenID == null) ? 0 : tokenID.hashCode());
		result = prime * result + ((tokenType == null) ? 0 : tokenType.hashCode());
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
		Token other = (Token) obj;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (tokenID == null) {
			if (other.tokenID != null)
				return false;
		} else if (!tokenID.equals(other.tokenID))
			return false;
		if (tokenType == null) {
			if (other.tokenType != null)
				return false;
		} else if (!tokenType.equals(other.tokenType))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}
	
	
}
