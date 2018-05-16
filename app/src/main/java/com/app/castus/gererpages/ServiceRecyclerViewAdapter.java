package com.app.castus.gererpages;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.castus.activities.MainActivityServiceDetail;
import com.app.castus.castusapp.R;
import com.app.castus.classes.MesService;

import java.util.List;

public class ServiceRecyclerViewAdapter extends RecyclerView.Adapter<ServiceRecyclerViewAdapter.MyViewHolder> {

private List<MesService> listServices;
private Context mContext;


    public ServiceRecyclerViewAdapter(List<MesService> listServices, Context mContext) {
         this.listServices = listServices;
         this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_service, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
         holder.tv_nom_serveice.setText(listServices.get(position).getNom());
         holder.img_thumbnail_service.setImageResource(listServices.get(position).getThumbnail());
         holder.cardView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(mContext, MainActivityServiceDetail.class);
                 intent.putExtra("Nom" , listServices.get(position).getNom());
                 intent.putExtra("Description" , listServices.get(position).getDescription());
                 intent.putExtra("Thumbnail" , listServices.get(position).getThumbnail());
                 mContext.startActivity(intent);

             }
         });
    }

    @Override
    public int getItemCount() {
        return listServices.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
            TextView tv_nom_serveice;
            ImageView img_thumbnail_service;
            CardView cardView;

                    public MyViewHolder(View itemView) {
                     super(itemView);
               tv_nom_serveice = (TextView) itemView.findViewById(R.id.id_nom_service);
               img_thumbnail_service =(ImageView) itemView.findViewById(R.id.id_image_service);
               cardView = (CardView) itemView.findViewById(R.id.id_cardview);


        }
    }

}
