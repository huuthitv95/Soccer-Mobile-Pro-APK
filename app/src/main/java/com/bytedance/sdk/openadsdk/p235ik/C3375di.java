package com.bytedance.sdk.openadsdk.p235ik;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3375di extends ScrollView {

    /* JADX INFO: renamed from: lr */
    private final C3191fi f12000lr;

    /* JADX INFO: renamed from: ri */
    private final C3386qt f12001ri;

    public C3375di(Context context, C3386qt c3386qt) {
        super(context);
        this.f12001ri = c3386qt;
        C3191fi c3191fi = new C3191fi(context);
        this.f12000lr = c3191fi;
        c3191fi.setOrientation(1);
        addView(c3191fi, new FrameLayout.LayoutParams(-1, -2));
        if (c3386qt.m15325mj() == 0) {
            m15277ri();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    /* JADX INFO: renamed from: ik */
    private static List<FilterWord> m15275ik(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3).hasSecondOptions()) {
                i2 = i3;
            }
        }
        if (i2 != -1 && i2 <= list.size()) {
            i = i2;
        }
        FilterWord filterWord = list.get(i);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: lr */
    private void m15276lr(List<FilterWord> list) {
        this.f12000lr.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                this.f12000lr.addView(new xha(getContext(), filterWord, this.f12001ri));
            }
            if (i < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iM16589lr = C3583qd.m16589lr(getContext(), this.f12001ri.jbs() ? 16.0f : 8.0f);
                layoutParams.topMargin = iM16589lr;
                layoutParams.bottomMargin = iM16589lr;
                this.f12000lr.addView(new C3388sf(getContext()), layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m15277ri() {
        if (this.f12001ri.m15325mj() != 0) {
            return;
        }
        this.f12001ri.m15327ri(C3583qd.m16580ik(getContext()), C3583qd.m16578fi(getContext()));
    }

    /* JADX INFO: renamed from: ri */
    public void m15278ri(List<FilterWord> list) {
        List<FilterWord> listM15275ik = m15275ik(list);
        if (listM15275ik == null) {
            return;
        }
        m15276lr(listM15275ik);
    }
}
