package com.iamshank.project01payments.Service;

import com.iamshank.project01payments.DTO.PaymentRequest;
import com.iamshank.project01payments.DTO.PaymentResponse;
import com.iamshank.project01payments.Entity.PaymentEntity;
import com.iamshank.project01payments.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public PaymentResponse getPaymentDetails(PaymentRequest requestObj) {
        PaymentEntity paymentEntity = paymentRepository.getPaymentById(requestObj);
        PaymentResponse paymentResponse = null;
        if(paymentEntity != null) {
            paymentResponse = getResponseForPaymentEntity(paymentEntity);
        }
        return paymentResponse;
    }

    private PaymentResponse getResponseForPaymentEntity(PaymentEntity paymentEntity) {
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentId(paymentEntity.getId());
        paymentResponse.setAmount(paymentEntity.getPaymentAmount());
        paymentResponse.setCurrency(paymentEntity.getPaymentCurrency());
        paymentResponse.setDescription(paymentEntity.getDescription());
        return paymentResponse;
    }
}
