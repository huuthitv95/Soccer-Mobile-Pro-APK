package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public class C11188f {

    /* JADX INFO: renamed from: b */
    private static final Pattern f23391b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    private final List<C11187e> f23392a = new ArrayList();

    /* JADX INFO: renamed from: a */
    private void m24506a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24507a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f23391b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C11187e m24508b(View view) {
        for (C11187e c11187e : this.f23392a) {
            if (c11187e.m24504c().get() == view) {
                return c11187e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C11187e> m24509a() {
        return this.f23392a;
    }

    /* JADX INFO: renamed from: a */
    public void m24510a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        m24506a(view);
        m24507a(str);
        if (m24508b(view) == null) {
            this.f23392a.add(new C11187e(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24511b() {
        this.f23392a.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m24512c(View view) {
        m24506a(view);
        C11187e c11187eM24508b = m24508b(view);
        if (c11187eM24508b != null) {
            this.f23392a.remove(c11187eM24508b);
        }
    }
}
