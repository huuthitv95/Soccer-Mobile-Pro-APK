package com.mbridge.msdk.config.activity;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.hbisoft.hbrecorder.Constants;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13197f1;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: loaded from: classes5.dex */
public class BaseActivity extends Activity {

    /* JADX INFO: renamed from: a */
    C12705a f33796a;

    /* JADX INFO: renamed from: a */
    private void m34810a() {
        try {
            if (getIntent().getIntExtra("155", 0) != 1) {
                C13197f1.m37676b(getWindow());
                C13197f1.m37677c(getWindow());
            } else {
                C13197f1.m37675a(getWindow());
                C13197f1.m37678d(getWindow());
                C13197f1.m37677c(getWindow());
            }
        } catch (Exception e) {
            C13219q0.m37816b("BaseActivity", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m34811b() {
        if (getIntent().getIntExtra("154", 0) == 1) {
            getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#80000000")));
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        C12705a c12705a = this.f33796a;
        if (c12705a == null) {
            return;
        }
        c12705a.m34813a("onBackPressed");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m34811b();
        m34810a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C12705a c12705a = this.f33796a;
        if (c12705a == null) {
            return;
        }
        c12705a.m34813a("onDestroy");
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        C12705a c12705a = this.f33796a;
        if (c12705a == null) {
            return;
        }
        c12705a.m34813a("onPause");
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        C12705a c12705a = this.f33796a;
        if (c12705a == null) {
            return;
        }
        c12705a.m34813a("onReStart");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        C12705a c12705a = this.f33796a;
        if (c12705a == null) {
            return;
        }
        c12705a.m34813a("onResume");
        C13008c.m36588n().m36527a(this);
        if (getIntent().getIntExtra("155", 0) == 1) {
            C13197f1.m37675a(getWindow());
        } else {
            C13197f1.m37676b(getWindow());
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        C12705a c12705a = this.f33796a;
        if (c12705a == null) {
            return;
        }
        c12705a.m34813a(Constants.ON_START_KEY);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        C12705a c12705a = this.f33796a;
        if (c12705a == null) {
            return;
        }
        c12705a.m34813a("onStop");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (getIntent().getIntExtra("155", 0) == 1) {
            C13197f1.m37675a(getWindow());
        } else {
            C13197f1.m37676b(getWindow());
        }
    }
}
