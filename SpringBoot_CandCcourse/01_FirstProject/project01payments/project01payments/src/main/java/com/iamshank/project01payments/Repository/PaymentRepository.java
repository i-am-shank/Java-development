package com.iamshank.project01payments.Repository;

import com.iamshank.project01payments.DTO.PaymentRequest;
import com.iamshank.project01payments.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public PaymentEntity getPaymentById(PaymentRequest request) {
        PaymentEntity paymentEntity = executeQuery(request);
        return paymentEntity;
    }

    private PaymentEntity executeQuery(PaymentRequest request) {
//        connect with DB & fetch corresponding data .. here doing dummy-db stuff
        PaymentEntity paymentEntity = null;
        long id = request.getPaymentId();
        if(id < 10000) {
            paymentEntity = new PaymentEntity();
            paymentEntity.setId(request.getPaymentId());
            paymentEntity.setPaymentCurrency("INR");
            paymentEntity.setPaymentAmount(69999.00);
            paymentEntity.setDescription("Bill paid for Roland f30x Digital Piano");
        }
        return paymentEntity;
    }
}
