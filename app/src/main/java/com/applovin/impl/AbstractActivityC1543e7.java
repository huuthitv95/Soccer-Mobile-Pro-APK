package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.C1846R;

/* JADX INFO: renamed from: com.applovin.impl.e7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1543e7 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1748l f1432a;

    /* JADX INFO: renamed from: b */
    private String f1433b;

    /* JADX INFO: renamed from: c */
    private String f1434c;

    /* JADX INFO: renamed from: a */
    private void m2510a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", this.f1434c);
        intent.putExtra("android.intent.extra.TITLE", this.f1433b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f1433b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f1432a;
    }

    public void initialize(String str, String str2, C1748l c1748l) {
        this.f1432a = c1748l;
        this.f1433b = str;
        this.f1434c = str2;
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1846R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f1433b);
        ((TextView) findViewById(C1846R.id.textView)).setText(this.f1434c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1846R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C1846R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        m2510a();
        return true;
    }
}
