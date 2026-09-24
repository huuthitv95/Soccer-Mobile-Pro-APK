package com.fyber.inneractive.sdk.activities;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ViewOnApplyWindowInsetsListenerC9168m;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveBaseActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public C7812b f17460a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        if (frameLayout != null && Build.VERSION.SDK_INT >= 35) {
            frameLayout.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC9168m());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            this.f17460a = new C7812b(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f17460a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (this.f17460a != null) {
                    getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f17460a);
                    this.f17460a = null;
                }
            } catch (Exception e) {
                IAlog.m21950f("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
            }
        }
    }
}
