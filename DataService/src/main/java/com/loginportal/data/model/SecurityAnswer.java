package com.loginportal.data.model;

public class SecurityAnswer {
	private Long secId;
	private Long securityQueID1;
	private Long securityQueID2;
	private String securityAnsID1;
	private String securityAnsID2;

	public SecurityAnswer() {
		super();
	}

	public Long getSecId() {
		return secId;
	}

	public void setSecId(Long secId) {
		this.secId = secId;
	}

	public Long getSecurityQueID1() {
		return securityQueID1;
	}

	public void setSecurityQueID1(Long securityQueID1) {
		this.securityQueID1 = securityQueID1;
	}

	public Long getSecurityQueID2() {
		return securityQueID2;
	}

	public void setSecurityQueID2(Long securityQueID2) {
		this.securityQueID2 = securityQueID2;
	}

	public String getSecurityAnsID1() {
		return securityAnsID1;
	}

	public void setSecurityAnsID1(String securityAnsID1) {
		this.securityAnsID1 = securityAnsID1;
	}

	public String getSecurityAnsID2() {
		return securityAnsID2;
	}

	public void setSecurityAnsID2(String securityAnsID2) {
		this.securityAnsID2 = securityAnsID2;
	}

	@Override
	public String toString() {
		return "SecurityAnswer [secId=" + secId + ", securityQueID1=" + securityQueID1 + ", securityQueID2="
				+ securityQueID2 + ", securityAnsID1=" + securityAnsID1 + ", securityAnsID2=" + securityAnsID2 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (secId ^ (secId >>> 32));
		result = prime * result + ((securityAnsID1 == null) ? 0 : securityAnsID1.hashCode());
		result = prime * result + ((securityAnsID2 == null) ? 0 : securityAnsID2.hashCode());
		result = prime * result + (int) (securityQueID1 ^ (securityQueID1 >>> 32));
		result = prime * result + (int) (securityQueID2 ^ (securityQueID2 >>> 32));
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
		SecurityAnswer other = (SecurityAnswer) obj;
		if (secId != other.secId)
			return false;
		if (securityAnsID1 == null) {
			if (other.securityAnsID1 != null)
				return false;
		} else if (!securityAnsID1.equals(other.securityAnsID1))
			return false;
		if (securityAnsID2 == null) {
			if (other.securityAnsID2 != null)
				return false;
		} else if (!securityAnsID2.equals(other.securityAnsID2))
			return false;
		if (securityQueID1 != other.securityQueID1)
			return false;
		if (securityQueID2 != other.securityQueID2)
			return false;
		return true;
	}

}
