package com.example.stan.carcatalogue8.diconfig;

import com.example.stan.carcatalogue8.views.CarsList.CarsListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector()
    abstract CarsListActivity carsListActivity();


}