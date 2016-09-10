package id.sch.smktelkom_mlg.tugas01.xirpl5027.tugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Spinner spKls;
    RadioButton Lk, Pr;
    CheckBox P, PS, SBA, Padsu;
    Button bOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        spKls = (Spinner) findViewById(R.id.spinnerKls);
        Lk = (RadioButton) findViewById(R.id.radioButtonLaki);
        Pr = (RadioButton) findViewById(R.id.radioButtonPerem);
        P = (CheckBox) findViewById(R.id.checkBoxPram);
        PS = (CheckBox) findViewById(R.id.checkBoxPencak);
        SBA = (CheckBox) findViewById(R.id.checkBoxSeni);
        Padsu = (CheckBox) findViewById(R.id.checkBoxPaduan);
        bOk = (Button) findViewById(R.id.buttonOK);


    }
}
