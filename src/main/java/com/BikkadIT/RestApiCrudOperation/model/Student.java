package com.BikkadIT.RestApiCrudOperation.model;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")

	public class Student {

		@Id
		@Column(name="Student_id")
		private int sid;

		@Column(name="Student_name")
		private String sname;

		@Column(name="Student_age")
		private int sage;

		@Column(name="Student_rank")
		private int srank;
		
		@Column(name="Student_email")
		private String semail;

		
		
		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public int getSage() {
			return sage;
		}

		public void setSage(int sage) {
			this.sage = sage;
		}

		public int getSrank() {
			return srank;
		}

		public void setSrank(int srank) {
			this.srank = srank;
		}

		public String getSemail() {
			return semail;
		}

		public void setSemail(String semail) {
			this.semail = semail;
		}

		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", srank=" + srank + ", semail=" + semail
					+ "]";
		}

}
