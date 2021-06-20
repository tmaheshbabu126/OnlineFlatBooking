package com.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Flat{
	    @Id
	    @GeneratedValue
		private int flatId;
		private float cost;
		@OneToOne
		//(mappedBy="tenant")
		@JoinColumn(name = "houseNo")

		private FlatAdress flatAdress;
		private String avialibilty;
		
		public Flat(int flatId, float cost, FlatAdress flatAdress, String avialibilty ) {
			
			super();
			this.flatId=flatId;
			this.cost=cost;
			this.flatAdress=flatAdress;
			this.avialibilty= avialibilty;
		}
		
		

		public int getFlatId() {
			return flatId;
		}

		public void setFlatId(int flatId) {
			this.flatId = flatId;
		}

		public float getCost() {
			return cost;
		}

		public void setCost(float cost) {
			this.cost = cost;
		}

		public FlatAdress getFlatAdress() {
			return flatAdress;
		}

		public void setFlatAdress(FlatAdress flatAdress) {
			this.flatAdress = flatAdress;
		}

		public String getAvialibilty() {
			return avialibilty;
		}

		public void setAvialibilty(String avialibilty) {
			this.avialibilty = avialibilty;
		}
		
		
		

		@Override
		public String toString() {
			return "Flat [flatId=" + flatId + ", cost=" + cost + ", flatAdress=" + flatAdress + ", avialibilty="
					+ avialibilty + "]";
		}
		
		
	}


