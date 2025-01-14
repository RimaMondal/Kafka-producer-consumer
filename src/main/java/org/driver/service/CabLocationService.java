package org.driver.service;


import org.driver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Service
public class CabLocationService {


    @Autowired
     private KafkaTemplate<String,Object> kafkaTemplate;

     public boolean updateLocation(String location){
         kafkaTemplate.send(AppConstant.CAB_LOCATION,location);
         return  true;
     }


}
