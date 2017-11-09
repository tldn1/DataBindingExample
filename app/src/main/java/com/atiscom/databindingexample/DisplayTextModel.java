package com.atiscom.databindingexample;

import android.databinding.ObservableField;

import java.util.Observable;

/**
 * Created by Mico on 11/9/2017.
 */

public class DisplayTextModel {
    public final ObservableField<String> editText = new ObservableField<>();
    public final ObservableField<String> textView = new ObservableField<>();


}
