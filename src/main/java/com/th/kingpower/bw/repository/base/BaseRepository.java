package com.th.kingpower.bw.repository.base;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.th.kingpower.bw.repository.IAirlineRepository;
import com.th.kingpower.bw.repository.IAreaRepository;
import com.th.kingpower.bw.repository.IBrandRepository;
import com.th.kingpower.bw.repository.ICategoriesRepository;
import com.th.kingpower.bw.repository.ICityRepository;
import com.th.kingpower.bw.repository.ICompanyRepository;
import com.th.kingpower.bw.repository.ICountryRepository;
import com.th.kingpower.bw.repository.ICustomerTypeGroupRepository;
import com.th.kingpower.bw.repository.ICustomerTypeRepository;
import com.th.kingpower.bw.repository.IFlightRepository;
import com.th.kingpower.bw.repository.IGenderRepository;
import com.th.kingpower.bw.repository.ILocationRepository;
import com.th.kingpower.bw.repository.IMemberRepository;
import com.th.kingpower.bw.repository.IPickupCounterRepository;
import com.th.kingpower.bw.repository.ISectionRepository;
import com.th.kingpower.bw.repository.ISiteRepository;
import com.th.kingpower.bw.repository.ISubSectionRepository;
import com.th.kingpower.bw.repository.ITourAgentRepository;

/**
 * @author torgan.p 13 พ.ค. 2560 23:14:49
 *
 */


public abstract class BaseRepository {
    @PersistenceContext
    protected EntityManager entityManager;
    @Autowired
    protected JdbcTemplate jdbcTemplate;
    
    @Autowired
    protected IAirlineRepository airlineRepository;
    @Autowired
    protected ICompanyRepository companyRepository;
    @Autowired
    protected ILocationRepository locationRepository;
    @Autowired
    protected IAreaRepository areaRepository;
    @Autowired
    protected ISiteRepository siteRepository;
    @Autowired
    protected ICategoriesRepository categoriesRepository;
    @Autowired
    protected ISectionRepository sectionRepository;
    @Autowired
    protected ISubSectionRepository subSectionRepository;
    @Autowired
    protected IBrandRepository brandRepository;
    @Autowired
    protected ICustomerTypeGroupRepository customerTypeGroupRepository;
    @Autowired
    protected ICustomerTypeRepository customerTypeRepository;
    @Autowired
    protected IGenderRepository genderRepository;
    @Autowired
    protected ICountryRepository countryRepository;
    @Autowired
    protected ICityRepository cityRepository;
    @Autowired
    protected ITourAgentRepository tourAgentRepository;
    @Autowired
    protected IPickupCounterRepository pickupCounterRepository;
    @Autowired
    protected IFlightRepository flightRepository;
    @Autowired
    protected IMemberRepository memberRepository;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
