package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrayContact;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContact){
        this.context = context;
        this.arrayContact = arrContact;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imgContact.setImageResource(arrayContact.get(position).Img);
        holder.txtName.setText(arrayContact.get(position).name);
        holder.txtNumber.setText(arrayContact.get(position).number);



    }

    @Override
    public int getItemCount() {
        return arrayContact.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        TextView txtName,txtNumber;
        ImageView imgContact;
        public ViewHolder(View itemView) {
            super(itemView);


            txtName = itemView.findViewById(R.id.contactName);
            txtNumber = itemView.findViewById(R.id.contactNumber);
            imgContact = itemView.findViewById(R.id.contactImage);
        }
    }
}
