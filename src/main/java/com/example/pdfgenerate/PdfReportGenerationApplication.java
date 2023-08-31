package com.example.pdfgenerate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class PdfReportGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfReportGenerationApplication.class, args);
	}

}
