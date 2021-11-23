package com.ipl.cricketprocessor.search;

import java.util.List; 
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

import com.ipl.cricketprocessor.match.MatchRepository;
//import com.ipl.cricketprocessor.match.Match;
import reactor.core.publisher.Mono;

@Controller
public class SearchController {

	@Autowired
	private MatchRepository matchRepository;



	@GetMapping(value = "/search")
	public String getSearchResults(@RequestParam Optional<String> year,
			@RequestParam Optional<String> team, Model model) {
             	
		List<com.ipl.cricketprocessor.match.Match> matches = matchRepository.findAll();
		if(year.isPresent()) {
			matches = matches.stream().filter(match->match.getDate().contains(year.get()))
        			.collect(Collectors.toList());
		}
		
		if(team.isPresent()) {
			matches = matches.stream().filter(match->
			match.getTeam1().contains(team.get())|| match.getTeam2().contains(team.get()))
        			.collect(Collectors.toList());
		}
		//System.out.println(team);
		model.addAttribute("searchResults", matches);

		return "search";
	}

}
