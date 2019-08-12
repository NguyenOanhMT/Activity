package com.nguyenoanh.activity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nguyenoanh.activity.Model.ItemUser;
import com.nguyenoanh.activity.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemUserAdapter extends RecyclerView.Adapter<ItemUserAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ItemUser> listUser;

    public ItemUserAdapter(Context context, ArrayList<ItemUser> listUser) {
        this.context = context;
        this.listUser = listUser;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from (context);

        View view = inflater.inflate (R.layout.item_mess, null);
        return new ItemUserAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        ItemUser itemNew = new ItemUser ();

        holder.userName.setText (itemNew.getUsername ());
        holder.time.setText (itemNew.getTime ());
        holder.message.setText (itemNew.getMessage ());
        holder.numberMess.setText (itemNew.getNumberMess ());

        holder.imageAvatar.setImageResource (itemNew.getImvAvatar ());
        holder.imageAction.setImageResource (itemNew.getActionUser ());
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imageAvatar;
        ImageView imageAction;

        TextView userName, time, numberMess, message;

        public ViewHolder(@NonNull View itemView) {
            super (itemView);
            userName = (TextView) itemView.findViewById (R.id.tv_name);
            message = (TextView) itemView.findViewById (R.id.tv_message);
            time = (TextView) itemView.findViewById (R.id.tv_time);
            numberMess = (TextView) itemView.findViewById (R.id.number_mess);

            imageAvatar = (CircleImageView) itemView.findViewById (R.id.imv_avatar);
            imageAction = (ImageView) itemView.findViewById (R.id.user_online_offline);
        }
    }

    @Override
    public int getItemCount() {
        return listUser.size ();
    }
}

