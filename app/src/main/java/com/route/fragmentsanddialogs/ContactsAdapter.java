package com.route.fragmentsanddialogs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {

    ArrayList<String> data ;

    public ContactsAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_contact_item , parent , false);

        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.contactName.setText(data.get(position));
    }

    @Override
    public int getItemCount() {

        if ( data == null)
            return 0;
        return data.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{

        TextView contactName;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            contactName = itemView.findViewById(R.id.contact_name);


        }
    }
}
