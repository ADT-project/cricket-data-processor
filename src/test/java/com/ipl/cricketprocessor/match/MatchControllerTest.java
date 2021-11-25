package com.ipl.cricketprocessor.match;

import com.ipl.cricketprocessor.deliveries.DeliveryRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class MatchControllerTest {

    @Mock
    private DeliveryRepository deliveryRepository;
    @InjectMocks
    private MatchController matchController;
    private MockMvc mockMvc;


    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(matchController).build();
    }

    @DisplayName("when getSearchResults integration is tested")//integration test
    @Test
    public void getDeliveries() throws Exception {
        /* given */
        Mockito.when(deliveryRepository.findDeliveriesByID(1234))
                .thenReturn(new ArrayList<>());
        /* when */
        mockMvc.perform(get("/match/1234")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
        /* then */
        Mockito.verify(deliveryRepository, Mockito.times(1))
                .findDeliveriesByID(Mockito.any());
    }

    @Test
    public void getMatches() {
    }
}