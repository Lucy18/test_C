package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLSParser {
	public String[][] readExcel(String path,int rows,int cols) throws IOException, InvalidFormatException{
		String[][] result=new String[rows][cols];
		File xlsFile = new File(path);
		// 获得工作簿
		Workbook workbook = WorkbookFactory.create(xlsFile);
		// 获得工作表个数
		int sheetCount = workbook.getNumberOfSheets();
		// 遍历工作表
		for (int i = 0; i < sheetCount; i++) {
			Sheet sheet = workbook.getSheetAt(i);
			// 读取数据
			for (int row = 1; row <= rows; row++) {
				Row r = sheet.getRow(row);
				for (int col = 0; col < cols; col++) {
					String theValue="";
					Cell cell = r.getCell(col);
		            if(null==cell) continue;
		            switch (cell.getCellType()){
		                case Cell.CELL_TYPE_NUMERIC: // 数字
		                	theValue=String.valueOf(cell.getNumericCellValue());
		                    break;
		                case Cell.CELL_TYPE_STRING: // 字符串
		                    theValue=cell.getStringCellValue();		              
		                    break;	         
		                case Cell.CELL_TYPE_BLANK: // 空值
		                	theValue=" ";		                   
		                    break;
		                case Cell.CELL_TYPE_ERROR: // 故障
		                	theValue=" ";	
		                    break;
		                default:
		                    System.out.print("未知类型");
		                    break;
		            }
					result[row-1][col]=theValue;
				}
			}
		}
		return result;
	}
//	public static void main(String[] args) throws InvalidFormatException, IOException {
//		XLSParser xlsParser=new XLSParser();
//		String[][] result=xlsParser.readExcel("",1,3);
//		for(int i=0;i<result.length;i++){
//		   for(int j=0;j<result[0].length;j++){
//			   System.out.print(result[i][j]+" ");
//		   }
//		   System.out.println();
//		}
//	}
}