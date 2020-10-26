package br.cvo.alefecvo.tests;

import org.junit.Test;
import br.cvo.alefecvo.core.BaseTest;
import br.cvo.alefecvo.dto.UserDto;
import static io.restassured.RestAssured.*;

public class UserTest extends BaseTest{

	//Deve validar campos obrigatórios na movimentação (POST /user)
	@Test
	public void deveCriarNovoUsuario() {			
		//Definindo a estrutura do teste
		UserDto userDto = new UserDto();
		userDto.id = 1;
		userDto.username = "teste123";
		userDto.firstName = "Teste";
		userDto.lastName = "123";
		userDto.email = "teste@teste";
		userDto.password = "123456";
		userDto.phone = "31999999999";
		userDto.userStatus = 1;
		
		//Criando estrutura 
		given()
			.body(userDto)
		.when()
			.post("/user")
		.then()
			.statusCode(200)
			;
		}
}