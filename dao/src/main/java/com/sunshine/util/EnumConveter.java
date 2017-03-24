package com.sunshine.util;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.sunshine.model.ServerStatus;

/**
* 
*@author 王一贺
* 2017年3月23日  
*/
public class EnumConveter implements TypeHandler<ServerStatus> {

	public EnumConveter() {
	}
	@Override
	public ServerStatus getResult(ResultSet arg0, String arg1) throws SQLException {
		String value = arg0.getString(arg1);
		for (ServerStatus status : ServerStatus.values()) {
			if(value.equals(status.toString()))
				return status;
		}
		return null;
	}

	@Override
	public ServerStatus getResult(ResultSet arg0, int arg1) throws SQLException {
		String value = arg0.getString(arg1);
		for (ServerStatus status : ServerStatus.values()) {
			if(value.equals(status.toString()))
				return status;
		}
		return null;
	}

	@Override
	public ServerStatus getResult(CallableStatement arg0, int arg1) throws SQLException {
		String value = (String) arg0.getObject(arg1);
		for (ServerStatus status : ServerStatus.values()) {
			if(value.equals(status.toString()))
				return status;
		}
		return null;
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, ServerStatus arg2, JdbcType arg3) throws SQLException {
		arg0.setString(arg1, arg2.toString());
	}

}
