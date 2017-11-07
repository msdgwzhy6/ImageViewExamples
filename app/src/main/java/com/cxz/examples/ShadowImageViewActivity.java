package com.cxz.examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import com.cxz.shadowimageview.ShadowImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShadowImageViewActivity extends AppCompatActivity {

    @BindView(R.id.seekbar)
    SeekBar seekBar;

    @BindView(R.id.iv_shadow)
    ShadowImageView iv_shadow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shadow_image_view);

        ButterKnife.bind(this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                iv_shadow.setImageRadius(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}
