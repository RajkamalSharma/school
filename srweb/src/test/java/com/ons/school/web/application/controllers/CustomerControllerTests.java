package com.ons.school.web.application.controllers;


import com.ons.school.common.vo.Customer;
import com.ons.school.data.couchbase.repository.CustomerSBRepository;
import com.ons.school.web.application.SrwebApplication;
import com.ons.school.web.application.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(value=CustomerController.class , secure = false)
@Import(SrwebApplication.class)
public class CustomerControllerTests {

    @Autowired
    private MockMvc mockMvc;


    @Mock
    private CustomerSBRepository customerSBRepository;


    @Mock
    private CustomerService customerService;

    Customer mockCustomer = new Customer("qwerty123","Sapient",
            "Sector 21 Gurgaon" , 100000);

    @Test
    public void retrieveCustomerDetails() throws Exception{

        Mockito.doReturn(mockCustomer).when(customerService).getCustomer(Mockito.anyString());

/*
        RequestBuilder getCustomerRequest
         =MockMvcRequestBuilders.get("/customer").accept(MediaType.APPLICATION_JSON);
*/

  //      MvcResult result = mockMvc.perform(getCustomerRequest).andReturn();

   //     System.out.println(result.getResponse());

        String expected = "{\"customerId\":\"qwerty123\",\"customerName\":\"Sapient\",\"customerAddress\":\"Sector 21 Gurgaon\",\"customerAvgRevenuePerAnnum\":100000}";


    //    JSONAssert.assertEquals(mockCustomer, customerService.getCustomer("123"), false);
    }


}
