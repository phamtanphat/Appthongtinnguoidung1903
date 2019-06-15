package khoapham.ptp.phamtanphat.appluutruthongtin1903;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.model.Singer;

public class CasiAdapter extends ArrayAdapter<Singer> {
    public CasiAdapter( @NonNull Context context, int resource,@NonNull List<Singer> objects) {
        super(context, resource, objects);
    }
}
