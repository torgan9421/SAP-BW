package com.th.kingpower.bw.configuration;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.th.kingpower.bw.repository.base.BaseRepository;
import com.th.kingpower.bw.service.interfaces.IPopulateService;
import com.th.kingpower.sql.constants.ConstantsSql;


@SpringBootApplication
@EnableScheduling
@ComponentScan( basePackages={"com.th.kingpower.bw"} )
public class Application  implements CommandLineRunner{
    @Autowired
    public  IPopulateService populateService;

    
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);

    }
    
//   second, minute, hour, every day,every month,every year
//    @Scheduled(cron = "0 15 10 * * ?")
//    @Scheduled(cron = "*/2 * * * * ?")
//    public void batch() throws SQLException{
////	 airlineService.importAirline();
//	 
//	
//	 airlineService.gettAirline();
//
//    }
    
 
  public void run(String... args) {
      Boolean result = null;
      long startTime = System.currentTimeMillis();
      
//      result = populateService.importAirline(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importCompany(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importLocation(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importLocation(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importArea(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importSite(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importCategories(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importSection(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importSubSection(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importBrand(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importCustomerTypeGroup(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importCustomerType(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importGender(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importCountry(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importCity(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importTourAgent(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importPickupCounter(ConstantsSql.SQL_TABLE_DATA_BW);
//      result = populateService.importFlight(ConstantsSql.SQL_TABLE_DATA_BW);
      result = populateService.importMember(ConstantsSql.SQL_TABLE_DATA_BW);
      
      
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("time 1 : "+totalTime);
      
      
      System.out.println(result);
      
      
      
      
      
      
      
//      airlineService.insertAirline(ConstantsSql.SQL_TABLE_AIRLINE_PZDC_FL_I);
//	long startTime = System.currentTimeMillis();
//	 Boolean result = airlineService.insertAirline(ConstantsSql.SQL_TABLE_DAT_BW);
//	long endTime   = System.currentTimeMillis();
//	long totalTime = endTime - startTime;
//	System.out.println("time 1 : "+totalTime);
     
//      System.out.println(result);
//      airlineService.saveAirline();
      
//	long startTime1 = System.currentTimeMillis();
//	airlineService.testMap(ConstantsSql.SQL_TABLE_DAT_BW);
//	long endTime1   = System.currentTimeMillis();
//	long totalTime1 = endTime1 - startTime1;
//	System.out.println("time 2 : "+totalTime1);
//      
//      System.out.println(result);
  }

}




