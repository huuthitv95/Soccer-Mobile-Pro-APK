package com.iab.omid.library.bytedance2;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.C10978a;
import com.iab.omid.library.bytedance2.internal.C10979b;
import com.iab.omid.library.bytedance2.internal.C10984g;
import com.iab.omid.library.bytedance2.internal.C10986i;
import com.iab.omid.library.bytedance2.utils.C10994a;
import com.iab.omid.library.bytedance2.utils.C10996c;
import com.iab.omid.library.bytedance2.utils.C10998e;
import com.iab.omid.library.bytedance2.utils.C11000g;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.b */
/* JADX INFO: loaded from: classes6.dex */
public class C10971b {

    /* JADX INFO: renamed from: a */
    private boolean f22821a;

    /* JADX INFO: renamed from: b */
    private void m23447b(Context context) {
        C11000g.m23601a(context, "Application Context cannot be null");
    }

    /* JADX INFO: renamed from: a */
    String m23448a() {
        return "1.4.12-Bytedance2";
    }

    /* JADX INFO: renamed from: a */
    void m23449a(Context context) {
        m23447b(context);
        if (m23451b()) {
            return;
        }
        m23450a(true);
        C10986i.m23524c().m23525a(context);
        C10979b.m23474g().m23486a(context);
        C10994a.m23564a(context);
        C10996c.m23572a(context);
        C10998e.m23595a(context);
        C10984g.m23503b().m23505a(context);
        C10978a.m23468a().m23470a(context);
    }

    /* JADX INFO: renamed from: a */
    void m23450a(boolean z) {
        this.f22821a = z;
    }

    /* JADX INFO: renamed from: b */
    boolean m23451b() {
        return this.f22821a;
    }

    /* JADX INFO: renamed from: c */
    void m23452c() {
        C11000g.m23598a();
        C10978a.m23468a().m23473d();
    }
}
