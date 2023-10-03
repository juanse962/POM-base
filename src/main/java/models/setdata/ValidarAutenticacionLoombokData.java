package models.setdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class ValidarAutenticacionLoombokData {
    String username;

    public static List<ValidarAutenticacionLoombokData> setData(DataTable dataTable) {
        List<ValidarAutenticacionLoombokData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, ValidarAutenticacionLoombokData.class));
        }
        return dates;
    }
}
