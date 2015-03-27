package com.github.dispader.example.jaxws

import com.cdyne.ws.weatherws.*

import spock.lang.Specification

class GetCityForecastByZIPSpecification extends Specification {
    
    def 'should be able to obtain current weather for 55405 ZIP code'() {
        given:
            Weather service = new Weather()
            WeatherSoap weatherSoap = service.getWeatherSoap()
        when:
            WeatherReturn response = weatherSoap.getCityWeatherByZIP('55405')
        then:
            response.getCity() == 'Minneapolis'
            response.getTemperature() != null
    }
}
