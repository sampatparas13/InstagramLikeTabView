package com.imsp.instagramliketabview.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;


public class BaseFragment extends Fragment {
    public BaseActivity mActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = (BaseActivity) this.getActivity();
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
}
