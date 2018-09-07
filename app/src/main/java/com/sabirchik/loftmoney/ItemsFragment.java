package com.sabirchik.loftmoney;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ItemsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ItemsFragment extends Fragment {

    public static final String KEY_TYPE = "type";

    public static ItemsFragment newInstance(String type) {
        ItemsFragment fragment = new ItemsFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ItemsFragment.KEY_TYPE, type);
        fragment.setArguments(bundle);
        return fragment;
    }
    public ItemsFragment() {

        // Required empty public constructor
    }

    private ItemsAdapter adapter;


    public static ItemsFragment newInstance(String param1, String param2) {
        ItemsFragment fragment = new ItemsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ItemsAdapter();
        adapter.setItems(getDummyItems());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item, container, false);
    }

    @Override
    public void onViewCreated(View view,
                              @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

    }

    public List<Item> getDummyItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Баклажан", "70р"));
        items.add(new Item("Огурцы", "65р"));
        items.add(new Item("Помидоры", "149р"));
        items.add(new Item("Сыр", "350р"));
        items.add(new Item("Колбаса", "310р"));
        items.add(new Item("Хлеб", "65р"));
        items.add(new Item("Макароны", "19р"));
        items.add(new Item("Рис", "44р"));
        items.add(new Item("Арбуз", "180р"));
        items.add(new Item("Баклажан", "70р"));
        items.add(new Item("Огурцы", "49р"));
        items.add(new Item("Помидоры", "59р"));
        items.add(new Item("Сыр", "365р"));
        items.add(new Item("Баклажан", "70р"));
        items.add(new Item("Огурцы", "65р"));
        items.add(new Item("Помидоры", "149р"));
        items.add(new Item("Сыр", "350р"));
        items.add(new Item("Колбаса", "310р"));
        items.add(new Item("Хлеб", "65р"));
        items.add(new Item("Макароны", "19р"));
        items.add(new Item("Рис", "44р"));
        items.add(new Item("Арбуз", "180р"));
        items.add(new Item("Баклажан", "70р"));
        items.add(new Item("Огурцы", "49р"));
        items.add(new Item("Помидоры", "59р"));
        items.add(new Item("Сыр", "365р"));
        items.add(new Item("Колбаса", "315р"));
        items.add(new Item("Хлеб", "67р"));
        items.add(new Item("Макароны", "20р"));
        items.add(new Item("Рис", "45р"));
        items.add(new Item("Арбуз", "170р"));
        return items;
    }


}
