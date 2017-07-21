/**
 * 
 */
package com.phillip.services.notification.parser;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.phillip.services.notification.models.HornetQMessage;

/**
 * @author Bui Dang Khoa
 * 
 */
public class MessageObjectParser {

	/**
	 * Parsing HornetQ text message to JSON String
	 * 
	 * @param message
	 * @return
	 */
	public static HornetQMessage parseHornetQMessage(String message) {
		HornetQMessage messageObj = new HornetQMessage();
		String[] keyPairs = message.split(",");
		if(null != keyPairs) {
			for(int i = 0; i< keyPairs.length; i ++) {
				String keyPair = keyPairs[i];
				if(null != keyPair) {
					String [] values = keyPair.split("=");
					if(null != values && values.length == 2) {
						String key = values[0].trim();
						String value = values[1].trim();
						
						if (key.equalsIgnoreCase("title")) {
							messageObj.setTitle(value);
						}
						else if (key.equalsIgnoreCase("appToken")) {
							messageObj.setAppToken(value);
						}
						else if (key.equalsIgnoreCase("appType")) {
							messageObj.setAppType(value);
						}
						else if (key.equalsIgnoreCase("collapseKey")) {
							messageObj.setCollapseKey(value);
						}
						else if (key.equalsIgnoreCase("message")) {
							messageObj.setMessage(value);
						}
						else if (key.equalsIgnoreCase("notifyType")) {
							messageObj.setNotifyType(value);
						}
						else if (key.equalsIgnoreCase("properties")) {
							messageObj.setProperties(value);
						}
					}
				}
				
			}
		}
				
		
		return messageObj;
	}
	
	public static void main(String[] args) {
		String text = "title=POEMS Price Alert"
				+ ",appToken=2fdc45c4b3c6a47c38570fa76ee21e5db8d8a2634cd847c3089f28470ebea658"
				+ ",appType=8"
				+ ",collapseKey=PriceAlert"
				+ ",message="
				+ "Your price alert has been triggered"
				+ "Stocks - SGX - SingTel"
				+ "Volume(K) Target: 200"
				+ "13 Jul 2017, 01:41PM"
				+ ",notifyType=2"
				+ ",properties={CounterID=ST/SG/SGX/SGT.SG, Exchange=SGX, ProductKey=ST, CompanyCode=SGT.SG, CompanyName=SingTel, PriceAlertId=238476}";
		try {
			System.out.println(parseHornetQMessage(text).toJson());
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
