package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Caminho do arquivo");
		
		String path = sc.next();
		
		
		List<Produto> list = new ArrayList<Produto>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			//Leitura Inicial
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				String[] vect = line.split(",");
				String descricao = vect[0];
				String cod = vect[1];
			    String unidMedida = vect[2];
			    String quantidade = vect[3];
				
				Produto produto = new Produto(descricao, cod, unidMedida, quantidade);
				list.add(produto);
				
				line = br.readLine();
			}
			
			System.out.println("Produtos:");
				for (Produto p: list) {
					System.out.println(p);
					
				}
		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
	}

}
