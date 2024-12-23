package com.springboot.security;

import com.springboot.security.util.PDFGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootSecurityApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootSecurityApplication.class, args);

		PDFGenerator pDFGenerator = ac.getBean("pdfGenerator",PDFGenerator.class);

		pDFGenerator.generatePdfReport();
	}

}
