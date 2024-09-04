package com.example.nativedemo;

import com.fazecast.jSerialComm.SerialPort;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class NativeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NativeDemoApplication.class, args);
	}


	@PostConstruct
	public void init() {
		SerialPort[] commPorts = SerialPort.getCommPorts();
		log.info("All SerialPort:{}",commPorts);
	}

}
