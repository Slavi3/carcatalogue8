package com.example.stan.carcatalogue8;

import com.example.stan.carcatalogue8.diconfig.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class AndroidApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}