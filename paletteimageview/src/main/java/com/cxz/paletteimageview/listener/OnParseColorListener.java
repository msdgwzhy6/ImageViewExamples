package com.cxz.paletteimageview.listener;

import com.cxz.paletteimageview.PaletteImageView;

/**
 * Created by chenxz on 2017/11/8.
 */

public interface OnParseColorListener {

    void onComplete(PaletteImageView paletteImageView);
    void onFail();

}
