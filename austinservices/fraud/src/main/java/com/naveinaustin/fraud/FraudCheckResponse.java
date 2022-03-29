package com.naveinaustin.fraud;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FraudCheckResponse {
    private boolean isFraudster;
}
