package com.thinkxfactor.zomatoplus.models;



	public class Restaurant {
		private String rname;
		private String raddr;
		private String remail;
		private String rphone;
		public Restaurant()
		{
		}
		public Restaurant(String unm,String pwd,String email,String phn)
		{
			super();
			this.rname=unm;
			this.raddr=pwd;
			this.remail=email;
			this.rphone=phn;
		}
		public String getRname() {
			return rname;
		}
		public void setRname(String rname) {
			this.rname = rname;
		}
		public String getRaddr() {
			return raddr;
		}
		public void setRaddr(String raddr) {
			this.raddr = raddr;
		}
		public String getRemail() {
			return remail;
		}
		public void setRemail(String remail) {
			this.remail = remail;
		}
		public String getRphone() {
			return rphone;
		}
		public void setRphone(String rphone) {
			this.rphone = rphone;
		}
		
}
