package com.synyster.inairdemo.app.modelview;

import android.graphics.drawable.BitmapDrawable;

import com.synyster.inairdemo.app.R;

import inair.data.ViewModel;

/**
 * Created by Synyster on 6/6/14.
 */
public class AnotherModelView extends ViewModel {
  private String layerTitle = "";
  private String bindingText = "";

  public BitmapDrawable getBindingImage() {
    return bindingImage;
  }

  public void setBindingImage(BitmapDrawable bindingImage) {
    this.bindingImage = bindingImage;
  }

  private BitmapDrawable bindingImage;


  public String getLayerTitle() {
    return layerTitle;
  }

  public void setLayerTitle(String layerTitle) {
    this.layerTitle = layerTitle;
    notifyPropertyChanged("layerTitle");
  }

  public String getBindingText() {
    return bindingText;
  }

  public void setBindingText(String bindingText) {
    this.bindingText = bindingText;
    notifyPropertyChanged("bindingText");
  }


  public AnotherModelView() {
    setLayerTitle("InAiR");
    setBindingText("InAiR - This is the second layer screen");
    setBindingImage(((BitmapDrawable) resources.getDrawable(R.drawable.logo2d3d)));
  }
}
