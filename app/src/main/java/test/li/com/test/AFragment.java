package test.li.com.test;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/11/24.
 */

public class AFragment extends Fragment {

    public static AFragment getInstance() {
        Bundle bundle = new Bundle();

        AFragment fragment = new AFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.a_fargment, container, false);
        layoutContentView(view);
        return view;
    }

    public void layoutContentView(View contentView) {
        RecyclerView recyclerView = (RecyclerView) contentView.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new RecyclerViewAdapter(generateList()));
        recyclerView.setLayoutManager(new LinearLayoutManager(contentView.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
    }

    private List<String> generateList() {
        List<String> list = new ArrayList<>();
        for(int i = 1;i <= 100;i++){
            list.add(String.valueOf(i));
        }
        return list;
    }

    public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder>{

        private List<String> list;

        public RecyclerViewAdapter(List<String> list) {
            this.list = list;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.textView.setText(list.get(position));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item_textView);
        }
    }
}
