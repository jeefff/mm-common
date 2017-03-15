package com.vertical.mm.common.pojo;

import java.util.List;
/**
 * 通用的pojo类用来封装后端传递到前端的分页数据.
 * EU = EasyUI 也就是说这个是EasyUI DataGrid数据的封装 
 * @author Administrator
 *
 */
public class EUDataGridResult {

	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
