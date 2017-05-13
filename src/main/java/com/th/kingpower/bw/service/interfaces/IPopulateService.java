package com.th.kingpower.bw.service.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.th.kingpower.bw.entity.Airline;


/**
 * @author torgan.p 8 พ.ค. 2560 00:25:53
 *
 */
public interface IPopulateService {
    public Boolean importAirline(String sql);
    public Boolean importCompany(String sql);
    public Boolean importLocation(String sql);
    public Boolean importArea(String sql);
    public Boolean importSite(String sql);
    public Boolean importCategories(String sql);
    public Boolean importSection(String sql);
    public Boolean importSubSection(String sql);
    public Boolean importBrand(String sql);
    public Boolean importCustomerTypeGroup(String sql);
    public Boolean importCustomerType(String sql);
    public Boolean importGender(String sql);
    public Boolean importCountry(String sql);
    public Boolean importCity(String sql);
    public Boolean importTourAgent(String sql);
    public Boolean importPickupCounter(String sql);
    public Boolean importFlight(String sql);
    public Boolean importMember(String sql);
}
