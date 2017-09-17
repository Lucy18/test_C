package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLSParser {
	
	/**
	 * 
	 * @param xlsx文件的路径
	 * @param xlsx表的列数(因为只要解析蓝色部分，xlsx后面几列是解释，不用解析)
	 * @return
	 */
	public String[][] readExcel(String path, int cols){
		java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
		nf.setGroupingUsed(false);
		nf.setMaximumFractionDigits(10);

		File xlsFile = new File(path);
		// 获得工作簿
		Workbook workbook;
		try {
			workbook = WorkbookFactory.create(xlsFile);
			Sheet sheet = workbook.getSheetAt(0);
			// 获得行数
			int rows = sheet.getLastRowNum() + 1;
			String[][] result = new String[rows-1][cols];
			// 读取数据
			for (int row = 1; row < rows; row++) {
				Row r = sheet.getRow(row);
				for (int col = 0; col < cols; col++) {
					String theValue = "";
					Cell cell = r.getCell(col);
					if (null == cell)
						continue;
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC: // 数字
						theValue = nf.format(cell.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_STRING: // 字符串
						theValue = cell.getStringCellValue();
						break;
					case Cell.CELL_TYPE_BLANK: // 空值
						theValue = " ";
						break;
					case Cell.CELL_TYPE_ERROR: // 故障
						theValue = " ";
						break;
					default:
						System.out.print("未知类型");
						break;
					}
					result[row - 1][col] = theValue;
				}
			}
			return result;
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;
	}
	
//	public static void main(String[] args) throws InvalidFormatException, IOException {
//		XLSParser xlsParser=new XLSParser();
//		String[][] result=xlsParser.readExcel("Aircrafts.xlsx",6);
//		for(int i=0;i<result.length;i++){
//		   for(int j=0;j<result[0].length;j++){
//			   System.out.print(result[i][j]+" ");
//		   }
//		   System.out.println();
//		}
//	}
}