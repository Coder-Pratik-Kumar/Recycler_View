package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contactmodel>arrcontacts=new ArrayList<Contactmodel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RecyclerView recyclerView=findViewById(R.id.contactrecycle);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
        arrcontacts.add(new Contactmodel(R.drawable.ajay,"Ajay Bharadwaj","7454984148"));
        arrcontacts.add(new Contactmodel(R.drawable.arpit,"Arpit Kumar","9548769063"));
        arrcontacts.add(new Contactmodel(R.drawable.nagu,"Rahul Baghat","764228168"));
        arrcontacts.add(new Contactmodel(R.drawable.chacha,"Fatendra Chacha","7668432302"));
        arrcontacts.add(new Contactmodel(R.drawable.chotu,"Chhotu Bhaiya","8859610331"));
        arrcontacts.add(new Contactmodel(R.drawable.varun,"Varun Bhaiya","8130056847"));
        arrcontacts.add(new Contactmodel(R.drawable.neerajphoto,"Neeraj Friend","6398886827"));
        arrcontacts.add(new Contactmodel(R.drawable.prashant,"Prashant Friend","7060304907"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));
//        arrcontacts.add(new Contactmodel(R.drawable.pratik_fare,"Pratik Sharma","8859295480"));

        RecyclercontactAdapter adapter=new RecyclercontactAdapter(this,arrcontacts);
        recyclerView.setAdapter(adapter);


    }
}