package com.iab.omid.library.chartboost.internal;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public class C11034f {

    /* JADX INFO: renamed from: b */
    private static final Pattern f22986b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    private final List<C11033e> f22987a = new ArrayList();

    /* JADX INFO: renamed from: a */
    private void m23743a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23744a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f22986b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C11033e m23745b(View view) {
        for (C11033e c11033e : this.f22987a) {
            if (c11033e.m23741c().get() == view) {
                return c11033e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C11033e> m23746a() {
        return this.f22987a;
    }

    /* JADX INFO: renamed from: a */
    public void m23747a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        m23743a(view);
        m23744a(str);
        if (m23745b(view) == null) {
            this.f22987a.add(new C11033e(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23748b() {
        this.f22987a.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m23749c(View view) {
        m23743a(view);
        C11033e c11033eM23745b = m23745b(view);
        if (c11033eM23745b != null) {
            this.f22987a.remove(c11033eM23745b);
        }
    }
}
