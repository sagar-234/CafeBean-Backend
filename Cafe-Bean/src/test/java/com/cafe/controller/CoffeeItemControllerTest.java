package com.cafe.controller;

import static org.mockito.Mockito.doNothing;

import com.cafe.entity.Coffee;
import com.cafe.service.CoffeeItemService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CoffeeItemController.class})
@ExtendWith(SpringExtension.class)
class CoffeeItemControllerTest {
    @Autowired
    private CoffeeItemController coffeeItemController;

    @MockBean
    private CoffeeItemService coffeeItemService;

    /**
     * Method under test: {@link CoffeeItemController#addCoffee(Long, Coffee)}
     */
    @Test
    void testAddCoffee() throws Exception {
        doNothing().when(coffeeItemService).addCoffee(Mockito.<Long>any(), Mockito.<Coffee>any());

        Coffee coffee = new Coffee();
        coffee.setCoffee_id(1L);
        coffee.setCoffee_type("Coffee type");
        coffee.setPrice(1L);
        String content = (new ObjectMapper()).writeValueAsString(coffee);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/CoffeeItem-rest/addCoffee/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(coffeeItemController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

