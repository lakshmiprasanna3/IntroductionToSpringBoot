package com.prasanna.week1Introduction.introductionToSpringBoot;

import org.springframework.stereotype.Service;

@Service
public class StrawberryFrostingImpl implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Strawberry Frosting Type");
    }
}
