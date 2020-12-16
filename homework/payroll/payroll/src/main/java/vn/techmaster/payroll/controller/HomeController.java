package vn.techmaster.payroll.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.techmaster.payroll.model.Employee;

@Controller
public class HomeController {

  @ResponseBody
  @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE) 
  public String getEmployeesFromCSV(){
    try {
      File file = ResourceUtils.getFile("classpath:data/employee.csv");
      
      CsvMapper mapper = new CsvMapper(); //Dùng để ánh xạ cột trong CSV với từng trường trong POJO
      CsvSchema schema = CsvSchema.emptySchema().withHeader(); // Dòng đầu tiên sử dụng làm Header
      ObjectReader oReader = mapper.readerFor(Employee.class).with(schema); //Cấu hình bộ đọc CSV phù hợp với kiểu Car.class
   
      StringBuilder sb = new StringBuilder(""); //sb dùng để cộng các chuỗi toString của đối tượng Car
   
      Reader reader = new FileReader(file);
      MappingIterator<Employee> mi = oReader.readValues(reader); //Iterator đọc từng dòng trong file
      while (mi.hasNext()) {
        Employee current = mi.next();
        sb.append(current.toString() + "<br>");
      }
      return sb.toString(); //Trả về trình duyệt
      } catch (FileNotFoundException e) {
      return "File Not Found";
      } catch (IOException e) {
      return "IO Exception Error";
      }

  }
  
}
