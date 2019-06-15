package khoapham.ptp.phamtanphat.appluutruthongtin1903.API.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CasiAPI {

@SerializedName("singers")
@Expose
private List<Singer> singers = null;

public List<Singer> getSingers() {
return singers;
}

public void setSingers(List<Singer> singers) {
this.singers = singers;
}

}