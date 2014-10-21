package com.usell.platform.payments.paypal;

import java.util.Date;

public interface PayPalAdaptivePaymentFacade {

	PayPalCustomerPaymentDetails pay(String senderEmail, String recieverEmail, String amount, String preApprovalKey,String restrictedPreApprovalKey, Integer orderItemId, Boolean isReissue) throws NeedsPreApprovalException;

	PayPalPreApprovalResponse preapproval(String senderEmail, Date startDate, Date endDate, Double maxTotalPayment, String cancelUrl, String returnUrl, boolean isRestricted);

	void updatePaypalAdaptivePaymentStatus(String paymentExecStatus, String transactionId, String transactionStatus, String senderTransactionId, String senderTransactionStatus, Integer orderItemId);
	
}