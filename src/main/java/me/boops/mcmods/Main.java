package me.boops.mcmods;

import me.boops.mcmods.paths.Base;
import me.boops.mcmods.paths.account.AccountCreate;
import spark.Spark;

public class Main {
	
	public static void main(String[] args) {
		
		// Spark setup
		Spark.ipAddress("127.0.0.1");
		Spark.port(8080);
		
		// Base call
		Spark.get("/", (request, response) -> new Base().basePath(request));
		
		// Account calls
		Spark.post("/account/create", (request, response) -> new AccountCreate().create(request));
		
	}
}
