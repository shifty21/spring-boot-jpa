package com.boot.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ambulancedim")
public class Ambulance {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "ambulance_id")
		private int ambulanceId;
		
		@Column(name = "ambulance_name")
		private String ambulanceName;
		
		private String address;
		
		private String contact1;
		
		private String contact2;
		
		private String contact3;
		
		@ManyToOne
		@JoinColumn(name = "city_id")
		private City citydim;
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "created_date")
		private Date createdDate;
		
		private String createdBy;

		public int getAmbulanceId() {
			return ambulanceId;
		}

		public void setAmbulanceId(int ambulanceId) {
			this.ambulanceId = ambulanceId;
		}

		public String getAmbulanceName() {
			return ambulanceName;
		}

		public void setAmbulanceName(String ambulanceName) {
			this.ambulanceName = ambulanceName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getContact1() {
			return contact1;
		}

		public void setContact1(String contact1) {
			this.contact1 = contact1;
		}

		public String getContact2() {
			return contact2;
		}

		public void setContact2(String contact2) {
			this.contact2 = contact2;
		}

		public String getContact3() {
			return contact3;
		}

		public void setContact3(String contact3) {
			this.contact3 = contact3;
		}

		public Date getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public City getCitydim() {
			return citydim;
		}

		public void setCitydim(City citydim) {
			this.citydim = citydim;
		}
}
