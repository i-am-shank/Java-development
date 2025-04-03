package com.iamshank.project01payments.Controller;

import com.iamshank.project01payments.DTO.PaymentRequest;
import com.iamshank.project01payments.DTO.PaymentResponse;
import com.iamshank.project01payments.Entity.ResponseEntity;
import com.iamshank.project01payments.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Autowired
    ResponseEntity responseEntity;

    @GetMapping("/{id}")
    public ResponseEntity getPaymentForId(@PathVariable long id) {
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setPaymentId(id);

        PaymentResponse paymentResponse = paymentService.getPaymentDetails(paymentRequest);
        if(paymentResponse == null) {
            return responseEntity.notFoundError(paymentResponse);
        }
        return responseEntity.ok(paymentResponse);
    }
}
