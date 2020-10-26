package br.cvo.alefecvo.core;

import io.restassured.http.ContentType;

public interface Constants {
	String APP_BASE_URL = "https://petstore.swagger.io";
	Integer APP_PORT = 443; //HTTP -> 80
	String APP_BASE_PATH = "/v2";
		
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 10000L;
}
