package personal.pol.sanejove.pills.rec_view_adapter;

import android.content.ClipData;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import personal.pol.sanejove.pills.entities.Day;
import personal.pol.sanejove.pills.interfaces.ItemClickListener;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.ViewHolder> {
    private ArrayList<Day> dayArrayList;
    private ItemClickListener itemClickListener;
    public DayAdapter(ArrayList<Day> list, ItemClickListener listener){
        dayArrayList = list;
        itemClickListener = listener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final Text
        @Override
        public void onClick(View view) {

        }
    }
}
