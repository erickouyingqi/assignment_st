package com.singtel.animalObjectOriental.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.singtel.animalObjectOriental.animal.Dog;
import com.singtel.animalObjectOriental.animal.Dolphin;
import com.singtel.animalObjectOriental.animal.Duck;
import com.singtel.animalObjectOriental.animal.IAnimal;
import com.singtel.animalObjectOriental.service.ISearchAnimalService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(controllers = SearchAnimalController.class)
public class SearchAnimalControllerMocServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ISearchAnimalService queryAnimalService;

    Duck duck;
    List<IAnimal> animalList;

    @Before
    public void setupAnimal() {
        duck = new Duck();
        duck.setAnimalName("duck");
    }

    @Before
    public void setupAnimalListExpected() {
        animalList = new ArrayList<IAnimal>();
        animalList.add(new Dog());
        animalList.add(new Dolphin());
    }

    @Test
    public void queryAnimalByNameMockTest() throws Exception {
        String expectedJson = converToJson(duck);
        when(queryAnimalService.queryAnimalByName(Mockito.anyString())).thenReturn(duck);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/queryAnimal").param("animalName", "duck").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson))
                .andExpect(jsonPath("$.animalName").value("duck"))
                .andReturn();
        result.getResponse().getContentAsString();

    }

    @Test
    public void getAllAnimalsListMockTest() throws Exception {
        String expectedJson = converToJson(animalList);
        when(queryAnimalService.getAllAnimals()).thenReturn(animalList);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/getAllAnimalList").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson))
                .andReturn();
    }

    private String converToJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);


    }
}