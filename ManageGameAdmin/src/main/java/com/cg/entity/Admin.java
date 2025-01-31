package com.cg.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="manageadmin")
public class Admin {
	@Id
	private int adminId;
	private String adminName;
	private String adminPassword;
	private String adminEmail;

	
	@OneToMany(targetEntity = Game.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ag_fk", referencedColumnName = "adminId")
	private List<Game> games;
	
	
	@OneToMany(targetEntity = PlayCard.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ap_fk", referencedColumnName = "adminId")
	private List<Game> playcards;
		
		public Admin() {
			super();

		}
	
	
		public Admin(int adminId, String adminName, String adminPassword, String adminEmail) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminPassword = adminPassword;
			this.adminEmail = adminEmail;
		}
		
		
		public int getAdminId() {
			return adminId;
		}
		
		
		public void setAdminId(int adminId) {
			this.adminId = adminId;
		}
		
		
		public String getAdminName() {
			return adminName;
		}
		
		
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
		
		
		public String getAdminPassword() {
			return adminPassword;
		}
		
		
		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}
		
		
		public String getAdminEmail() {
			return adminEmail;
		}
		
		
		public void setAdminEmail(String adminEmail) {
			this.adminEmail = adminEmail;
		}
		
		
		@Override
		public String toString() {
			return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
					+ ", adminEmail=" + adminEmail + "]";
		}
			
			
		
			

	
	
	
}

