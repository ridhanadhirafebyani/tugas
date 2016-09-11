package id.sch.smktelkom_mlg.tugas01.xirpl5027.tugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Spinner spKls;
    RadioGroup rgStatus;
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
        rgStatus = (RadioGroup) findViewById(R.id.rgStatus);
        Lk = (RadioButton) findViewById(R.id.radioButtonLaki);
        Pr = (RadioButton) findViewById(R.id.radioButtonPerem);
        P = (CheckBox) findViewById(R.id.checkBoxPram);
        PS = (CheckBox) findViewById(R.id.checkBoxPencak);
        SBA = (CheckBox) findViewById(R.id.checkBoxSeni);
        Padsu = (CheckBox) findViewById(R.id.checkBoxPaduan);
        bOk = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

//        rgStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//
//            }
//        });

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String nama = etNama.getText().toString();
//                String kelas=spKls.getSelectedItem().toString();
//                String hasilrb =null;
//
//                if(rgStatus.getCheckedRadioButtonId()!=-1){
//                    RadioButton rb = (RadioButton) findViewById(rgStatus.getCheckedRadioButtonId());
//                    hasilrb = rb.getText().toString();
//                }

//                tvHasil.setText("Data Anda sudah tersimpan" + "\n\n"
//                +"Nama : "+nama+"\n"+ "Kelas : "+kelas+"\n"+"Jenis Kelamin : "+ hasilrb+"\n");

                doClick();

            }
        });
    }

    private void doClick() {
        String nama = etNama.getText().toString();
        String hasil = null;
        String hasilcb = "\n Ekstrakulikuler yang dipilih : ";
        int startlen = hasilcb.length();

        if (isValid()) {
            if (rgStatus.getCheckedRadioButtonId() != -1) {
                RadioButton rb = (RadioButton) findViewById(rgStatus.getCheckedRadioButtonId());
                hasil = rb.getText().toString();
            }
            if (hasil == null) {
                tvHasil.setText("Jenis Kelamin belum diisi");
            } else {
                if (P.isChecked()) hasilcb += P.getText() + "\n";
                if (PS.isChecked()) hasilcb += PS.getText() + "\n";
                if (SBA.isChecked()) hasilcb += SBA.getText() + "\n";
                if (Padsu.isChecked()) hasilcb += Padsu.getText() + "\n";
                if (hasilcb.length() == startlen) hasilcb += "Tidak ada pilihan";

                tvHasil.setText("Data Anda \n" +
                        "Nama : " + nama + "\nKelas" + spKls.getSelectedItem().toString() + "\n\nJenis Kelamin : " + hasil + "\n" + hasilcb);
            }
        }
    }

    private boolean isValid() {
        boolean valid = true;
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
        return valid;
    }


    //    private void doProcess() {
//        if (isValid()) {
//        }
//    }
//    private boolean isValid() {
//
//        boolean valid = true;
//        String nama = etNama.getText().toString();
//        String hasilrb = null;
//
//        if (nama.isEmpty()) {
//            etNama.setError("Nama belum diisi");
//            valid = false;
//        } else if (nama.length() < 3) {
//            etNama.setError("Nama minimal 3 karakter");
//            valid = false;
//        } else{
//            etNama.setError(null);
//        }
//
//
//
//        if(Lk.isChecked()){
//            hasilrb=Lk.getText().toString();
//        }
//        else if (Pr.isChecked()){
//            hasilrb=Pr.getText().toString();
//        }
//        if(hasilrb==null){
//            tvHasil.setText("Belum memilih Jenis Kelamin");
//        }
//        else{
//            tvHasil.setText("Jenis Kelamin : "+hasilrb);
//        }
//
//
//        return valid;
//    }
}
