package id.londry.londryid;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.KeyEvent;
import android.widget.ImageButton;

public class Gosok extends AppCompatActivity {

    ImageButton btnHome, btnJasa, btnPesan, btnKami;
    WebView mWebView;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jasagosok);

        mWebView = (WebView)findViewById(R.id.tablighweb);

        mWebView.setWebViewClient(new Gosok.myWebclient());
        webSettings = mWebView.getSettings();

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("http://londry.id/HanyaGosok.html");

        btnHome = (ImageButton)findViewById(R.id.btnHome);
        btnJasa = (ImageButton)findViewById(R.id.btnJasa);
        btnPesan = (ImageButton)findViewById(R.id.btnPesan);
        btnKami = (ImageButton) findViewById(R.id.btnKami);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHome = new Intent(Gosok.this, MainActivity.class);
                Gosok.this.startActivity(intentHome);
                Gosok.this.finish();
            }
        });

        btnJasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentJasa = new Intent(Gosok.this, JasaActivity.class);
                Gosok.this.startActivity(intentJasa);
                Gosok.this.finish();
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
                Intent intentKami = new Intent(Gosok.this, Kami.class);
                Gosok.this.startActivity(intentKami);
                Gosok.this.finish();
            }
        });

    }

    public class myWebclient extends WebViewClient{
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);

    }
}
