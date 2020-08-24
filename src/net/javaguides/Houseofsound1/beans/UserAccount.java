package net.javaguides.Houseofsound1.beans;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class UserAccount {
	public static final String GENDER_MALE ="M";
	   public static final String GENDER_FEMALE = "F";
	    
	   private String userName;
	   private String gender;
	   private String password;
	   private String credentials; /*Added by Nathan*/
	    
	 
	   public UserAccount() {
	        
	   }
	    
	   public String getUserName() {
	       return userName;
	   }
	 
	   public void setUserName(String userName) {
	       this.userName = userName;
	   }
	 
	   public String getGender() {
	       return gender;
	   }
	 
	   public void setGender(String gender) {
	       this.gender = gender;
	   }
	 
	   public String getPassword() {
	       return password;
	   }
	 
	   public void setPassword(String password) {
	       this.password = password;
	   }

   /*Added by Nathan*/
   /*Getter and Setter for Credentials*/
		public String getCredentials() {
			return credentials;
		}
	
		public void setCredentials(String credentials) {
			this.credentials = credentials;
		}
	   
	   
}
