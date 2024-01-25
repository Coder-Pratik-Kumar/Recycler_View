package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclercontactAdapter extends RecyclerView.Adapter<RecyclercontactAdapter.ViewHolder> {
    ArrayList<Contactmodel> arrcontacts;
    Context context;
    public RecyclercontactAdapter(Context context,ArrayList<Contactmodel> arrcontacts){
        this.context=context;
        this.arrcontacts=arrcontacts;
    }
    @NonNull
    @Override
    public RecyclercontactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewholder=new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclercontactAdapter.ViewHolder holder, int position) {


        holder.img.setImageResource(arrcontacts.get(position).img);
        holder.txtname.setText(arrcontacts.get(position).name);
        holder.txtnumber.setText(arrcontacts.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrcontacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtname,txtnumber;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.contact);
            txtnumber=itemView.findViewById(R.id.number);
            img=itemView.findViewById(R.id.pratikimg);
        }
    }
}
