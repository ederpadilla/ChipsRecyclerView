package dev.eder.padilla.chiplayoutmanager;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.List;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ChipsAdapter extends RecyclerView.Adapter<ChipsAdapter.ChipsViewHolderAdapter> implements View.OnClickListener {

    List<Tag> tagList;

    Context adapterContext;

    public ChipsAdapter(List<Tag> tagList) {
        this.tagList = tagList;
    }

    @NonNull
    @Override
    public ChipsAdapter.ChipsViewHolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        adapterContext = parent.getContext();
        View view = LayoutInflater.from(adapterContext).inflate(R.layout.item_tag, parent, false);
        ChipsViewHolderAdapter viewholder = new ChipsViewHolderAdapter(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChipsAdapter.ChipsViewHolderAdapter holder, int position) {
        Tag tag = tagList.get(position);
        holder.bindTag(tag);
    }

    @Override
    public int getItemCount() {
        return tagList.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class ChipsViewHolderAdapter extends RecyclerView.ViewHolder{

        @BindView(R.id.tv_tag_name) TextView mTvTagName;

        @BindView(R.id.tag_container)
        RelativeLayout mContainer;

        @BindDrawable(R.drawable.tag_not_selected_bg) Drawable mNotSelectedDrawable;

        @BindDrawable(R.drawable.tag_selected_bg) Drawable mSelectedDrawable;

        public ChipsViewHolderAdapter(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
        void bindTag(final Tag tag){
            mTvTagName.setText(tag.name);
            if (tag.isSelected()){
                mContainer.setBackground(mNotSelectedDrawable);
                mTvTagName.setTextColor(Color.parseColor("#000000"));
            }else{
                mContainer.setBackground(mSelectedDrawable);
                mTvTagName.setTextColor(Color.parseColor("#FFFFFF"));
            }
            mContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (tag.isSelected()){
                        tag.setSelected(false);
                    }else {
                        tag.setSelected(true);
                    }
                    notifyDataSetChanged();
                }
            });
        }
    }
}
