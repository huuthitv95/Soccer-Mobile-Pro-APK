package com.iab.omid.library.fyber.internal;

import android.view.View;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public class C11086f {

    /* JADX INFO: renamed from: b */
    private static final Pattern f23121b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    private final List<C11085e> f23122a = new ArrayList();

    /* JADX INFO: renamed from: a */
    private void m24000a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24001a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f23121b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C11085e m24002b(View view) {
        for (C11085e c11085e : this.f23122a) {
            if (c11085e.m23998c().get() == view) {
                return c11085e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C11085e> m24003a() {
        return this.f23122a;
    }

    /* JADX INFO: renamed from: a */
    public void m24004a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        m24000a(view);
        m24001a(str);
        if (m24002b(view) == null) {
            this.f23122a.add(new C11085e(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24005b() {
        this.f23122a.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m24006c(View view) {
        m24000a(view);
        C11085e c11085eM24002b = m24002b(view);
        if (c11085eM24002b != null) {
            this.f23122a.remove(c11085eM24002b);
        }
    }
}
