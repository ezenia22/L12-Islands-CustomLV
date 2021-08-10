package sg.edu.rp.c346.id20011155.l12_ndpsongs_customlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import sg.edu.rp.c346.id20011155.l12_ndpsongs_customlv.R;
import sg.edu.rp.c346.id20011155.l12_ndpsongs_customlv.Song;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Song> singerList;

    public CustomAdapter(Context context, int resource,   ArrayList<Song> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        singerList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvTitle = rowView.findViewById(R.id.title);
        TextView tvYear = rowView.findViewById(R.id.year);
        TextView rate = rowView.findViewById(R.id.textViewRate);
        ImageView ivImage = rowView.findViewById(R.id.imageView);
        TextView tvSinger = rowView.findViewById(R.id.singer);

        Song currentVersion = singerList.get(position);

        tvTitle.setText(currentVersion.getTitle());
        tvYear.setText(String.valueOf(currentVersion.getYearReleased()));
        rate.setText(String.valueOf(currentVersion.getStars())+"*");
        tvSinger.setText(currentVersion.getSingers());

        if (currentVersion.getYearReleased() >= 2019) {
            ivImage.setImageResource(R.drawable.newimg);
        } else if (currentVersion.getYearReleased() < 2019) {
            ivImage.setVisibility(View.INVISIBLE);
        }
        return rowView;
    }
}
