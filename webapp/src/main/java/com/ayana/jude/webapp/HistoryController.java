package com.ayana.jude.webapp;

import com.ayana.jude.model.Location;
import com.ayana.jude.model.Weather;
import com.ayana.jude.persist.LocationDAO;
import com.ayana.jude.persist.WeatherDAO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoryController implements Controller {

	private LocationDAO locationDAO;
	private WeatherDAO weatherDAO;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String zip = request.getParameter("zip");
		Location location = locationDAO.findByZip(zip);
		List<Weather> weathers = weatherDAO.recentForLocation( location );
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put( "location", location );
		model.put( "weathers", weathers );
		
		return new ModelAndView("history", model);
	}

	public WeatherDAO getWeatherDAO() {
		return weatherDAO;
	}

	public void setWeatherDAO(WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}

	public LocationDAO getLocationDAO() {
		return locationDAO;
	}

	public void setLocationDAO(LocationDAO locationDAO) {
		this.locationDAO = locationDAO;
	}
}