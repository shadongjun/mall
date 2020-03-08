package com.hc.mall.service;

import com.hc.mall.dao.DemoDao;
import com.hc.mall.dto.DemoRequestDto;
import com.hc.mall.dto.DemoResponseDto;
import com.hc.mall.entity.HcCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    @Autowired
    DemoDao demoDao;

    public List<DemoResponseDto> demo(DemoRequestDto demoRequestDto){
        List<HcCustomer> customers = demoDao.getcustlist();

        List<DemoResponseDto> responseDtos = new ArrayList<>();
        for (HcCustomer customer : customers) {
            DemoResponseDto demoResponseDto = new DemoResponseDto();
            demoResponseDto.setCust_id(customer.getCust_id());
            demoResponseDto.setCust_name(customer.getCust_name());
            responseDtos.add(demoResponseDto);
        }
        return responseDtos;
    }

}
