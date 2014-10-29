package com.YStudio.factory;

import com.YStudio.dao.CommodityDAO;
import com.YStudio.dao.CommodityDAOImpl;

public class CommodityDAOFactory {

	public static CommodityDAO createCommodityDAOImpl() {
		return new CommodityDAOImpl();
	}

}
