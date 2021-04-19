package model.service;

public interface OnlinePaymentService {

	Double paymentFree(Double amount);
	Double interest(Double amount, Integer months);
}