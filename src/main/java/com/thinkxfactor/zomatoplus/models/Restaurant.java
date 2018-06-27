package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurant_table")

	public class Restaurant {
		@Id
		@GeneratedValue
		@Column(name="restaurant_id")
		private Long id;
		@Column(name="city")
	private String city;
		@Column(name="name")
		private String name;
		
		@Column(name="address")
		private String address;
		
		@Column(name="contact")
		private String contact;
		
		@Column(name="description")
		private String description;
		
		@Column(name="website")
		private String website;
		@Column(name="like_count")
		private String like_count;
		Restaurant(){}
		/*public Restaurant(Long id, String city, String name, String address, String contact, String description,
				String website, String like_count) {
			super();
			this.id = id;
			this.city = city;
			this.name = name;
			this.address = address;
			this.contact = contact;
			this.description = description;
			this.website = website;
			this.like_count = like_count;
		}*/
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		public String getLike_count() {
			return like_count;
		}
		public void setLike_count(String like_count) {
			this.like_count = like_count;
		}
		
}