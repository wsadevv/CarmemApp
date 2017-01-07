package com.wsadevv.carmemapp.core.fragments;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.TimePicker;

import com.wsadevv.carmemapp.R;

/**
 * Created by wsadevv on 05/12/16.
 */
public  class TimePickerFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //abre o relógio com o horário padrão do sistema no momento
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        //retorna um novo timepicker com os valores selecionados
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }
    //quando o valor for escolhido, esse método define o que fazer
    @Override
    public void onTimeSet(TimePicker timePicker, int hora, int minuto) {
        Button button = (Button) getActivity().findViewById(R.id.btnHoraID);
        button.setText(hora+":"+minuto);
    }
}