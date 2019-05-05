package com.example.recycler_view;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder>{

    private static final String TAG = "RecyclerViewAdapter";


    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImage = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context mContext, ArrayList<String> mImageNames, ArrayList<String> mImage) {
        this.mImageNames = mImageNames;
        this.mImage = mImage;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
       RecyclerView.ViewHolder holder = new viewHolder(view);
       return (viewHolder) holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder Holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        Glide.with(mContext)
                .asBitmap()
                .load(mImage.get(position))
                .into(Holder.image);

        Holder.image_name.setText(mImageNames.get(position));

        Holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));
                Intent intent = new Intent(v.getContext(),CourseDetails.class);
                intent.putExtra("data",mImageNames.get(position));
                v.getContext().startActivity(intent);
                //Toast.makeText(mContext,mImageNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView image_name;
        RelativeLayout parent_layout;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            image_name=itemView.findViewById(R.id.image_name);
            parent_layout=itemView.findViewById(R.id.parent_layout);
        }
    }
}
