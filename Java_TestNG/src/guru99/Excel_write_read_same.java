package guru99;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Excel_write_read_same {

	static String file_name = System.getProperty("user.dir") + "\\Goal.xls";
	static Cell cell;
	HSSFWorkbook wb = new HSSFWorkbook();
	HSSFSheet hsheet;
	Row row;

	public void readExcel() throws FileNotFoundException {

		FileInputStream fis = new FileInputStream(new File(file_name));
		hsheet = wb.getSheet("Sample");
		Iterator<Row> row_ite = hsheet.iterator();
		int i = 0;
		while (row_ite.hasNext()) {
			row = row_ite.next();
			Iterator<Cell> cell_ite = row.cellIterator();

			while (cell_ite.hasNext()) {
				Cell cell = cell_ite.next();
				if (i == 0)
					System.out.print("\t" + cell.getStringCellValue() + "\t");
				else
					System.out.print("\t" + cell.getStringCellValue());

			}
			System.out.println("\n");
			i++;
		}

	}

	public void writeExcel() throws IOException {

		String[] Headers = { "S.NO", "NAME", "QUALIFICATION", "MOB.NO", "PLACE" };

		hsheet = wb.createSheet("Sample");

		// Applying Cell Styles
		HSSFCellStyle cellStyle = wb.createCellStyle();
		cellStyle.setFillForegroundColor(HSSFColor.BRIGHT_GREEN.index);
		cellStyle.setShrinkToFit(false);
		cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		row = hsheet.createRow(0);
		// Creating headers
		for (int rn = 0; rn < Headers.length; rn++) {

			cell = row.createCell(rn);
			cell.setCellValue(Headers[rn]);
			cell.setCellStyle(cellStyle);
			hsheet.autoSizeColumn(rn); // to set the column size as per text

		}

		Random RandomGenerator = new Random();
		int num1 = RandomGenerator.nextInt(50000);

		for (int i = 1; i < 5; i++) {
			int num = RandomGenerator.nextInt(50000);
			row = hsheet.createRow(i);

			for (int j = 0; j < 5; j++) {
				cell = row.createCell(j);
				cell.setCellValue("Madhu_" + num);
				hsheet.autoSizeColumn(j);
			}
			int column_count = row.getLastCellNum();

			for (int ii = 1; ii <= column_count; ii++) {
				hsheet.autoSizeColumn(ii);
			}

		}

		/*
		 * Cell cell = row.createCell(0); cell.setCellValue("Madhu");
		 * HSSFCellStyle cellStyle = wb.createCellStyle();
		 * cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		 * cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		 * cell.setCellStyle(cellStyle);
		 */
		FileOutputStream out = new FileOutputStream(new File(file_name));
		wb.write(out);
		System.out.println("File Updated Successfully");
		out.close();

	}

	public static void main(String a[]) throws IOException, InterruptedException {
		Excel_write_read_same esw = new Excel_write_read_same();
		esw.writeExcel();
		Thread.sleep(3000);
		esw.readExcel();

	}

}
