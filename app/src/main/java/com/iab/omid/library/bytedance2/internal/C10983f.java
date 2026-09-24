package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public class C10983f {

    /* JADX INFO: renamed from: b */
    private static final Pattern f22851b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    private final List<C10982e> f22852a = new ArrayList();

    /* JADX INFO: renamed from: a */
    private void m23496a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23497a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f22851b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C10982e m23498b(View view) {
        for (C10982e c10982e : this.f22852a) {
            if (c10982e.m23494c().get() == view) {
                return c10982e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C10982e> m23499a() {
        return this.f22852a;
    }

    /* JADX INFO: renamed from: a */
    public void m23500a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        m23496a(view);
        m23497a(str);
        if (m23498b(view) == null) {
            this.f22852a.add(new C10982e(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23501b() {
        this.f22852a.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m23502c(View view) {
        m23496a(view);
        C10982e c10982eM23498b = m23498b(view);
        if (c10982eM23498b != null) {
            this.f22852a.remove(c10982eM23498b);
        }
    }
}
