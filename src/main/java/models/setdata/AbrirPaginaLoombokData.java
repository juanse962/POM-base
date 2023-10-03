package models.setdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class    AbrirPaginaLoombokData {
    String url;

    public static List<AbrirPaginaLoombokData> setData(DataTable dataTable) {
        List<AbrirPaginaLoombokData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, AbrirPaginaLoombokData.class));
        }
        return dates;
    }
}
