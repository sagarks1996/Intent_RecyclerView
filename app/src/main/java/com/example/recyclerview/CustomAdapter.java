package com.example.recyclerview;

import android.content.Context;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ModelClass> arrayList;

    public CustomAdapter(Context context, ArrayList<ModelClass> arrayList) {

        this.context = context;
        this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view,parent,false);
        //ViewHolder viewHolder = new ViewHolder(view);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ModelClass modelClass = arrayList.get(position);
        String text = modelClass.getText();
        int image = modelClass.getImage();

        holder.textView.setText(text);
        holder.imageView.setImageResource(image);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textview);
            imageView = itemView.findViewById(R.id.imageview);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            
           //int pos=getAdapterPosition();
            ModelClass modelClass = arrayList.get(getAdapterPosition());
            String text = modelClass.getText();
            int image = modelClass.getImage();
            Toast.makeText(context,"Show your text :"+text,Toast.LENGTH_SHORT).show();

        }
    }
}
