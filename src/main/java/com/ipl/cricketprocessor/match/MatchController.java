package com.ipl.cricketprocessor.match;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.cricketprocessor.deliveries.Delivery;
import com.ipl.cricketprocessor.deliveries.DeliveryRepository;

@RestController
public class MatchController {

	@Autowired
	private MatchService matchService;

	@Autowired
	private DeliveryRepository deliveryRepository;

//	@GetMapping("/match")
//	public void getMatch() {
//		Match match =new Match();
//		match.setId(UUID.randomUUID().toString());
//		match.setCity("Banglore");
//		match.setPlayerOfMatch("Kohli");
//		match.setTeam1("RCB");
//		match.setTeam1_id("100");
//		match.setTeam2("KKR");
//		match.setTossDecision("bat");
//		//match.setTossDecision("Bat");
//		match.setTossWinner("KKR");
//		match.setWinner("KKR");
//		match.setUmpire1("Asad Rauf");
//		match.setUmpire2("Billy  Bowden");
//		match.setVenue("Chiinnaswamy Stadium");
//		matchRepository.save(match);
//	
//	}
//	
//	@GetMapping("/getmatch")
//	public List<Match> getMatches(){
//		return matchRepository.findAll();
//	}

	@GetMapping("/match")
	public List<Match> getMatches() {

		return matchService.getAllMatches();

	}
	
	  @GetMapping("/match/{match_id}") 
	  public List<Delivery> getDeliveries(@PathVariable int match_id){ 
		  
		  return deliveryRepository.findDeliveriesByID(match_id); 
		  }
	 
//	  @GetMapping("/deliveries") 
//	  public List<Delivery> getDeliveries_all(){
//	  
//	  return deliveryRepository.findAll();
//	  
//	  }
	 

}
