package com.jcodee.mod1class6.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.jcodee.mod1class6.MainActivity;
import com.jcodee.mod1class6.fragmentos.FotoFragment;

/**
 * Created by alumno on 16/05/17.
 */

public class FotoAdapter extends FragmentStatePagerAdapter{
public FotoAdapter(FragmentManager fm) {
    super (fm);
}
@Override
public Fragment getItem (int position){
    FotoFragment fragment = new FotoFragment();
    Bundle bundle = new Bundle();
    bundle.putInt("posicion", position);
    fragment.setArguments(bundle);
    return fragment;
}

    @Override
    public int getCount() {
        return MainActivity.listaFotos.size();
    }
}

