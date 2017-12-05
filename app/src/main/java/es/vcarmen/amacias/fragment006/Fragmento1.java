package es.vcarmen.amacias.fragment006;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewFragment;

public class Fragmento1 extends WebViewFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = super.onCreateView( inflater, container, savedInstanceState );
        WebView navegador  = getWebView();

        navegador.setWebViewClient( new WebViewClient() );

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
