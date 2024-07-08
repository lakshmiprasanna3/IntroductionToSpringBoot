package com.prasanna.week1Introduction.introductionToSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class ChocolateSyrupImpl implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup Type");
    }
}
