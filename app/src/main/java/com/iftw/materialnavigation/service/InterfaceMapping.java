package com.iftw.materialnavigation.service;

import com.iftw.materialnavigation.HealthIssueFragment;

/**
 * Created by Petronela on 4/11/2015.
 */
public class InterfaceMapping {
    private static InterfaceMapping instance;
    private HealthIssueFragment fragment;

    private InterfaceMapping() {

    }

    public static InterfaceMapping getInstance() {
        if (instance == null)
            instance = new InterfaceMapping();
        return instance;
    }

    public void setFragment(HealthIssueFragment fragment) {
        this.fragment = fragment;
    }

    public HealthIssueFragment getFragment() {
        return fragment;
    }
}
