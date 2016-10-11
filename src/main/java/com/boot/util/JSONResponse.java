package com.boot.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class JSONResponse {
		public static final String SUCCESS_STATUS="Success";
		public static final String FALIURE_STATUS="Faliure";
		@JsonProperty("status_code")
		private int statueCode = 200;
		private Object data;
		private String status = SUCCESS_STATUS;
		private String message="";
		public int getStatueCode() {
			return statueCode;
		}
		public void setStatueCode(int statueCode) {
			this.statueCode = statueCode;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		
}
