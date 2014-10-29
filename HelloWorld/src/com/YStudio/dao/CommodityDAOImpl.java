package com.YStudio.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.YStudio.bean.Commodity;
import com.YStudio.util.DBConnection;

public class CommodityDAOImpl implements CommodityDAO {

	/* (non-Javadoc)
	 * @see com.YStudio.dao.CommodityDAO#addCommodity(com.YStudio.bean.Commodity)
	 */
	/* (non-Javadoc)
	 * @see com.YStudio.dao.CommodityDAO#addCommodity(com.YStudio.bean.Commodity)
	 */
	
	@Override
	public void addCommodity(Commodity commodity) {
		Connection conn = DBConnection.getConnection();
		String addSQL = "insert into commodity(name,price,agio) values(?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(addSQL);
			pstmt.setString(1, commodity.getName());
			pstmt.setDouble(2, commodity.getPrice());
			pstmt.setDouble(3, commodity.getAgio());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			DBConnection.close(pstmt);
			DBConnection.close(conn);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.YStudio.dao.CommodityDAO#findAllCommodity()
	 */
	@Override
	public List<Commodity> findAllCommodity(){
		Connection conn = DBConnection.getConnection();
		String findSQL = "select * from commodity";
		PreparedStatement pstmt = null;
		List<Commodity> commodityList = new ArrayList<Commodity>();
		try {
			pstmt = conn.prepareStatement(findSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Commodity commodity = new Commodity();
				commodity.setId(1);
				commodity.setName(rs.getString(1));
				commodity.setPrice(rs.getDouble(2));
				commodity.setAgio(rs.getDouble(3));
				commodityList.add(commodity);
			}
			
			DBConnection.close(rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.close(pstmt);
			DBConnection.close(conn);
		}
		
		return commodityList;
	}
	
	public CommodityDAOImpl(){
		
	}
}
