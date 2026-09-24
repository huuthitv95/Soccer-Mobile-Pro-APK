package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public class C11137f {

    /* JADX INFO: renamed from: b */
    private static final Pattern f23256b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    private final List<C11136e> f23257a = new ArrayList();

    /* JADX INFO: renamed from: a */
    private void m24253a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m24254a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f23256b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private C11136e m24255b(View view) {
        for (C11136e c11136e : this.f23257a) {
            if (c11136e.m24251c().get() == view) {
                return c11136e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C11136e> m24256a() {
        return this.f23257a;
    }

    /* JADX INFO: renamed from: a */
    public void m24257a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        m24253a(view);
        m24254a(str);
        if (m24255b(view) == null) {
            this.f23257a.add(new C11136e(view, friendlyObstructionPurpose, str));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24258b() {
        this.f23257a.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m24259c(View view) {
        m24253a(view);
        C11136e c11136eM24255b = m24255b(view);
        if (c11136eM24255b != null) {
            this.f23257a.remove(c11136eM24255b);
        }
    }
}
