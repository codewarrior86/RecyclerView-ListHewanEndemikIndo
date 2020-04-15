package com.maprojek.recyclerview_listhewanendemikindo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListEndemikAdapter extends RecyclerView.Adapter<ListEndemikAdapter.ListViewHolder> {

    private ArrayList<Endemik> listEndemik;
    public ListEndemikAdapter(ArrayList<Endemik> list) {
        this.listEndemik = list;
    }

    //klik item list
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_endemik, parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Endemik hero = listEndemik.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgFoto);

        holder.txtNama.setText(hero.getNama());
        holder.txtDetail.setText(hero.getDetail());

        //klik item list
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listEndemik.get(holder.getAdapterPosition()));
            }
        });
    }

    //klik item list
    public interface OnItemClickCallback {
        void onItemClicked(Endemik data);
    }

    @Override
    public int getItemCount() {
        return listEndemik.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgFoto;
        TextView txtNama, txtDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFoto = itemView.findViewById(R.id.img_item_photo);
            txtNama = itemView.findViewById(R.id.txt_item_name);
            txtDetail = itemView.findViewById(R.id.txt_item_detail);

        }
    }
}
