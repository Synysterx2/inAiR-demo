package com.synyster.inairdemo.app;

import android.os.Bundle;

import com.synyster.inairdemo.app.modelview.MainModelView;

import inair.app.IABaseLayeredItem;
import inair.app.IABaseLayout;
import inair.app.IAChildLayout;

/**
 * Created by Synyster on 6/6/14.
 */
public class MainLayout extends IABaseLayeredItem {
  @Override
  public void onInitialize(Bundle savedInstanceState) {
    setRootContentView(R.layout.main_layout);
  }
}
