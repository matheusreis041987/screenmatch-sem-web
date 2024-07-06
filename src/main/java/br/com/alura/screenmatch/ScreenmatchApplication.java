package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {
	// CommandLineRunner - interface de linha comando, permitindo que se crie no método pirncipal algumas chamadas
	//Ela permite que executemos alguma ação logo após a inicialização de nossa aplicação.

	@Override
	public void run(String... args) throws Exception {

		ConsumoApi consumoApi = new ConsumoApi();
		var json = 	consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=d4e7a0b5");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}


	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

}
