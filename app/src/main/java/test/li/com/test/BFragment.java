package test.li.com.test;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 2016/11/24.
 */

public class BFragment extends Fragment {

    public static BFragment getInstance(){
        Bundle bundle = new Bundle();

        BFragment fragment = new BFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.b_fargment, container, false);
        layoutContentView(view);
        return view;
    }

    public void layoutContentView(View contentView){

    }
}
