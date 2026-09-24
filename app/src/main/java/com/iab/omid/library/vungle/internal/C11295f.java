package com.iab.omid.library.vungle.internal;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public class C11295f {

    /* JADX INFO: renamed from: b */
    private static final Pattern f23679b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    private final List<C11294e> f23680a = new ArrayList();

    /* JADX INFO: renamed from: a */
    private void m25022a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m25023a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f23679b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C11294e m25024b(View view) {
        for (C11294e c11294e : this.f23680a) {
            if (c11294e.m25020c().get() == view) {
                return c11294e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C11294e> m25025a() {
        return this.f23680a;
    }

    /* JADX INFO: renamed from: a */
    public void m25026a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        m25022a(view);
        m25023a(str);
        if (m25024b(view) == null) {
            this.f23680a.add(new C11294e(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25027b() {
        this.f23680a.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m25028c(View view) {
        m25022a(view);
        C11294e c11294eM25024b = m25024b(view);
        if (c11294eM25024b != null) {
            this.f23680a.remove(c11294eM25024b);
        }
    }
}
