package com.th.kingpower.sql.constants;

/**
 * @author torgan.p 13 พ.ค. 2560 14:16:16
 *
 */
public class ConstantsSql {
    
    
    
    public static final String SQL_TABLE_DATA_BW = "SELECT DATA_CODE,DATA_DESC FROM [miascmt].[DATA_BW]";

    

    public static final String SQL_TABLE_AIRLINE_PZDC_FL_I = "SELECT distinct(\"/BIC/ZDC_FL_AC\"),\"/BIC/ZDC_FL_AD\" FROM \"SAPBWD\".\"/BIC/PZDC_FL_I\" "
    	+ "WHERE \"/BIC/ZDC_FL_AD\" <> '' AND \"/BIC/ZDC_FL_AC\" <> ''";
    
  
}
