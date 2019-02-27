package co.ConsumeApiLab.ConsumeLab;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {
	// If you don't need the User-Agent hack, all you need is this.
	private RestTemplate restTemplate = new RestTemplate();

	private RestTemplate restTemplateWithUserAgent;

	// This is an instance initialization block. It runs when a new instance of the
	// class is created--right before the constructor.
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP request. Some of the APIs in this demo have a bug where
		// User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	public List<Tiny> findTiny(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		TinyResponse response = restTemplateWithUserAgent.getForObject(url, TinyResponse.class);
		return response.getTiny();
	}
	public List<Complete> findComplete(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		CompleteResponse response = restTemplateWithUserAgent.getForObject(url, CompleteResponse.class);
		return response.getComplete();
	}
	
//	public String findWit() {
//		String url = "https://api.whatdoestrumpthink.com/api/v1/quotes";
//		WitResponse response = restTemplateWithUserAgent.getForObject(url, WitResponse.class);
//		return response.getQuote();
//	}
	
}
