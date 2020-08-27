package com.sc.ratelimitter;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.sc.ratelimitter.controller.CustomerController;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
class RatelimitterApplicationTests {

	@Autowired
	private MockMvc mvc;
	@MockBean
	private CustomerController customerController;

	@Test
	void getAllCustomers() throws Exception {
		for (int i = 0; i < 8; i++) {
			if (i > 5) {
				mvc.perform(get("http://localhost:8080/customer/" + "all").contentType("application/json"))
						.andExpect(status().isTooManyRequests());
				System.out.println("API response throttled");
			} else {
				mvc.perform(get("http://localhost:8080/customer/" + "all").contentType("application/json"))
						.andExpect(status().isOk());
			}

		}

	}

}
