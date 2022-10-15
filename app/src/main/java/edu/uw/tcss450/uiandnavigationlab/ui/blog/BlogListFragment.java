package edu.uw.tcss450.uiandnavigationlab.ui.blog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.uiandnavigationlab.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlogListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlogListFragment extends Fragment {


    public BlogListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blog_list, container, false);
    }
}