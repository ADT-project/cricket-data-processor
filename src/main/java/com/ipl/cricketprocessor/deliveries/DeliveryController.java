package com.ipl.cricketprocessor.deliveries;

import java.util.Comparator; 
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.reactive.function.client.ExchangeStrategies;
//import org.springframework.web.reactive.function.client.WebClient;

//import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

//import com.ipl.cricketprocessor.match.MatchRepository;
//import reactor.core.publisher.Mono;

@Controller
public class DeliveryController {

	@Autowired
	private DeliveryRepository deliveryRepository;



    @GetMapping(value = "/deliveries")
    public String getdeliveryResults(@RequestParam int match_id, Model model) {
    	        List<Delivery> deliveries = deliveryRepository.findDeliveriesByID(match_id);
    	        deliveries.sort(Comparator.comparing(Delivery::getInning)
    	        		.thenComparing(Delivery::getOver)
    	        		.thenComparing(Comparator.comparing(Delivery::getBall)));
            //System.out.println("In Delivery controller"+ match_id+ "   "+deliveries.size());
        model.addAttribute("deliveryResults", deliveries);
        

        return "delivery";
    }
    
}
