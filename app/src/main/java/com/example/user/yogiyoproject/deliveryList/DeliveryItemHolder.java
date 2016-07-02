package com.example.user.yogiyoproject.deliveryList;

import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.yogiyoproject.R;

/**
 * Created by user on 2016-07-02.
 */
public class DeliveryItemHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;

    public DeliveryItemHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.delivery_item_image);
        textView = (TextView) itemView.findViewById(R.id.delivery_item_name);
    }

    public void setDeliveryData(DeliveryItemData deliveryData) {

        imageView.setImageResource(deliveryData.getIconId());
        textView.setText(deliveryData.getName());
    }


}
