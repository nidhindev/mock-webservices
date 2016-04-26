# Start
## ..\mock-ws\mvn spring-boot:run

wsdl location: http://localhost:8089/ws/airports.wsdl

# Sample request

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:gs="http://www.test.com">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getCountryRequest>
         <gs:name>India</gs:name>
      </gs:getCountryRequest>
   </soapenv:Body>
</soapenv:Envelope>

# Below countries can be used
## India
## France
## Germany
