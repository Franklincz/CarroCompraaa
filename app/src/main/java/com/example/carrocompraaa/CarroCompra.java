package com.example.carrocompraaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class CarroCompra extends AppCompatActivity {

    List<Producto> carroCompras;

    AdaptadorCarroCompras adaptador;

    RecyclerView rvListaCarro;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_compra);
        getSupportActionBar().hide();
        rvListaCarro = findViewById(R.id.rvListaCarro);
        tvTotal = findViewById(R.id.tvTotal);
        carroCompras = (List<Producto>) getIntent().getSerializableExtra("CarroCompras");


        rvListaCarro.setLayoutManager(new GridLayoutManager(CarroCompra.this, 1));


        adaptador = new AdaptadorCarroCompras(CarroCompra.this, carroCompras, tvTotal);
        rvListaCarro.setAdapter(adaptador);

    }
}