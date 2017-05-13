//package com.th.kingpower.bw.connection.config;
//
//import org.hibernate.internal.util.config.ConfigurationException;
//
//import com.th.kingpower.bw.connection.beans.ConnectionBean;
//
///**
// * @author torgan.p 12 พ.ค. 2560 10:28:49
// *
// */
//public class ConnectionManager {
//    
//    public static ConnectionBean getBWConfig(){
//	      
//        ConnectionBean bw = new ConnectionBean();
//        try {
//
//            
//            bw.setConnectUserName(conf.getString("AS400.username").trim());
//            bw.setConnectPassWord(EncriptionPassword.decrypt(conf.getString("AS400.password")));
//            bw.setConnectUrl(conf.getString("AS400.url").trim());
//            bw.setConnectDriver(conf.getString("AS400.driver").trim());
//            
//        } catch (ConfigurationException ex) {
//            System.out.println(ex.getMessage());
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    return bw;
//    }
//
//}
