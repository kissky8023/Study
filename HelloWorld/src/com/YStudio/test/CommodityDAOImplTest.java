package com.YStudio.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.YStudio.dao.CommodityDAO;
import com.YStudio.factory.CommodityDAOFactory;

public class CommodityDAOImplTest {

	@Test
	public void testCreateCommodityDAOImpl() {
		CommodityDAO commodityDAOImpl = CommodityDAOFactory.createCommodityDAOImpl();
		assertNotNull(commodityDAOImpl);
	}

}
