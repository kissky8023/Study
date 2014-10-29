package com.YStudio.test;

import java.util.List;

import com.YStudio.bean.Commodity;
import com.YStudio.dao.CommodityDAO;
import com.YStudio.factory.CommodityDAOFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommodityDAO commodityDAOImpl = CommodityDAOFactory
				.createCommodityDAOImpl();

		Commodity commodity = new Commodity();
		commodity.setId(2);
		commodity.setName("cdf");
		commodity.setPrice(2.34);
		commodity.setAgio(0.85);
		commodityDAOImpl.addCommodity(commodity);
		
		List<Commodity> commodityList = commodityDAOImpl.findAllCommodity();
		
		for (Commodity commodity2 : commodityList) {
			System.out.println(commodity2.getName());
		}
		
		
	}

}
