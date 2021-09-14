package com.cfp.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class Categorias {
	
	@RequestMapping ( method = RequestMethod . GET )
	public  String  listar () {
		return  " REST esta funcionado " ;

}
}