package com.synyster.inairdemo.app;

import android.os.Bundle;

import com.synyster.inairdemo.app.modelview.AnotherModelView;

import inair.app.IABaseLayeredItem;

/**
 * Created by Synyster on 6/6/14.
 */
public class AnotherLayout extends IABaseLayeredItem {
  AnotherModelView anotherModelView;
  @Override
  public void onInitialize(Bundle savedInstanceState) {
    setRootContentView(R.layout.another_layout);
    anotherModelView = ((AnotherModelView) getDataContext());
  }
}
