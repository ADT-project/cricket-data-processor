package io.javabrains.betterreads.search;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

import io.javabrains.betterreads.match.MatchRepository;
import reactor.core.publisher.Mono;

@Controller
public class SearchController {

    private final String COVER_IMAGE_ROOT = "http://covers.openlibrary.org/b/id/";

    private final WebClient webClient;
	@Autowired
	private MatchRepository matchRepository;

    public SearchController(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.exchangeStrategies(ExchangeStrategies.builder()
        .codecs(configurer -> configurer
                  .defaultCodecs()
                  .maxInMemorySize(16 * 1024 * 1024))
                .build()).baseUrl("http://openlibrary.org/search.json").build();
    }

    @GetMapping(value = "/search")
    public String getSearchResults(Model model) {
    	        List<io.javabrains.betterreads.match.Match> matches = matchRepository.findAll();
            
        model.addAttribute("searchResults", matches);

        return "search";
    }
    
}
