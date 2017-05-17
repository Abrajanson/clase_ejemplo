package com.jcodee.mod1class6;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jcodee.mod1class6.adapters.FotoAdapter;
import com.jcodee.mod1class6.views.ZoomOutPageTransformer;

import static com.jcodee.mod1class6.R.id.viewPager;

public class DetalleActivity extends AppCompatActivity {
private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
    }

    @Override
    protected void onResume() {
        super.onResume();
        FotoAdapter fotoAdapter = new FotoAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fotoAdapter);
        viewPager.setPageTransformer(false, new ZoomOutPageTransformer());


        if(getIntent() != null){
            if (getIntent().hasExtra("posicion")){
                int posicion = getIntent().getIntExtra("posicion", -1);
                viewPager.setCurrentItem(posicion);
            }
        }


    }
}
