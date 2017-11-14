package com.cxz.examples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import com.cxz.paletteimageview.PaletteImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PaletteImageViewActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    @BindView(R.id.palette)
    PaletteImageView paletteImageView;
    @BindView(R.id.seek1)
    SeekBar seekBar1;
    @BindView(R.id.seek2)
    SeekBar seekBar2;
    @BindView(R.id.seek3)
    SeekBar seekBar3;
    @BindView(R.id.seek4)
    SeekBar seekBar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette_image_view);

        ButterKnife.bind(this);

        setListener();

    }

    private void setListener() {
        seekBar1.setOnSeekBarChangeListener(this);
        seekBar2.setOnSeekBarChangeListener(this);
        seekBar3.setOnSeekBarChangeListener(this);
        seekBar4.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        show(seekBar, progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    private void show(SeekBar seekBar, int progress) {
        switch (seekBar.getId()) {
            case R.id.seek1:
                paletteImageView.setPaletteRadius(progress);
                break;
            case R.id.seek2:
                paletteImageView.setPaletteShadowRadius(progress);
                break;
            case R.id.seek3:
                paletteImageView.setPaletteShadowOffset(progress, 0);
                break;
            case R.id.seek4:
                paletteImageView.setPaletteShadowOffset(0, progress);
                break;
        }
    }

}
