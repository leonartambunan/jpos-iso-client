package id.nio.iso;

import org.jpos.q2.Q2;
import org.jpos.q2.iso.QMUX;
import org.jpos.util.NameRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CbsSimulator {

	public static void main(String[] args) {
        Q2 q2 = new Q2();
        q2.start();
        SpringApplication.run(CbsSimulator.class, args);
	}


	@Bean
	public QMUX qmux() throws Exception {
        return NameRegistrar.get("mux.bank.mux");
    }
}
