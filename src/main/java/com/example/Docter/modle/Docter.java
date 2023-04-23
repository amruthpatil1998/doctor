package com.example.Docter.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
	@Table(name = "docterApp")
	public class Docter {
//Abhishek
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int eid;
		private String name;
		private double salary;
		private String hospital_name;
		
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getHospital_name() {
			return hospital_name;
		}
		public void setHospital_name(String hospital_name) {
			this.hospital_name = hospital_name;
		}
}
