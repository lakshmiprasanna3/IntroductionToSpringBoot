package com.prasanna.week1Introduction.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(name = "bake.frost",havingValue = "chocolate")
@Service
public class ChocolateFrostingImpl implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Chocolate Frosting Type");
    }
}
