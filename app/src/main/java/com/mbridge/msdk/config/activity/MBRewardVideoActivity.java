package com.mbridge.msdk.config.activity;

import android.os.Bundle;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.C13203i0;

/* JADX INFO: loaded from: classes5.dex */
public class MBRewardVideoActivity extends BaseActivity {

    /* JADX INFO: renamed from: b */
    ViewGroup f33797b;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.activity.BaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(C13203i0.m37707a(getApplicationContext(), "mbridge_activity", "layout"), (ViewGroup) null);
        this.f33797b = viewGroup;
        setContentView(viewGroup);
        this.f33796a = new C12705a(this, this.f33797b);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
