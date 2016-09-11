package id.sch.smktelkom_mlg.tugas01.xirpl5027.tugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Spinner spKls;
    RadioButton Lk, Pr;
    CheckBox P, PS, SBA, Padsu;
    Button bOk;
    TextView tvHasil;

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
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doProcess();
            }
        });
    }

    private void doProcess() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            tvHasil.setText("Data Anda sudah tersimpan" + "\n\n" + "Nama : " + nama);

        }
    }

    private boolean isValid() {

        boolean valid = true;
        String hasil = null;
        String nama = etNama.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama belum diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }
        if (Lk.isChecked()) {
            hasil = Lk.getText().toString();
        } else if (Pr.isChecked()) {
            hasil = Pr.getText().toString();
        }
        if (hasil == null) {
            tvHasil.setText("Belum memilih Jenis Kelamin");
        } else {
            tvHasil.setText("Jenis Kelamin" + hasil);
        }

        return valid;
    }
}
