package com.mastercard.demofinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/srchResults")
public class T3SearchResultsController {

	@Autowired
	T3SearchService t3Srchservice;


	//@PostMapping(value="/searchall", produces="application/json")

	//public  ResponseEntity<List<T3SearchResults>> putT3SrchResultsAll() {

		//return (ResponseEntity<List<T3SearchResults>>) t3Srchservice.putT3SrchResultsAll();
	//}

	//@PostMapping("/searchbyname/{name}")

	//public  T3SearchResults putT3SrchResults(@PathVariable String name) {

		//return t3Srchservice.putT3SrchResults(name);
	//}

	@GetMapping("/getall")

	public List<T3SearchResults> getT3SearchResultsAll() {


		
		return t3Srchservice.getT3SearchResultsAll();
	}

	@GetMapping("/getbyname/{name}")

	public T3SearchResults getT3SearchResults(@PathVariable String name) {

		return t3Srchservice.getT3SearchResults(name);
	}

}
