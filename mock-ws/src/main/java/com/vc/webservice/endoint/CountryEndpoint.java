package com.vc.webservice.endoint;

import com.test.GetCountryRequest;
import com.test.GetCountryResponse;
import com.vc.webservice.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Nidhin on 4/25/2016.
 */
@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://www.test.com";

    private CountryRepository countryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.getAirport().addAll(countryRepository.findCountry(request.getName()));
        return response;
    }
}
