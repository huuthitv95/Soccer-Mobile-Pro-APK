package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2726ri;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;

/* JADX INFO: loaded from: classes3.dex */
public class tan extends Dialog {

    /* JADX INFO: renamed from: lr */
    private static final String[] f8886lr = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};

    /* JADX INFO: renamed from: di */
    private ImageView f8887di;

    /* JADX INFO: renamed from: fi */
    private Button f8888fi;

    /* JADX INFO: renamed from: ik */
    private String f8889ik;

    /* JADX INFO: renamed from: ka */
    private TextView f8890ka;

    /* JADX INFO: renamed from: ri */
    private final Handler f8891ri;

    public tan(Context context) {
        super(context, C2729uq.m10301di(context, "tt_privacy_dialog_theme_ad_report"));
        this.f8891ri = new Handler(Looper.getMainLooper());
        this.f8889ik = "";
    }

    /* JADX INFO: renamed from: lr */
    private void m11433lr() {
        final String strM16435di = C3571ig.m16435di();
        final String strM16461mj = C3571ig.m16461mj();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.f8888fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tan.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) tan.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strM16435di, strM16461mj, str, str2, tan.this.f8889ik};
                    for (int i = 0; i < tan.f8886lr.length; i++) {
                        sb.append(tan.f8886lr[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.f8887di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.tan.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tan.this.f8890ka.setText("loading ...");
                tan.this.cancel();
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private int m11434ri(float f) {
        return C3583qd.m16589lr(getContext(), f);
    }

    /* JADX INFO: renamed from: ri */
    private View m11435ri(Context context) {
        C3191fi c3191fi = new C3191fi(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        c3191fi.setBackground(C3586sf.m16645ri(context, "tt_ad_report_info_bg"));
        c3191fi.setOrientation(1);
        c3191fi.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.p217di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.p217di.xha(context);
        xhaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, m11434ri(44.0f)));
        C3195mj c3195mj = new C3195mj(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m11434ri(191.0f), m11434ri(24.0f));
        layoutParams2.addRule(13);
        c3195mj.setGravity(17);
        c3195mj.setText("Ad Report");
        c3195mj.setTextColor(Color.parseColor("#161823"));
        c3195mj.setTextSize(1, 17.0f);
        c3195mj.setLayoutParams(layoutParams2);
        this.f8887di = new C3193ka(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(m11434ri(40.0f), m11434ri(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = m11434ri(8.0f);
        this.f8887di.setPadding(m11434ri(12.0f), m11434ri(14.0f), m11434ri(12.0f), m11434ri(14.0f));
        this.f8887di.setImageResource(C2729uq.m10305ka(context, "tt_ad_xmark"));
        this.f8887di.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, m11434ri(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = m11434ri(16.0f);
        layoutParams5.rightMargin = m11434ri(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(m11434ri(16.0f));
        layoutParams5.setMarginEnd(m11434ri(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        C3191fi c3191fi2 = new C3191fi(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        c3191fi2.setOrientation(1);
        c3191fi2.setLayoutParams(layoutParams6);
        String strM16435di = C3571ig.m16435di();
        String strM16461mj = C3571ig.m16461mj();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        C3191fi c3191fiM11436ri = m11436ri(context, "SDK version", BuildConfig.VERSION_NAME);
        C3191fi c3191fiM11436ri2 = m11436ri(context, "App", strM16435di);
        C3191fi c3191fiM11436ri3 = m11436ri(context, "App version", strM16461mj);
        C3191fi c3191fiM11436ri4 = m11436ri(context, "OS", str);
        C3191fi c3191fiM11436ri5 = m11436ri(context, "Device", str2);
        C3191fi c3191fiM11436ri6 = m11436ri(context, "Creative info", "loading ...");
        C3191fi c3191fi3 = new C3191fi(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, m11434ri(76.0f));
        c3191fi3.setBackgroundColor(-1);
        c3191fi3.setLayoutParams(layoutParams7);
        this.f8888fi = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iM11434ri = m11434ri(16.0f);
        layoutParams8.setMargins(iM11434ri, iM11434ri, iM11434ri, iM11434ri);
        this.f8888fi.setBackground(C3586sf.m16645ri(context, "tt_ad_report_info_button_bg"));
        this.f8888fi.setText("copy all");
        this.f8888fi.setTextColor(Color.parseColor("#333333"));
        this.f8888fi.setTextSize(14.0f);
        this.f8888fi.setLayoutParams(layoutParams8);
        c3191fi.addView(xhaVar);
        xhaVar.addView(c3195mj);
        xhaVar.addView(this.f8887di);
        c3191fi.addView(view);
        c3191fi.addView(scrollView);
        scrollView.addView(c3191fi2);
        c3191fi2.addView(c3191fiM11436ri);
        c3191fi2.addView(c3191fiM11436ri2);
        c3191fi2.addView(c3191fiM11436ri3);
        c3191fi2.addView(c3191fiM11436ri4);
        c3191fi2.addView(c3191fiM11436ri5);
        c3191fi2.addView(c3191fiM11436ri6);
        c3191fi.addView(c3191fi3);
        c3191fi3.addView(this.f8888fi);
        return c3191fi;
    }

    /* JADX INFO: renamed from: ri */
    private C3191fi m11436ri(Context context, String str, String str2) {
        C3191fi c3191fi = new C3191fi(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : m11434ri(74.0f));
        c3191fi.setOrientation(1);
        c3191fi.setPadding(0, m11434ri(16.0f), 0, m11434ri(16.0f));
        c3191fi.setLayoutParams(layoutParams);
        C3195mj c3195mj = new C3195mj(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = m11434ri(7.0f);
        c3195mj.setIncludeFontPadding(false);
        c3195mj.setText(str);
        c3195mj.setTextColor(Color.parseColor("#333333"));
        c3195mj.setTextSize(16.0f);
        c3195mj.setTypeface(Typeface.defaultFromStyle(1));
        c3195mj.setLayoutParams(layoutParams2);
        c3191fi.addView(c3195mj);
        C3195mj c3195mj2 = new C3195mj(context);
        if (str.equals("Creative info")) {
            this.f8890ka = c3195mj2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        c3195mj2.setIncludeFontPadding(false);
        c3195mj2.setTextColor(Color.parseColor("#666666"));
        c3195mj2.setText(str2);
        c3195mj2.setTextSize(14.0f);
        c3195mj2.setLayoutParams(layoutParams3);
        c3191fi.addView(c3195mj2);
        return c3191fi;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m11435ri(getContext()), new ViewGroup.LayoutParams(C3583qd.m16580ik(getContext()), (int) (((double) C3583qd.m16578fi(getContext())) * 0.9d)));
        m11433lr();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11439ri(wjv wjvVar) {
        try {
            this.f8889ik = C2726ri.m10278ri(wjvVar.m14421iq()).toString();
        } catch (Throwable th) {
            C2707ac.m10196ik("TTPrivacyAdReportDialog", th.getMessage());
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.f8891ri.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.tan.3
                @Override // java.lang.Runnable
                public void run() {
                    tan.this.f8890ka.setText(tan.this.f8889ik);
                }
            }, 1000L);
        } catch (Exception e) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e);
        }
    }
}
