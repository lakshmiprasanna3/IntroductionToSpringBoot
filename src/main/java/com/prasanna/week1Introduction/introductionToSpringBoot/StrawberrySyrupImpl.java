package com.prasanna.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(name = "bake.syrup",havingValue = "strawberry")
@Service
public class StrawberrySyrupImpl implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println(" Strawberry Syrup Type");
    }
}
