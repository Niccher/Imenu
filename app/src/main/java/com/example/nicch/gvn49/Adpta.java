package com.example.nicch.gvn49;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by nicch on 4/2/18.
 */

public class Adpta extends RecyclerView.Adapter<Adpta.ViewHolder> {

    private List<List4> lisIts;
    private Context cnt;

    public Adpta(List<List4> lisIts, Context cnt) {
        this.lisIts = lisIts;
        this.cnt = cnt;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vw= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.repita,parent,false);
        return new ViewHolder(vw);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        final List4 lit=lisIts.get(position);
        holder.Tname.setText("Name-> Hotel Number");
        holder.Ploc.setText("Location-> Thika");
        holder.Pspec.setText("Speciality-> Chicken");
        holder.Pcomm.setText("Some Dummy And Long Texy Appear Here, Some things Are also Listed Here about uniqueness of a Place");

        holder.RelYt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(cnt,"Amn't Ready Please",Toast.LENGTH_SHORT).show();
                /*Intent mov = new Intent(cnt, Triall.class);
                String Rid=null;
                mov.putExtra("Rid",fff);
                mov.putExtra("Desc",kk);
                mov.putExtra("ContID",kk1);
                mov.putExtra("ContDur",kk2);
                mov.putExtra("ContVal",kk3);
                mov.putExtra("Aw",kk4);
                Toast.makeText(holder,"",Toast.LENGTH_LONG).show();
                cnt.startActivity(mov);*/
            }
        });
    }

    @Override
    public int getItemCount() {
        return lisIts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView Tname,Pcomm,Pspec,Ploc;

        public RelativeLayout RelYt;

        public ViewHolder(View itemView) {
            super(itemView);

            Tname= (TextView) itemView.findViewById(R.id.PrTt);
            Pcomm= (TextView) itemView.findViewById(R.id.PrComm);
            Pspec= (TextView) itemView.findViewById(R.id.PrSpecial);

            Ploc= (TextView) itemView.findViewById(R.id.PrLocation);

            RelYt=(RelativeLayout) itemView.findViewById(R.id.belg);
        }
    }
}
