package id.londry.londryid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class JasaActivity extends AppCompatActivity {

    ImageButton btnHome, btnJasa, btnPesan, btnKami;
    ImageButton BtnKiloan, BtnSatuan, BtnEkspres, BtnCuci, BtnGosok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jasa);

        btnHome = (ImageButton)findViewById(R.id.btnHome);
        btnJasa = (ImageButton)findViewById(R.id.btnJasa);
        btnPesan = (ImageButton)findViewById(R.id.btnPesan);
        btnKami = (ImageButton)findViewById(R.id.btnKami);

        BtnKiloan = (ImageButton)findViewById(R.id.BtnKiloan);
        BtnSatuan = (ImageButton)findViewById(R.id.BtnSatuan);
        BtnEkspres = (ImageButton)findViewById(R.id.BtnEkspres);
        BtnCuci = (ImageButton)findViewById(R.id.BtnCuci);
        BtnGosok = (ImageButton)findViewById(R.id.BtnGosok);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHome = new Intent(JasaActivity.this, MainActivity.class);
                JasaActivity.this.startActivity(intentHome);
                JasaActivity.this.finish();
            }
        });

        btnJasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentJasa = new Intent(JasaActivity.this, JasaActivity.class);
                JasaActivity.this.startActivity(intentJasa);
                JasaActivity.this.finish();
            }
        });

        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "whatsapp://send?phone=6281373649230&text=Halo%20Admin%2C%20Saya%20ingin%20Jasa%20Londry%20%3A)";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        btnKami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentKami = new Intent(JasaActivity.this, Kami.class);
                JasaActivity.this.startActivity(intentKami);
                JasaActivity.this.finish();
            }
        });


        BtnKiloan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentKiloan = new Intent(JasaActivity.this, Kiloan.class);
                JasaActivity.this.startActivity(intentKiloan);
                JasaActivity.this.finish();
            }
        });

        BtnSatuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSatuan = new Intent(JasaActivity.this, Satuan.class);
                JasaActivity.this.startActivity(intentSatuan);
                JasaActivity.this.finish();
            }
        });

        BtnEkspres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEkspres = new Intent(JasaActivity.this, Ekspres.class);
                JasaActivity.this.startActivity(intentEkspres);
                JasaActivity.this.finish();
            }
        });

        BtnCuci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCuci = new Intent(JasaActivity.this, Cuci.class);
                JasaActivity.this.startActivity(intentCuci);
                JasaActivity.this.finish();
            }
        });

        BtnGosok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGosok = new Intent(JasaActivity.this, Gosok.class);
                JasaActivity.this.startActivity(intentGosok);
                JasaActivity.this.finish();
            }
        });

    }

}
