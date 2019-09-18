package com.route.fragmentsanddialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsFragment extends Fragment {

    View view;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ContactsAdapter contactsAdapter;

    public ContactsFragment() {


    }

    ArrayList<String> data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_contacts, container, false);

        recyclerView = view.findViewById(R.id.contacts_recycler_view);
        layoutManager = new LinearLayoutManager(getContext());
        data = new ArrayList<>();

        data.add("Mohamed");
        data.add("Mohamed");
        data.add("Mohamed");
        data.add("Mohamed");
        data.add("Mohamed");
        data.add("Mohamed");



        contactsAdapter = new ContactsAdapter(data);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(layoutManager);

        return view;

    }
}
