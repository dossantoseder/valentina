package br.com.saints.erp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProviderController {
	@RequestMapping("/provider")
	public String product() {
		return "provider";
	}

}
