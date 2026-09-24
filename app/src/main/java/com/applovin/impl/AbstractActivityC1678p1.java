package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.C1846R;

/* JADX INFO: renamed from: com.applovin.impl.p1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1678p1 extends Activity {

    /* JADX INFO: renamed from: a */
    private C1705r1 f2510a;

    /* JADX INFO: renamed from: b */
    private C1748l f2511b;

    /* JADX INFO: renamed from: c */
    private TextView f2512c;

    /* JADX INFO: renamed from: d */
    private Button f2513d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3833a(View view) {
        this.f2511b.m4866z().m2557a(this.f2510a, (Context) this, true);
    }

    /* JADX INFO: renamed from: a */
    private boolean m3834a() {
        return (this.f2510a == null || this.f2511b == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private void m3835b() {
        C1811x2 c1811x2 = new C1811x2();
        c1811x2.m5570a(this.f2511b.m4866z().m2555a(this.f2510a));
        String strM2558b = this.f2511b.m4866z().m2558b(this.f2510a);
        if (strM2558b != null) {
            c1811x2.m5570a("\nBid Response Preview:\n");
            c1811x2.m5570a(strM2558b);
        }
        TextView textView = (TextView) findViewById(C1846R.id.email_report_tv);
        this.f2512c = textView;
        textView.setText(c1811x2.toString());
        this.f2512c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* JADX INFO: renamed from: a */
    public void m3836a(C1705r1 c1705r1, C1748l c1748l) {
        this.f2510a = c1705r1;
        this.f2511b = c1748l;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m3834a()) {
            finish();
            return;
        }
        setTitle(this.f2510a.m4161d() + " - " + this.f2510a.m4163f());
        setContentView(C1846R.layout.creative_debugger_displayed_ad_detail_activity);
        m3835b();
        AbstractC1564g8.m2754a(findViewById(R.id.content), this.f2511b);
        Button button = (Button) findViewById(C1846R.id.report_ad_button);
        this.f2513d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.p1$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m3833a(view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1846R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!m3834a()) {
            finish();
            return false;
        }
        if (C1846R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f2511b.m4866z().m2557a(this.f2510a, (Context) this, false);
        return true;
    }
}
