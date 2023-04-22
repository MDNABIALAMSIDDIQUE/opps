package com.database.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("menu")
public class MenuitemPrice {
		@Value("${menu.dosarate}")
		private float dosarate;
		
		@Value("${menu.biryanirate}")
		private float biryanirate;
		
		@Value("${menu.water}")
		private float water;
		
		@Value("${menu.puri}")
		private float puri;
		
		
		
		public float getDosarate() {
			return dosarate;
		}



		public void setDosarate(float dosarate) {
			this.dosarate = dosarate;
		}



		public float getBiryanirate() {
			return biryanirate;
		}



		public void setBiryanirate(float biryanirate) {
			this.biryanirate = biryanirate;
		}



		public float getWater() {
			return water;
		}



		public void setWater(float water) {
			this.water = water;
		}



		public float getPuri() {
			return puri;
		}



		public void setPuri(float puri) {
			this.puri = puri;
		}



		@Override
		public String toString() {
			return "MenuitemPrice [dosarate=" + dosarate + ", biryanirate=" + biryanirate + ", water=" + water
					+ ", puri=" + puri + "]";
		}
		
		
	
}
