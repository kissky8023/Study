package com.YStudio.dao;

import java.util.List;

import com.YStudio.bean.Commodity;

public interface CommodityDAO {

	/* (non-Javadoc)
	 * @see com.YStudio.dao.CommodityDAO#addCommodity(com.YStudio.bean.Commodity)
	 */
	public abstract void addCommodity(Commodity commodity);

	public abstract List<Commodity> findAllCommodity();

}