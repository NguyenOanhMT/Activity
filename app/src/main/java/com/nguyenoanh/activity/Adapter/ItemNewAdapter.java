package com.nguyenoanh.activity.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nguyenoanh.activity.Activity.Message;
import com.nguyenoanh.activity.Activity.NewFeed;
import com.nguyenoanh.activity.Model.ItemNew;
import com.nguyenoanh.activity.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemNewAdapter extends RecyclerView.Adapter<ItemNewAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ItemNew> listNew;

    public ItemNewAdapter(Context context, ArrayList<ItemNew> listNew) {
        this.context = context;
        this.listNew = listNew;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from (context);
        View view = inflater.inflate (R.layout.item_new, null);


        return new ItemNewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        ItemNew itemNew = listNew.get (i);

        holder.tvName.setText (itemNew.getUsername ());
        holder.tvTime.setText (itemNew.getTime ());
        holder.tvContent.setText (itemNew.getContent ());
        holder.tvPrice.setText (itemNew.getPrice ());

        holder.profileImage.setImageDrawable(context.getResources().getDrawable(itemNew.getProfileImage ()));
        holder.image.setImageDrawable(context.getResources().getDrawable(itemNew.getImage ()));
    }

    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        CircleImageView profileImage;
        ImageView image;

        TextView tvName, tvTime, tvContent, tvPrice;
        ItemUserAdapter adapter;

        public ViewHolder(@NonNull View itemView) {
            super (itemView);

            itemView.setOnClickListener (this);

            profileImage = (CircleImageView) itemView.findViewById (R.id.imv_profile);
            image = (ImageView) itemView.findViewById (R.id.image);

            tvName = (TextView) itemView.findViewById (R.id.tv_name);
            tvTime = (TextView) itemView.findViewById (R.id.tv_time);
            tvContent = (TextView) itemView.findViewById (R.id.tv_content);
            tvPrice = (TextView) itemView.findViewById (R.id.tv_price);

            profileImage.setOnClickListener (new View.OnClickListener () {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent (context, Message.class);
                    intent.addFlags (Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity (intent);
                }
            });
        }

        @Override
        public void onClick(View view) {
        }
    }

    public interface onClickListner{

    }
    @Override
    public int getItemCount() {
        return listNew.size ();
    }
}
