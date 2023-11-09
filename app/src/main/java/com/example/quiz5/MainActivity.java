package com.example.quiz5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.quiz5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    private String girilenDegerler = "";
    private String defaultDeger = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

// Tüm butonları tanımlayıp tıklanma işleminde textView a yazdırıyoruz.
        binding.button0.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"0"); // defaultDeger : girdiğimiz sayıları yan yana görmemizi sağlayacak
            defaultDeger = binding.textView.getText().toString();// click sonunda defaultDeger güncellenmeli
        });

        binding.button1.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"1");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.button2.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"2");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.button3.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"3");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.button4.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"4");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.button5.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"5");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.button6.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"6");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.button7.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"7");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.button8.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"8");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.button9.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"9");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.buttonTopla.setOnClickListener(v -> {
            binding.textView.setText(defaultDeger+"+");
            defaultDeger = binding.textView.getText().toString();
        });

        binding.buttonClear.setOnClickListener(v -> {
            binding.textView.setText(""); //CLEAR işlevinde textView i boş setliyoruz ardından default değerimizide textView e eşitleyip onuda sıfırlamış oluyoruz
            defaultDeger = binding.textView.getText().toString();



        });

        binding.buttonEsittir.setOnClickListener(v -> {

        defaultDeger = binding.textView.getText().toString();

        String[] dizi = defaultDeger.split("\\+");

        //if koşulu ile 2 sayıdan fazla girilmesini engelledik
        if(dizi.length >2){
            Toast.makeText(this, "Lütfen sadece 2 sayıyı toplayın", Toast.LENGTH_SHORT).show();
        }else {
            int sayi1 = Integer.parseInt(dizi[0]);
            int sayi2 = Integer.parseInt(dizi[1]);
            int toplam = sayi1 + sayi2;
            binding.textView.setText(String.valueOf(toplam));

        }

        });

    }
}