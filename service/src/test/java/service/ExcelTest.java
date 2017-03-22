package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sunshine.dao.MarriageDao;
import com.sunshine.dao.NationDao;
import com.sunshine.model.Elder;
import com.sunshine.model.Marriage;
import com.sunshine.model.Nation;
import com.sunshine.util.UUIDUtil;

public class ExcelTest {

	@Autowired
	private NationDao nat;
	@Autowired
	private MarriageDao md;

	@Test
	public void savetest() {

		try {
			InputStream in = new FileInputStream("E:\\老人表.xlsx");

			// XSSFWorkbook 代表一个Excel文件，创建它的对象就是打开Excel文件
			XSSFWorkbook wb = new XSSFWorkbook(in);
			in.close();
			// XSSFSheet代表Excel文件中的一个表
			XSSFSheet sheet = wb.getSheetAt(0);
			System.out.println(sheet);
			// XSSFRow 代表一行数据
			int i = 1;
			Iterator<Row> rows = sheet.rowIterator();
			List<Elder> list = new ArrayList();
			Map<String, Nation> nationMap = new HashMap<>();
			Map<String, Marriage> marrMap = new HashMap<>();
			Row row;
			rows.next();
			while (rows.hasNext()) {
				row = rows.next();
				Elder e = new Elder();
				e.setId(UUIDUtil.genericUUID());
				e.setName(row.getCell(1).getStringCellValue());
				e.setGender(row.getCell(2).getBooleanCellValue());
				e.setIdcard(row.getCell(3).getStringCellValue());
				e.setPhone(row.getCell(4).getStringCellValue());
				e.setBirthday(row.getCell(6).getDateCellValue());
				e.setAddress(row.getCell(7).getStringCellValue());
				String nationName = row.getCell(4).getStringCellValue();
				Nation nation = nationMap.get(nationName);
				if (nation == null) {
					nation = nat.getNationByName(nationName);
					nationMap.put(nationName, nation);
				}
				e.setNation_id(nation.getId());
				String marrageName = row.getCell(7).getStringCellValue();
				
				Marriage m = marrMap.get(marrageName);
				if (m == null) {
					m = md.getMarrageByName(marrageName);
					marrMap.put(marrageName, m);
				}
				e.setMarriage_id(m.getId());
				// e.setMarriage_id(row.getCell(4).getStringCellValue());
				// e.setNeed_id(row.getCell(7).getStringCellValue());
				list.add(e);

			}
			wb.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

	}

	// @Test
	// public void testExport() throws IOException, InvalidFormatException {
	//
	// File file = new File("E:/" + System.currentTimeMillis() + ".xlsx");
	// if(!file.exists())
	// file.createNewFile();
	// XSSFWorkbook wb = new XSSFWorkbook();
	// XSSFSheet sheet = wb.createSheet("sheet1");
	// for(int i = 0; i< 10; i++) {
	// Row row = sheet.createRow(i);
	// for(int j = 0;j<20;j++) {
	// Cell cell = row.createCell(j);
	// cell.setCellValue(i + ":" + j);
	// }
	// }
	//
	// wb.write(new FileOutputStream(file));
	// wb.close();
	//
	// }
}
