package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public class C10932f {

    /* JADX INFO: renamed from: b */
    private static final Pattern f22716b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    private final List<C10931e> f22717a = new ArrayList();

    /* JADX INFO: renamed from: a */
    private void m23243a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23244a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f22716b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C10931e m23245b(View view) {
        for (C10931e c10931e : this.f22717a) {
            if (c10931e.m23241c().get() == view) {
                return c10931e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C10931e> m23246a() {
        return this.f22717a;
    }

    /* JADX INFO: renamed from: a */
    public void m23247a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        m23243a(view);
        m23244a(str);
        if (m23245b(view) == null) {
            this.f22717a.add(new C10931e(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23248b() {
        this.f22717a.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m23249c(View view) {
        m23243a(view);
        C10931e c10931eM23245b = m23245b(view);
        if (c10931eM23245b != null) {
            this.f22717a.remove(c10931eM23245b);
        }
    }
}
