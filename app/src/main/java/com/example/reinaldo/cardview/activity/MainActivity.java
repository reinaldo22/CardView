package com.example.reinaldo.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.reinaldo.cardview.R;
import com.example.reinaldo.cardview.adapter.Adapter;
import com.example.reinaldo.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem>postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclePostagem);

        //Definir o layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Definir o adapter
        this.prepararPostagens();//Chamo o método aqui
        Adapter adapter = new Adapter( postagens );
        recyclerPostagem.setAdapter(adapter);
    }
    public void prepararPostagens(){
        this.postagens.add(new Postagem("Reinaldo Vargas","#ViagemLegal",R.drawable.imagem2));
        this.postagens.add(new Postagem("Carlos Ptolomeu","#SaindoDeCasa",R.drawable.imagem1));
        this.postagens.add(new Postagem("Marcos Cavalcante","#PartiuFerias",R.drawable.imagem3));
        this.postagens.add(new Postagem("Sonia Blayde","#FicaDica",R.drawable.imagem4));
    }
}
