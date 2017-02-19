package awesley.samples.SpringBootJAXRS;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.results.ResultMatchers;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootJaxrsApplication.class)
public class GreetingControllerTest {

	@Test
	public void test() throws Exception {
		/*MockMvc testClient = MockMvcBuilders.standaloneSetup(new GreetingController()).build(); 
		testClient.perform(get("/greeting"))
				.andExpect(status().isOk());*/
	}

}
