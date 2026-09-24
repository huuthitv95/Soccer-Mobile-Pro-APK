package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10116o;
import com.google.android.play.core.assetpacks.model.C10133b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.de */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10034de {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22244a = new C10116o("ExtractorSessionStoreView");

    /* JADX INFO: renamed from: b */
    private final C9983bh f22245b;

    /* JADX INFO: renamed from: c */
    private final C10017co f22246c;

    /* JADX INFO: renamed from: d */
    private final Map f22247d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final ReentrantLock f22248e = new ReentrantLock();

    /* JADX INFO: renamed from: f */
    private final C10097aq f22249f;

    /* JADX INFO: renamed from: g */
    private final C10097aq f22250g;

    C10034de(C9983bh c9983bh, C10097aq c10097aq, C10017co c10017co, C10097aq c10097aq2) {
        this.f22245b = c9983bh;
        this.f22249f = c10097aq;
        this.f22246c = c10017co;
        this.f22250g = c10097aq2;
    }

    /* JADX INFO: renamed from: q */
    private final C10031db m22629q(int i) {
        Map map = this.f22247d;
        Integer numValueOf = Integer.valueOf(i);
        C10031db c10031db = (C10031db) map.get(numValueOf);
        if (c10031db != null) {
            return c10031db;
        }
        throw new C10013ck(String.format("Could not find session %d while trying to get it", numValueOf), i);
    }

    /* JADX INFO: renamed from: r */
    private final Object m22630r(InterfaceC10033dd interfaceC10033dd) {
        try {
            this.f22248e.lock();
            return interfaceC10033dd.mo22627a();
        } finally {
            this.f22248e.unlock();
        }
    }

    /* JADX INFO: renamed from: s */
    private static String m22631s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new C10013ck("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    /* JADX INFO: renamed from: t */
    private static List m22632t(List list) {
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: u */
    private final Map m22633u(final List list) {
        return (Map) m22630r(new InterfaceC10033dd() { // from class: com.google.android.play.core.assetpacks.cv
            @Override // com.google.android.play.core.assetpacks.InterfaceC10033dd
            /* JADX INFO: renamed from: a */
            public final Object mo22627a() {
                return this.f22219a.m22642i(list);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Boolean m22634a(Bundle bundle) {
        int i = bundle.getInt(SDKAnalyticsEvents.PARAMETER_SESSION_ID);
        if (i == 0) {
            return true;
        }
        Map map = this.f22247d;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return true;
        }
        C10031db c10031db = (C10031db) this.f22247d.get(numValueOf);
        if (c10031db.f22237c.f22232d == 6) {
            return false;
        }
        return Boolean.valueOf(!C9982bg.m22538c(c10031db.f22237c.f22232d, bundle.getInt(C10133b.m22790a("status", m22631s(bundle)))));
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Boolean m22635b(Bundle bundle) {
        boolean z;
        int i = bundle.getInt(SDKAnalyticsEvents.PARAMETER_SESSION_ID);
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        Map map = this.f22247d;
        Integer numValueOf = Integer.valueOf(i);
        boolean z3 = true;
        if (map.containsKey(numValueOf)) {
            C10031db c10031dbM22629q = m22629q(i);
            int i2 = bundle.getInt(C10133b.m22790a("status", c10031dbM22629q.f22237c.f22229a));
            C10030da c10030da = c10031dbM22629q.f22237c;
            int i3 = c10030da.f22232d;
            if (C9982bg.m22538c(i3, i2)) {
                f22244a.m22749a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(i3));
                C10030da c10030da2 = c10031dbM22629q.f22237c;
                int i4 = c10030da2.f22232d;
                String str = c10030da2.f22229a;
                if (i4 == 4) {
                    ((InterfaceC10145y) this.f22249f.mo22526a()).mo22523h(i, str);
                } else if (i4 == 5) {
                    ((InterfaceC10145y) this.f22249f.mo22526a()).mo22524i(i);
                } else if (i4 == 6) {
                    ((InterfaceC10145y) this.f22249f.mo22526a()).mo22520e(Arrays.asList(str));
                }
            } else {
                c10030da.f22232d = i2;
                if (C9982bg.m22539d(i2)) {
                    m22647n(i);
                    this.f22246c.m22625c(c10031dbM22629q.f22237c.f22229a);
                } else {
                    for (C10032dc c10032dc : c10030da.f22234f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C10133b.m22791b("chunk_intents", c10031dbM22629q.f22237c.f22229a, c10032dc.f22238a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    ((C10028cz) c10032dc.f22241d.get(i5)).f22227a = true;
                                }
                            }
                        }
                    }
                }
            }
            z = true;
        } else {
            String strM22631s = m22631s(bundle);
            long j = bundle.getLong(C10133b.m22790a("pack_version", strM22631s));
            String string = bundle.getString(C10133b.m22790a("pack_version_tag", strM22631s), "");
            int i6 = bundle.getInt(C10133b.m22790a("status", strM22631s));
            long j2 = bundle.getLong(C10133b.m22790a("total_bytes_to_download", strM22631s));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(C10133b.m22790a("slice_ids", strM22631s));
            ArrayList arrayList = new ArrayList();
            for (String str2 : m22632t(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C10133b.m22791b("chunk_intents", strM22631s, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = m22632t(parcelableArrayList2).iterator();
                while (it.hasNext()) {
                    if (((Intent) it.next()) == null) {
                        z3 = z2;
                    }
                    arrayList2.add(new C10028cz(z3));
                    z3 = z3;
                    z2 = false;
                }
                boolean z4 = z3;
                String string2 = bundle.getString(C10133b.m22791b("uncompressed_hash_sha256", strM22631s, str2));
                long j3 = bundle.getLong(C10133b.m22791b("uncompressed_size", strM22631s, str2));
                int i7 = bundle.getInt(C10133b.m22791b("patch_format", strM22631s, str2), 0);
                arrayList.add(i7 != 0 ? new C10032dc(str2, string2, j3, arrayList2, 0, i7) : new C10032dc(str2, string2, j3, arrayList2, bundle.getInt(C10133b.m22791b("compression_format", strM22631s, str2), 0), 0));
                z2 = false;
                z3 = z4;
            }
            z = z3;
            this.f22247d.put(Integer.valueOf(i), new C10031db(i, bundle.getInt("app_version_code"), new C10030da(strM22631s, j, i6, j2, arrayList, string)));
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object m22636c(String str, int i, long j) {
        C10031db c10031db = (C10031db) m22633u(Arrays.asList(str)).get(str);
        if (c10031db == null || C9982bg.m22539d(c10031db.f22237c.f22232d)) {
            f22244a.m22750b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f22245b.m22554E(str, i, j);
        c10031db.f22237c.f22232d = 4;
        return null;
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Object m22637d(int i, int i2) {
        m22629q(i).f22237c.f22232d = 5;
        return null;
    }

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Object m22638e(int i) {
        C10031db c10031dbM22629q = m22629q(i);
        C10030da c10030da = c10031dbM22629q.f22237c;
        if (!C9982bg.m22539d(c10030da.f22232d)) {
            throw new C10013ck(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        this.f22245b.m22554E(c10030da.f22229a, c10031dbM22629q.f22236b, c10030da.f22230b);
        C10030da c10030da2 = c10031dbM22629q.f22237c;
        int i2 = c10030da2.f22232d;
        if (i2 != 5 && i2 != 6) {
            return null;
        }
        this.f22245b.m22555F(c10030da2.f22229a, c10031dbM22629q.f22236b, c10030da2.f22230b);
        return null;
    }

    /* JADX INFO: renamed from: f */
    final Map m22639f(final List list) {
        return (Map) m22630r(new InterfaceC10033dd() { // from class: com.google.android.play.core.assetpacks.cu
            @Override // com.google.android.play.core.assetpacks.InterfaceC10033dd
            /* JADX INFO: renamed from: a */
            public final Object mo22627a() {
                return this.f22217a.m22641h(list);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    final Map m22640g() {
        return this.f22247d;
    }

    /* JADX INFO: renamed from: h */
    final /* synthetic */ Map m22641h(List list) {
        Map mapM22633u = m22633u(list);
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            final C10031db c10031db = (C10031db) mapM22633u.get(str);
            if (c10031db == null) {
                map.put(str, 8);
            } else {
                C10030da c10030da = c10031db.f22237c;
                if (C9982bg.m22536a(c10030da.f22232d)) {
                    try {
                        c10030da.f22232d = 6;
                        ((Executor) this.f22250g.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.cx
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f22223a.m22647n(c10031db.f22235a);
                            }
                        });
                        this.f22246c.m22625c(str);
                    } catch (C10013ck unused) {
                        f22244a.m22752d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(c10031db.f22235a), str);
                    }
                }
                map.put(str, Integer.valueOf(c10031db.f22237c.f22232d));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    final /* synthetic */ Map m22642i(List list) {
        HashMap map = new HashMap();
        for (C10031db c10031db : this.f22247d.values()) {
            String str = c10031db.f22237c.f22229a;
            if (list.contains(str)) {
                C10031db c10031db2 = (C10031db) map.get(str);
                if ((c10031db2 == null ? -1 : c10031db2.f22235a) < c10031db.f22235a) {
                    map.put(str, c10031db);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: j */
    final void m22643j() {
        this.f22248e.lock();
    }

    /* JADX INFO: renamed from: k */
    final void m22644k(final String str, final int i, final long j) {
        m22630r(new InterfaceC10033dd() { // from class: com.google.android.play.core.assetpacks.cs
            @Override // com.google.android.play.core.assetpacks.InterfaceC10033dd
            /* JADX INFO: renamed from: a */
            public final Object mo22627a() {
                this.f22211a.m22636c(str, i, j);
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: l */
    final void m22645l() {
        this.f22248e.unlock();
    }

    /* JADX INFO: renamed from: m */
    final void m22646m(final int i, int i2) {
        final int i3 = 5;
        m22630r(new InterfaceC10033dd(i, i3) { // from class: com.google.android.play.core.assetpacks.ct

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f22216b;

            @Override // com.google.android.play.core.assetpacks.InterfaceC10033dd
            /* JADX INFO: renamed from: a */
            public final Object mo22627a() {
                this.f22215a.m22637d(this.f22216b, 5);
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: n */
    final void m22647n(final int i) {
        m22630r(new InterfaceC10033dd() { // from class: com.google.android.play.core.assetpacks.cr
            @Override // com.google.android.play.core.assetpacks.InterfaceC10033dd
            /* JADX INFO: renamed from: a */
            public final Object mo22627a() {
                this.f22209a.m22638e(i);
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: o */
    final boolean m22648o(final Bundle bundle) {
        return ((Boolean) m22630r(new InterfaceC10033dd() { // from class: com.google.android.play.core.assetpacks.cy
            @Override // com.google.android.play.core.assetpacks.InterfaceC10033dd
            /* JADX INFO: renamed from: a */
            public final Object mo22627a() {
                return this.f22225a.m22634a(bundle);
            }
        })).booleanValue();
    }

    /* JADX INFO: renamed from: p */
    final boolean m22649p(final Bundle bundle) {
        return ((Boolean) m22630r(new InterfaceC10033dd() { // from class: com.google.android.play.core.assetpacks.cw
            @Override // com.google.android.play.core.assetpacks.InterfaceC10033dd
            /* JADX INFO: renamed from: a */
            public final Object mo22627a() {
                return this.f22221a.m22635b(bundle);
            }
        })).booleanValue();
    }
}
