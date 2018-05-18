package com.app.castus.castusapp;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.app.castus.classes.MesService;
import com.app.castus.gererpages.ServiceRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<MesService> listServices ;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
       listServices = initServices(listServices);

        recyclerView = (RecyclerView) findViewById(R.id.recycleview_id_service);

        ServiceRecyclerViewAdapter serviceRecyclerViewAdapter = new ServiceRecyclerViewAdapter(listServices , this);

        if(getResources().getDisplayMetrics().widthPixels>getResources().getDisplayMetrics().
                heightPixels)
        {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        }
        else
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(serviceRecyclerViewAdapter);

    }

    public  List<MesService> initServices(List<MesService> listService){

        listService = new ArrayList<>();
        listService.add(new MesService("SENELEC" , "LA DESCRIPTION SENELEC" , R.drawable.w6));
        listService.add(new MesService("SDE" , "LA DESCRIPTION ADE" , R.drawable.w6));
        listService.add(new MesService("RAPIDO" , "LA DESCRIPTION RAPIIDO" , R.drawable.w6));
        listService.add(new MesService("CANAL" , "LA DESCRIPTION CANAL" , R.drawable.w6));
        listService.add(new MesService("wOYAFAL" , "LA DESCRIPTION WOYAFAL" , R.drawable.w6));
        listService.add(new MesService("EXPRESSO" , "LA DESCRIPTION EXPRESSO" , R.drawable.w6));
        listService.add(new MesService("ORANGE" , "LA DESCRIPTION ORANGE" , R.drawable.w6));
        listService.add(new MesService("TIGO" , "LA DESCRIPTION TIGO" , R.drawable.w6));
        listService.add(new MesService("AUTRES" , "LA DESCRIPTION AUTRES" , R.drawable.w6));
        return listService;
    }
}
