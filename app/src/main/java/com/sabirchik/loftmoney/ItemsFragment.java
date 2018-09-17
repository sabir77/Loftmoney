package com.sabirchik.loftmoney;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ItemsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ItemsFragment extends Fragment {
    private static final String TAG = "ItemsFragment";

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
    private Api api;
    private String type;


    public static ItemsFragment newInstance(String param1, String param2) {
        ItemsFragment fragment = new ItemsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate:");
        api = ((App) Objects.requireNonNull(getActivity()).getApplication()).getApi();
        adapter = new ItemsAdapter();
        Bundle bundle = getArguments();
        if (bundle != null) {
            type = bundle.getString(KEY_TYPE, Item.TYPE_UNKNOWN);
        }
        loadItems();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView:");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onViewCreated:");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));


    }

    @Override
    public void onDestroyView() {
        Log.i(TAG, "onDestroyView:");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy:");
        super.onDestroy();

    }

    private void loadItems() {
        Call<List<Item>> call = api.getItems(type);
        call.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(@NonNull Call<List<Item>> call, @NonNull Response<List<Item>> response) {
                adapter.setItems(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<List<Item>> call, @NonNull Throwable t) {

            }
        });

    }


}
