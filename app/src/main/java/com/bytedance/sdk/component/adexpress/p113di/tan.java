package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2729uq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tan extends C2381nr {

    /* JADX INFO: renamed from: ri */
    private TextView f6382ri;

    public tan(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.p113di.C2381nr
    /* JADX INFO: renamed from: ri */
    protected void mo8250ri(Context context, View view) {
        addView(view);
        this.f6382ri = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.p113di.C2381nr
    public void setShakeText(String str) {
        if (this.f6382ri == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f6382ri.setText(str);
            return;
        }
        try {
            this.f6382ri.setText(C2729uq.m10307lr(this.f6382ri.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
