package com.loginportal.data.model;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.loginportal.data.model.PasswordHistory;
import com.loginportal.data.model.SecurityAnswer;

public class User {

	private Long userID;
	private String emailID;
	private String userRole = "user";
	private String firstName;
	private String lastName;
	private String phoneNo;
	private Timestamp accountCreationTime;
	private String accountStatus = "unconfirmed";
	private String gender;
	private String maritalStatus;
	private String profession;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dateOfBirth;
	private PasswordHistory passwordHistory;
	private SecurityAnswer securityAns;

	public User() {
		super();
	}

	public User(Long userID) {
		super();
		this.userID = userID;
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

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Timestamp getAccountCreationTime() {
		return accountCreationTime;
	}

	public void setAccountCreationTime(Timestamp accountCreationTime) {
		this.accountCreationTime = accountCreationTime;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public PasswordHistory getPasswordHistory() {
		return passwordHistory;
	}

	public void setPasswordHistory(PasswordHistory passwordHistory) {
		this.passwordHistory = passwordHistory;
	}

	public SecurityAnswer getSecurityAns() {
		return securityAns;
	}

	public void setSecurityAns(SecurityAnswer securityAns) {
		this.securityAns = securityAns;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", emailID=" + emailID + ", userRole=" + userRole + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + ", accountCreationTime=" + accountCreationTime
				+ ", accountStatus=" + accountStatus + ", gender=" + gender + ", maritalStatus=" + maritalStatus
				+ ", profession=" + profession + ", dateOfBirth=" + dateOfBirth + ", passwordHistory=" + passwordHistory
				+ ", securityAns=" + securityAns + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountCreationTime == null) ? 0 : accountCreationTime.hashCode());
		result = prime * result + ((accountStatus == null) ? 0 : accountStatus.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + ((passwordHistory == null) ? 0 : passwordHistory.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		result = prime * result + ((profession == null) ? 0 : profession.hashCode());
		result = prime * result + ((securityAns == null) ? 0 : securityAns.hashCode());
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
		result = prime * result + ((userRole == null) ? 0 : userRole.hashCode());
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
		User other = (User) obj;
		if (accountCreationTime == null) {
			if (other.accountCreationTime != null)
				return false;
		} else if (!accountCreationTime.equals(other.accountCreationTime))
			return false;
		if (accountStatus == null) {
			if (other.accountStatus != null)
				return false;
		} else if (!accountStatus.equals(other.accountStatus))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (emailID == null) {
			if (other.emailID != null)
				return false;
		} else if (!emailID.equals(other.emailID))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (passwordHistory == null) {
			if (other.passwordHistory != null)
				return false;
		} else if (!passwordHistory.equals(other.passwordHistory))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		if (profession == null) {
			if (other.profession != null)
				return false;
		} else if (!profession.equals(other.profession))
			return false;
		if (securityAns == null) {
			if (other.securityAns != null)
				return false;
		} else if (!securityAns.equals(other.securityAns))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		if (userRole == null) {
			if (other.userRole != null)
				return false;
		} else if (!userRole.equals(other.userRole))
			return false;
		return true;
	}

}
