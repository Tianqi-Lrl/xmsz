package com.bawei.test1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Time:2019/11/30
 * Author:天祈Aa
 * Description:
 */
public class OtherFragment extends Fragment {

    private TextView name;
    private TextView name1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.other, null);

        name1 = view.findViewById(R.id.name);
        String key = getArguments().getString("key");
        name1.setText(key);

        return view;
    }

    public static OtherFragment getInstance(String value) {
        Bundle bundle = new Bundle();
        bundle.putString("key",value);
        OtherFragment otherFragment = new OtherFragment();
        otherFragment.setArguments(bundle);
        return otherFragment;
    }
}
