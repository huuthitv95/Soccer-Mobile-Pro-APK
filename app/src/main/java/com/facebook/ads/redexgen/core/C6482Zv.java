package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6482Zv extends LinearLayout {
    public static final int A03 = (int) (AbstractC6334XX.A02 * 40.0f);
    public static final int A04 = (int) (AbstractC6334XX.A02 * 20.0f);
    public static final int A05 = (int) (AbstractC6334XX.A02 * 10.0f);
    public final C5800Ok A00;
    public final C6902gi A01;
    public final InterfaceC6466Zf A02;

    public C6482Zv(C6902gi c6902gi, C5800Ok c5800Ok, InterfaceC6466Zf interfaceC6466Zf, EnumC6385YM enumC6385YM) {
        this(c6902gi, c5800Ok, interfaceC6466Zf, null, enumC6385YM);
    }

    public C6482Zv(C6902gi c6902gi, C5800Ok c5800Ok, InterfaceC6466Zf interfaceC6466Zf, String str, EnumC6385YM enumC6385YM) {
        super(c6902gi);
        this.A01 = c6902gi;
        this.A00 = c5800Ok;
        this.A02 = interfaceC6466Zf;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            AbstractC6374YB.A0N(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View viewA00 = A00(enumC6385YM, this.A00.A03());
            viewA00.setPadding(0, A05, 0, A05);
            addView(viewA00, layoutParams);
        }
        C6488a1 c6488a1A03 = A03();
        c6488a1A03.setPadding(0, A05, 0, 0);
        addView(c6488a1A03, layoutParams);
    }

    private View A00(EnumC6385YM enumC6385YM, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(AbstractC6386YN.A01(enumC6385YM));
        TextView textView = new TextView(getContext());
        AbstractC6374YB.A0a(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new ViewOnClickListenerC6480Zt(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        AbstractC6374YB.A0a(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C6488a1 A03() {
        C6488a1 c6488a1 = new C6488a1(this.A01);
        for (C5800Ok c5800Ok : this.A00.A05()) {
            C6468Zh c6468Zh = new C6468Zh(this.A01);
            c6468Zh.setData(c5800Ok.A04(), null);
            c6468Zh.setOnClickListener(new ViewOnClickListenerC6481Zu(this, c6468Zh, c5800Ok));
            c6488a1.addView(c6468Zh);
        }
        return c6488a1;
    }
}
