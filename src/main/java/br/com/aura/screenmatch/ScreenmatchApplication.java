package br.com.aura.screenmatch;

import br.com.aura.screenmatch.model.DadosSerie;
import br.com.aura.screenmatch.service.ConsumoApi;
import br.com.aura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoapi = new ConsumoApi();
		var json = consumoapi.obterDados("https://www.omdbapi.com/?t=lost&apikey=ed83a12c");
		System.out.println(json);
		//parte 2
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
