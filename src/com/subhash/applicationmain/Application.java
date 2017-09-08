package com.subhash.applicationmain;
import consuming_web_service_client.CountriesPort;
import consuming_web_service_client.CountriesPortService;
import consuming_web_service_client.GetCountryRequest;
import consuming_web_service_client.GetCountryResponse;
public class Application {
	public static void main(String[] args) {
		CountriesPortService context = new CountriesPortService();
		CountriesPort client =  context.getCountriesPortSoap11();
		GetCountryRequest getCountryRequest = new GetCountryRequest();
		GetCountryResponse GetCountryResponse = new GetCountryResponse();
		getCountryRequest.setName("Spain");
		GetCountryResponse = client.getCountry(getCountryRequest);
		System.out.println("=====>"+GetCountryResponse.getCountry().getName());
		System.out.println("=====>"+GetCountryResponse.getCountry().getCapital());
		System.out.println("=====>"+GetCountryResponse.getCountry().getCurrency());
		System.out.println("=====>"+GetCountryResponse.getCountry().getPopulation());
	}

}
