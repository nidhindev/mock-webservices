package com.vc.webservice.repository;

import com.test.GetCountryResponse;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by x074823 on 4/25/2016.
 */
@Component
public class CountryRepository {
    private static final List<GetCountryResponse> countries = new ArrayList<>();

    @PostConstruct
    public void initData() {
        GetCountryResponse india = new GetCountryResponse();
        india.setName("India");
        india.getAirport().add("BOM");
        india.getAirport().add("COK");
        india.getAirport().add("HYD");
        countries.add(india);

        GetCountryResponse france = new GetCountryResponse();
        france.setName("France");
        france.getAirport().add("CDG");
        france.getAirport().add("ORY");
        france.getAirport().add("NCE");
        countries.add(france);

        GetCountryResponse gernmany = new GetCountryResponse();
        gernmany.setName("Germany");
        gernmany.getAirport().add("CLN");
        gernmany.getAirport().add("BRL");
        gernmany.getAirport().add("BRN");
        gernmany.getAirport().add("SRG");
        gernmany.getAirport().add("FRN");
        countries.add(france);
    }

    public List<String> findCountry(String name) {
        List<String> result = null;
        for (GetCountryResponse response : countries) {
            if (name.equals(response.getName())) {
                result = new ArrayList<>();
                result.addAll(response.getAirport());
            }
        }
        return result;
    }
}
