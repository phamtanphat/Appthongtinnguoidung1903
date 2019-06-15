package khoapham.ptp.phamtanphat.appluutruthongtin1903;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.model.Singer;

public class CasiAdapter extends ArrayAdapter<Singer> {
    ArrayList<Singer> mang;
    public CasiAdapter( @NonNull Context context, int resource,@NonNull List<Singer> objects) {
        super(context, resource, objects);
        mang = (ArrayList<Singer>) objects;
    }


    @NonNull
    @Override
    public View getView(int position,@Nullable View convertView,@NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.dong_casi_item,null);
        TextView txtTen = convertView.findViewById(R.id.textviewTencasi);
        TextView txtEmail = convertView.findViewById(R.id.textviewEmail);
        ImageView img = convertView.findViewById(R.id.imageviewCasi);

        Singer singer = getItem(position);

        txtTen.setText(singer.getName());
        txtEmail.setText(singer.getEmail());
        Glide.with(getContext()).load(singer.getAvatar()).into(img);
        return convertView;
    }
    public void moreData(ArrayList<Singer> mangdulieu){
        mang.addAll(mangdulieu);
        notifyDataSetChanged();
    }
}
