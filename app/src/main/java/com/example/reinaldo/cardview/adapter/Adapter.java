package com.example.reinaldo.cardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reinaldo.cardview.R;
import com.example.reinaldo.cardview.model.Postagem;

import java.util.List;

public class Adapter  extends RecyclerView.Adapter<Adapter.MyViewHolder> {


    private List<Postagem>listaPostagem;

    public Adapter(List<Postagem>postagens){

        this.listaPostagem = postagens;
    }


    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {

        //cria uma variavel do tipo view e infla meu adapter_lista.xml e retorna a instancia
        //do meu objeto da classe MyViewHolder passando a variavel que precisa ser do tipo view
        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_postagem, viewGroup, false);


        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int i) {

        Postagem postagem = listaPostagem.get(i);


        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imagePostagem.setImageResource(postagem.getImagem());

    }

    @Override
    public int getItemCount() {
        return listaPostagem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagePostagem;

        public MyViewHolder(View itemView) {
            super(itemView);

          textNome = itemView.findViewById(R.id.textNome);
          textPostagem = itemView.findViewById(R.id.textPostagem);
          imagePostagem = itemView.findViewById(R.id.imagePostagem);

        }
    }

}
