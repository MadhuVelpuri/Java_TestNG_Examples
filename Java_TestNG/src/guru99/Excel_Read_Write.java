package guru99;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Write {

	static String file_name = System.getProperty("user.dir") + "\\Sample.xlsx";
	static Workbook workbook;
	static Row row;
	static Cell cell;
	static HSSFSheet sheet = null;
	static XSSFSheet sheetx = null;
	static Sheet mySheet;

	public static void main(String[] args) throws IOException {

		FileInputStream inputStream = new FileInputStream(new File(file_name));

		workbook = getWorkBook(inputStream, file_name);
		System.out.println("Workbook type is: " + workbook.getSpreadsheetVersion());
		get_sheets(workbook);
		inputStream.close();
		write_excel(workbook);
		create_sheet(workbook, file_name);

	}

	public static void get_sheets(Workbook workbook) {

		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			mySheet = workbook.getSheetAt(i);
			// System.out.println("Sheet Name is : " + mySheet);
			read_excel(workbook);
			System.out.println("");
		}
	}

	public static void create_sheet(Workbook workbook, String filename) throws IOException {
		Random RandomGenerator = new Random();
		int num1 = RandomGenerator.nextInt(50000);
		Sheet sheet = workbook.createSheet("Sample" + num1);
		// Row row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Madhu");
		for (int i = 0; i < 5; i++) {
			int num = RandomGenerator.nextInt(50000);
			row = sheet.createRow(i);

			for (int j = 0; j < 5; j++) {
				cell = row.createCell(j);
				cell.setCellValue("Madhu_" + num);
				sheet.autoSizeColumn(j);
			}
			int column_count = row.getLastCellNum();

			for (int ii = 1; ii <= column_count; ii++) {
				sheetx.autoSizeColumn(ii);
			}

		}

		FileOutputStream out = new FileOutputStream(filename);
		workbook.write(out);
		out.close();
	}

	public static void read_excel(Workbook workbook) {
		sheetx = (XSSFSheet) mySheet;
		Iterator<Row> iterator = sheetx.iterator();
		Row headerRow = iterator.next();
		while (iterator.hasNext()) {
			row = iterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				cell = cellIterator.next();
				System.out.print(cell.getStringCellValue() + "\t");

			}
			System.out.println("");

		}

	}

	public static Workbook getWorkBook(FileInputStream inputStream, String file) throws IOException

	{
		Workbook workbook = null;
		if (file.endsWith("xlsx")) {
			workbook = new XSSFWorkbook(inputStream);
		} else if (file.endsWith("xls")) {
			workbook = new HSSFWorkbook(inputStream);
		} else {
			throw new IllegalArgumentException("The specified file is not Excel file");
		}

		return workbook;

	}

	public static void write_excel(Workbook workbook) throws IOException {

		FileOutputStream outputStream = new FileOutputStream(file_name);

		Font font = workbook.createFont();
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		CellStyle style = workbook.createCellStyle();
		style.setFont(font);

		Iterator<Row> rowIterator = sheetx.iterator();
		while (rowIterator.hasNext()) {
			row = rowIterator.next();
			cell = row.createCell(2);

			if (row.getRowNum() == 0) {
				cell.setCellValue("Result");
				cell.setCellStyle(style);
			} else
				cell.setCellValue("Pass");

			int column_count = row.getLastCellNum();
			// System.out.println("Coulmn count in Row:" + row.getRowNum() + "
			// is: " + column_count);

			for (int i = 1; i <= column_count; i++) {
				sheetx.autoSizeColumn(i);
			}
		}

		workbook.write(outputStream);

		outputStream.close();

	}

}