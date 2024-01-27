package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumirAPI;

import java.util.Scanner;

public class Principal {

    private Scanner scanner = new Scanner(System.in);

    private ConsumirAPI consumirAPI = new ConsumirAPI();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";

    private final String API_KEY = "&apikey=3e4f916e";

    public void exibirMenu() {
        System.out.println("Digite o nome da série que você está buscando:");
        var nomeSerie = scanner.nextLine();
        var json = consumirAPI.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
    }
}
