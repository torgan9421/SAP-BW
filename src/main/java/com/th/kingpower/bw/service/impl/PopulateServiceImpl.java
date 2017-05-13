package com.th.kingpower.bw.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.th.kingpower.bw.entity.Airline;
import com.th.kingpower.bw.entity.Area;
import com.th.kingpower.bw.entity.Brand;
import com.th.kingpower.bw.entity.Categories;
import com.th.kingpower.bw.entity.City;
import com.th.kingpower.bw.entity.Company;
import com.th.kingpower.bw.entity.Country;
import com.th.kingpower.bw.entity.CustomerType;
import com.th.kingpower.bw.entity.CustomerTypeGroup;
import com.th.kingpower.bw.entity.Flight;
import com.th.kingpower.bw.entity.Gender;
import com.th.kingpower.bw.entity.Location;
import com.th.kingpower.bw.entity.Member1;
import com.th.kingpower.bw.entity.PickupCounter;
import com.th.kingpower.bw.entity.Section;
import com.th.kingpower.bw.entity.Site;
import com.th.kingpower.bw.entity.SubSection;
import com.th.kingpower.bw.entity.TourAgent;
import com.th.kingpower.bw.repository.IAirlineRepository;
import com.th.kingpower.bw.repository.base.BaseRepository;
import com.th.kingpower.bw.service.interfaces.IPopulateService;
import com.th.kingpower.constants.Constants;



/**
 * @author torgan.p 8 พ.ค. 2560 00:25:32
 *
 */
@Component("populateService")
public class PopulateServiceImpl extends BaseRepository implements IPopulateService{
    final static Logger logger = LoggerFactory.getLogger(PopulateServiceImpl.class);

    @Override
    public Boolean importAirline(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Airline> airlineList = jdbcTemplate.query(sql, new RowMapper<Airline>() {
//	    try{
	    @Override
	    public Airline mapRow(ResultSet rs, int rowNum)  {
		Airline airlineTb = new Airline();
		try{
		    airlineTb.setAirlineCode(rs.getString(1));
		    airlineTb.setAirlineName(rs.getString(2));
		    airlineTb.setDestination("Dest");
		    airlineTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    airlineTb.setCreateDate(date);
		    airlineTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    airlineTb.setUpdateDate(date);
		    airlineTb.setIsDelete('N');
	      
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		}
		  return airlineTb;
	    }
	});
	airlineRepository.save(airlineList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getMessage());
	}
	return result;
    }
    
    
    
    
    @Override
    public Boolean importCompany(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Company> companyList = jdbcTemplate.query(sql, new RowMapper<Company>() {
	    @Override
	    public Company mapRow(ResultSet rs, int rowNum)  {
		Company companyTb = new Company();
		try{
		
		    companyTb.setCompanyCode(rs.getString(1));
		    companyTb.setCompanyName(rs.getString(2));
		    companyTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    companyTb.setCreateDate(date);
		    companyTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    companyTb.setUpdateDate(date);
		    companyTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return companyTb;
	    }
	});
	companyRepository.save(companyList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    @Override
    public Boolean importLocation(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Location> locationList = jdbcTemplate.query(sql, new RowMapper<Location>() {
	    @Override
	    public Location mapRow(ResultSet rs, int rowNum)  {
		Location locationTb = new Location();
		try{
		
		    locationTb.setLocationCode(rs.getString(1));
		    locationTb.setLocationName(rs.getString(2));
		    locationTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    locationTb.setCreateDate(date);
		    locationTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    locationTb.setUpdateDate(date);
		    locationTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return locationTb;
	    }
	});
	locationRepository.save(locationList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    @Override
    public Boolean importArea(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Area> areaList = jdbcTemplate.query(sql, new RowMapper<Area>() {
	    @Override
	    public Area mapRow(ResultSet rs, int rowNum)  {
		Area areaTb = new Area();
		try{
		
		    areaTb.setAreaCode(rs.getString(1));
		    areaTb.setAreaName(rs.getString(2));
		    areaTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    areaTb.setCreateDate(date);
		    areaTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    areaTb.setUpdateDate(date);
		    areaTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return areaTb;
	    }
	});
	areaRepository.save(areaList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importSite(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Site> siteList = jdbcTemplate.query(sql, new RowMapper<Site>() {
	    @Override
	    public Site mapRow(ResultSet rs, int rowNum)  {
		Site siteTb = new Site();
		try{
		
		    siteTb.setSiteCode(rs.getString(1));
		    siteTb.setSiteName(rs.getString(2));
		    siteTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    siteTb.setCreateDate(date);
		    siteTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    siteTb.setUpdateDate(date);
		    siteTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return siteTb;
	    }
	});
	siteRepository.save(siteList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    
    @Override
    public Boolean importCategories(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Categories> categoriesList = jdbcTemplate.query(sql, new RowMapper<Categories>() {
	    @Override
	    public Categories mapRow(ResultSet rs, int rowNum)  {
		Categories categoriesTb = new Categories();
		try{
		
		    categoriesTb.setCategoriesCode(rs.getString(1));
		    categoriesTb.setCategoriesName(rs.getString(2));
		    categoriesTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    categoriesTb.setCreateDate(date);
		    categoriesTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    categoriesTb.setUpdateDate(date);
		    categoriesTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return categoriesTb;
	    }
	});
	categoriesRepository.save(categoriesList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importSection(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Section> sectionList = jdbcTemplate.query(sql, new RowMapper<Section>() {
	    @Override
	    public Section mapRow(ResultSet rs, int rowNum)  {
		Section sectionTb = new Section();
		try{
		
		    sectionTb.setSectionCode(rs.getString(1));
		    sectionTb.setSectionName(rs.getString(2));
		    sectionTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    sectionTb.setCreateDate(date);
		    sectionTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    sectionTb.setUpdateDate(date);
		    sectionTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return sectionTb;
	    }
	});
	sectionRepository.save(sectionList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importSubSection(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<SubSection> subSectionList = jdbcTemplate.query(sql, new RowMapper<SubSection>() {
	    @Override
	    public SubSection mapRow(ResultSet rs, int rowNum)  {
		SubSection subSectionTb = new SubSection();
		try{
		
		    subSectionTb.setSubSectionCode(rs.getString(1));
		    subSectionTb.setSubSectionName(rs.getString(2));
		    subSectionTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    subSectionTb.setCreateDate(date);
		    subSectionTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    subSectionTb.setUpdateDate(date);
		    subSectionTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return subSectionTb;
	    }
	});
	subSectionRepository.save(subSectionList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importBrand(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Brand> brandList = jdbcTemplate.query(sql, new RowMapper<Brand>() {
	    @Override
	    public Brand mapRow(ResultSet rs, int rowNum)  {
		Brand brandtionTb = new Brand();
		try{
		
		    brandtionTb.setBrandCode(rs.getString(1));
		    brandtionTb.setBrandName(rs.getString(2));
		    brandtionTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    brandtionTb.setCreateDate(date);
		    brandtionTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    brandtionTb.setUpdateDate(date);
		    brandtionTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return brandtionTb;
	    }
	});
	brandRepository.save(brandList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importCustomerTypeGroup(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<CustomerTypeGroup> customerTypeGroupList = jdbcTemplate.query(sql, new RowMapper<CustomerTypeGroup>() {
	    @Override
	    public CustomerTypeGroup mapRow(ResultSet rs, int rowNum)  {
		CustomerTypeGroup customerTypeGroupTb = new CustomerTypeGroup();
		try{
		
		    customerTypeGroupTb.setCustomerTypeGroupCode(rs.getString(1));
		    customerTypeGroupTb.setCustomerTypeGroupName(rs.getString(2));
		    customerTypeGroupTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    customerTypeGroupTb.setCreateDate(date);
		    customerTypeGroupTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    customerTypeGroupTb.setUpdateDate(date);
		    customerTypeGroupTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return customerTypeGroupTb;
	    }
	});
	customerTypeGroupRepository.save(customerTypeGroupList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importCustomerType(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<CustomerType> customerTypeList = jdbcTemplate.query(sql, new RowMapper<CustomerType>() {
	    @Override
	    public CustomerType mapRow(ResultSet rs, int rowNum)  {
		CustomerType customerTypeTb = new CustomerType();
		try{
		
		    customerTypeTb.setCustomerTypeCode(rs.getString(1));
		    customerTypeTb.setCustomerTypeName(rs.getString(2));
		    customerTypeTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    customerTypeTb.setCreateDate(date);
		    customerTypeTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    customerTypeTb.setUpdateDate(date);
		    customerTypeTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return customerTypeTb;
	    }
	});
	customerTypeRepository.save(customerTypeList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importGender(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Gender> genderList = jdbcTemplate.query(sql, new RowMapper<Gender>() {
	    @Override
	    public Gender mapRow(ResultSet rs, int rowNum)  {
		Gender genderTb = new Gender();
		try{
		
		    genderTb.setGenderCode(rs.getString(1));
		    genderTb.setGenderName(rs.getString(2));
		    genderTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    genderTb.setCreateDate(date);
		    genderTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    genderTb.setUpdateDate(date);
		    genderTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return genderTb;
	    }
	});
	genderRepository.save(genderList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importCountry(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Country> countryList = jdbcTemplate.query(sql, new RowMapper<Country>() {
	    @Override
	    public Country mapRow(ResultSet rs, int rowNum)  {
		Country countryTb = new Country();
		try{
		
		    countryTb.setCountryCode(rs.getString(1));
		    countryTb.setCountryName(rs.getString(2));
		    countryTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    countryTb.setCreateDate(date);
		    countryTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    countryTb.setUpdateDate(date);
		    countryTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return countryTb;
	    }
	});
	countryRepository.save(countryList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importCity(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<City> cityList = jdbcTemplate.query(sql, new RowMapper<City>() {
	    @Override
	    public City mapRow(ResultSet rs, int rowNum)  {
		City cityTb = new City();
		try{
		
		    cityTb.setCityCode(rs.getString(1));
		    cityTb.setCityName(rs.getString(2));
		    cityTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    cityTb.setCreateDate(date);
		    cityTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    cityTb.setUpdateDate(date);
		    cityTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return cityTb;
	    }
	});
	cityRepository.save(cityList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importTourAgent(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<TourAgent> tourAgentList = jdbcTemplate.query(sql, new RowMapper<TourAgent>() {
	    @Override
	    public TourAgent mapRow(ResultSet rs, int rowNum)  {
		TourAgent tourAgentTb = new TourAgent();
		try{
		
		    tourAgentTb.setTourAgentCode(rs.getString(1));
		    tourAgentTb.setTourAgentName(rs.getString(2));
		    tourAgentTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    tourAgentTb.setCreateDate(date);
		    tourAgentTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    tourAgentTb.setUpdateDate(date);
		    tourAgentTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return tourAgentTb;
	    }
	});
	tourAgentRepository.save(tourAgentList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importPickupCounter(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<PickupCounter> pickupCounterList = jdbcTemplate.query(sql, new RowMapper<PickupCounter>() {
	    @Override
	    public PickupCounter mapRow(ResultSet rs, int rowNum)  {
		PickupCounter pickupCounteTb = new PickupCounter();
		try{
		
		    pickupCounteTb.setPickupCounterCode(rs.getString(1));
		    pickupCounteTb.setPickupCounterName(rs.getString(2));
		    pickupCounteTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    pickupCounteTb.setCreateDate(date);
		    pickupCounteTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    pickupCounteTb.setUpdateDate(date);
		    pickupCounteTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return pickupCounteTb;
	    }
	});
	pickupCounterRepository.save(pickupCounterList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importFlight(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Flight> flightList = jdbcTemplate.query(sql, new RowMapper<Flight>() {
	    @Override
	    public Flight mapRow(ResultSet rs, int rowNum)  {
		Flight flightTb = new Flight();
		try{
		
		    flightTb.setFlightCode(rs.getString(1));
		    flightTb.setFlightDescription(rs.getString(2));
		    flightTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    flightTb.setCreateDate(date);
		    flightTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    flightTb.setUpdateDate(date);
		    flightTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return flightTb;
	    }
	});
	flightRepository.save(flightList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    @Override
    public Boolean importMember(String sql){
	Boolean result = false;
	Date date = new Date();
	try{
	List<Member1> memberList = jdbcTemplate.query(sql, new RowMapper<Member1>() {
	    @Override
	    public Member1 mapRow(ResultSet rs, int rowNum)  {
		Member1 memberTb = new Member1();
		try{
		
		    memberTb.setMemberCode(rs.getString(1));
		    memberTb.setFullNameThai("ต่อการณ์ ภูอิ่นอ้อย");
		    memberTb.setFullNameEng("Torgan Pooinaoy");
		    memberTb.setCreateBy(Constants.SYSTEM_CIAS_BW);
		    memberTb.setCreateDate(date);
		    memberTb.setUpdateBy(Constants.SYSTEM_CIAS_BW);
		    memberTb.setUpdateDate(date);
		    memberTb.setIsDelete('N');
	       
		}catch(SQLException ex){
		    logger.error(ex.getMessage());
		    ex.printStackTrace();
		}
		 return memberTb;
	    }
	});
	memberRepository.save(memberList);
	result = true;
	}catch(Exception ex){
	    logger.error(ex.getStackTrace().toString());
	    ex.printStackTrace();
	}
	return result;
    }
    
    
//    @Override
//    public List<Airline> importAirline() {
//	List<Airline>  airlineList = (List<Airline>) airlineRepository.findAll();
//	for(Airline airline : airlineList){
//	    System.out.println(airline.getAirlineCode());
//	}
//	
//      return airlineList;
//    }
    

//    public void saveAirline() {
//	
//	try{
//	
//	Date date = new Date();
//	  Airline airlineTb = new Airline();
////	  airlineTb.setAirlineId(157l);
//          airlineTb.setAirlineCode("code1");
//          airlineTb.setAirlineName("Name1");
//          airlineTb.setDestination("Dest1");
//          airlineTb.setCreateBy("SYSTEM CIS BATCH");
//          airlineTb.setCreateDate(date);
//          airlineTb.setUpdateBy("SYSTEM CIS BATCH");
//          airlineTb.setUpdateDate(date);
//          airlineTb.setIsDelete('N');
//          airlineTb =  airlineRepository.save(airlineTb);
//	
//       
//          
//          List<Airline>  airlineList = (List<Airline>) airlineRepository.findAll();
//  	for(Airline airline : airlineList){
//  	    System.out.println(airline.getAirlineCode());
//  	}
//  	
//	}catch(Exception e){
//	    e.printStackTrace();
//	}
//    }
    
    
    

//    @Override
//    public boolean insertAirline(String sql) throws SQLException {
//	Date date = new Date();
//	
//
//	
//	boolean	result =  (boolean) jdbcTemplate.query(sql, new ResultSetExtractor<Object>() {
//	            public Object  extractData(ResultSet rs) throws SQLException, DataAccessException {
//	        	List<Airline> airlineList = new ArrayList<Airline>();
//	                while (rs.next()) {
//
//	                    Airline airlineTb = new Airline();
//	                    airlineTb.setAirlineCode(rs.getString(1));
//	                    airlineTb.setAirlineName(rs.getString(2));
//	                    airlineTb.setDestination("Dest");
//	                    airlineTb.setCreateBy("SYSTEM CIS BATCH");
//	                    airlineTb.setCreateDate(date);
//	                    airlineTb.setUpdateBy("SYSTEM CIS BATCH");
//	                    airlineTb.setUpdateDate(date);
//	                    airlineTb.setIsDelete('N');
//	                    airlineList.add(airlineTb);
//	                }
//	                airlineRepository.save(airlineList);
//	                return true;
//	            }
//	        });
//	return result;
//    
//    }
    
    
//    @Override
//    public boolean insertAirline(String sql) throws SQLException {
//	Date date = new Date();
//	boolean	result =  (boolean) jdbcTemplate.query(sql, new ResultSetExtractor<Object>() {
//	            public Object  extractData(ResultSet rs) throws SQLException, DataAccessException {
//	        	List<Airline> airlineList = new ArrayList<Airline>();
//	                while (rs.next()) {
//
//	                    Airline airlineTb = new Airline();
//	                    airlineTb.setAirlineCode(rs.getString("/BIC/ZDC_FL_AC"));
//	                    airlineTb.setAirlineName(rs.getString("/BIC/ZDC_FL_AD"));
//	                    airlineTb.setCreateBy("SYSTEM CIS BATCH");
//	                    airlineTb.setCreateDate(date);
//	                    airlineTb.setUpdateBy("SYSTEM CIS BATCH");
//	                    airlineTb.setUpdateDate(date);
//	                    airlineTb.setIsDelete('N');
//	                    airlineList.add(airlineTb);
//	                    System.out.println(rs.getString("/BIC/ZDC_FL_AC"));
//	                    System.out.println(rs.getString("/BIC/ZDC_FL_AD"));
//	                }
//	                airlineRepository.save(airlineList);
//	                return true;
//	            }
//	        });
//	return result;
    

    
//    @Override
//    public void gettAirline() throws SQLException {
//	
//	String sql = "SELECT distinct(\"/BIC/ZDC_FL_AC\"),\"/BIC/ZDC_FL_AD\" FROM \"SAPBWD\".\"/BIC/PZDC_FL_I\" WHERE \"/BIC/ZDC_FL_AD\" <> ''";
//	Date date = new Date();
//	List<String> strResult =  (List<String>) jdbcTemplate.query(sql, new ResultSetExtractor<List<String>>() {
//	            public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
//	        	List<Airline> airlineList = new ArrayList<Airline>();
//	                while (rs.next()) {
//
//	                    Airline airlineTb = new Airline();
//	                    System.out.println(rs.getString("/BIC/ZDC_FL_AC"));
//	                    System.out.println(rs.getString("/BIC/ZDC_FL_AD"));
//	                    
//	                    airlineTb.setAirlineCode(rs.getString("/BIC/ZDC_FL_AC"));
//	                    airlineTb.setAirlineName(rs.getString("/BIC/ZDC_FL_AD"));
//	                    airlineTb.setCreateBy("SYSTEM CIS BATCH");
//	                    airlineTb.setCreateDate(date);
//	                    airlineTb.setUpdateBy("SYSTEM CIS BATCH");
//	                    airlineTb.setUpdateDate(date);
//	                    airlineTb.setIsDelete('N');
//	                    airlineList.add(airlineTb);
//	                    
//	                   
//	                    
//	                }
//	                airlineRepository.save(airlineList);
//	                return new ArrayList<String>();
//	            }
//	        });
//    
//    }
    
}
