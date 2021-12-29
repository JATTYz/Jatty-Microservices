package com.jaturon.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudService {
    private FraudRepository fraudRepository;

    public boolean isFraudulentCustomer(Integer customerId){
        fraudRepository.save(
                FraudCheckHistory.builder()
                                 .customerId(customerId)
                                 .isFraudster(false)
                                 .createAt(LocalDateTime.now())
                                 .build()
        );
        return false;
    }
}
