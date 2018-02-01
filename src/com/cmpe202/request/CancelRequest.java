package com.cmpe202.request;

import com.cmpe202.ride.Ride;

public class CancelRequest implements RequestStateInterface {

	private Request request;

	public CancelRequest(Request r) {
		request = r;
	}

	public String receiveRequest(String memberId, String requestType,
			String ridetype, String pickuploc, String dropoffloc,
			String vehicletype, String pickuptime, int noofseats) {
		return "The request is cancelled";
	}

	public String receiveRequest(String memberId, String requestType) {
		return "The request is cancelled";
	}

	public String processRequest(String requestType) {
		return "The request is cancelled";
	}

	public String concludeRequest() {
		return "The request is cancelled";
	}

	public String cancelRequest() {
		request.setRequestState(new InitiateRequest(request));
		return "The request has been cancelled";
	}

}