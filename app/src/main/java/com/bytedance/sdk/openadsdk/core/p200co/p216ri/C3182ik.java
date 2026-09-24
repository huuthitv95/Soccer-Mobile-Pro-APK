package com.bytedance.sdk.openadsdk.core.p200co.p216ri;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.tan.p264lr.C3536ri;
import com.bytedance.sdk.openadsdk.tan.p265ri.C3538ri;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3182ik {

    /* JADX INFO: renamed from: lr */
    private static volatile C3182ik f10536lr = null;

    /* JADX INFO: renamed from: ri */
    public static int f10537ri = 20;

    /* JADX INFO: renamed from: ik */
    private final Object f10538ik = new Object();

    /* JADX INFO: renamed from: ka */
    private final LruCache<String, C3184ri> f10539ka = new LruCache<String, C3184ri>(f10537ri) { // from class: com.bytedance.sdk.openadsdk.core.co.ri.ik.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, C3184ri c3184ri) {
            return 1;
        }
    };

    private C3182ik() {
    }

    /* JADX INFO: renamed from: ik */
    public static String m13289ik() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    /* JADX INFO: renamed from: ka */
    public static String m13290ka() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    /* JADX INFO: renamed from: lr */
    private void m13291lr(String str) {
        if (!TextUtils.isEmpty(str) && this.f10539ka.size() > 0) {
            synchronized (this.f10538ik) {
                this.f10539ka.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3182ik m13292ri() {
        if (f10536lr == null) {
            synchronized (C3182ik.class) {
                if (f10536lr == null) {
                    f10536lr = new C3182ik();
                }
            }
        }
        return f10536lr;
    }

    /* JADX INFO: renamed from: lr */
    List<C3184ri> m13293lr() {
        ArrayList arrayList = new ArrayList();
        C3538ri c3538ri = new C3538ri(C3536ri.m16084ri(C3299nr.m14642ri(), "ugen_template", null, null, null, null, null, null));
        try {
            if (c3538ri.moveToFirst()) {
                do {
                    int columnIndex = c3538ri.getColumnIndex("id");
                    int columnIndex2 = c3538ri.getColumnIndex("md5");
                    int columnIndex3 = c3538ri.getColumnIndex("url");
                    int columnIndex4 = c3538ri.getColumnIndex("data");
                    int columnIndex5 = c3538ri.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = c3538ri.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? c3538ri.getString(columnIndex6) : null;
                        String string2 = c3538ri.getString(columnIndex);
                        String string3 = c3538ri.getString(columnIndex2);
                        String string4 = c3538ri.getString(columnIndex3);
                        C3184ri c3184riM13322ri = new C3184ri().m13323ri(string2).m13320lr(string3).m13316ik(string4).m13318ka(c3538ri.getString(columnIndex4)).m13314fi(string).m13322ri(Long.valueOf(c3538ri.getLong(columnIndex5)));
                        arrayList.add(c3184riM13322ri);
                        synchronized (this.f10538ik) {
                            this.f10539ka.put(string2, c3184riM13322ri);
                        }
                    }
                } while (c3538ri.moveToNext());
            }
            c3538ri.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                C2707ac.m10206ri("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                c3538ri.close();
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    C3184ri m13294ri(String str, String str2) {
        C3184ri c3184ri;
        C3184ri c3184riM13322ri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f10538ik) {
            c3184ri = this.f10539ka.get(str);
        }
        if (c3184ri != null) {
            if (TextUtils.equals(str2, c3184ri.m13321lr())) {
                return c3184ri;
            }
            m13291lr(str2);
            return null;
        }
        C3538ri c3538ri = new C3538ri(C3536ri.m16084ri(C3299nr.m14642ri(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (c3538ri.moveToFirst()) {
                do {
                    int columnIndex = c3538ri.getColumnIndex("id");
                    int columnIndex2 = c3538ri.getColumnIndex("md5");
                    int columnIndex3 = c3538ri.getColumnIndex("url");
                    int columnIndex4 = c3538ri.getColumnIndex("data");
                    int columnIndex5 = c3538ri.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = c3538ri.getColumnIndex("rit");
                        String string = c3538ri.getString(columnIndex);
                        String string2 = c3538ri.getString(columnIndex2);
                        String string3 = c3538ri.getString(columnIndex3);
                        String string4 = c3538ri.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            c3538ri.close();
                            return null;
                        }
                        c3184riM13322ri = new C3184ri().m13323ri(string).m13320lr(string2).m13318ka(string4).m13316ik(string3).m13314fi(columnIndex6 != -1 ? c3538ri.getString(columnIndex6) : null).m13322ri(Long.valueOf(c3538ri.getLong(columnIndex5)));
                        synchronized (this.f10538ik) {
                            this.f10539ka.put(string, c3184riM13322ri);
                        }
                    }
                    c3538ri.close();
                    return null;
                } while (c3538ri.moveToNext());
                c3538ri.close();
                return c3184riM13322ri;
            }
        } catch (Throwable th) {
            try {
                C2707ac.m10206ri("UGTmplDbHelper", "getGgenTemplate error", th);
            } finally {
                c3538ri.close();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    Set<C3184ri> m13295ri(String str) {
        C3184ri c3184ri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        C3538ri c3538ri = new C3538ri(C3536ri.m16084ri(C3299nr.m14642ri(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (c3538ri.moveToFirst()) {
                do {
                    int columnIndex = c3538ri.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = c3538ri.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.f10538ik) {
                                c3184ri = this.f10539ka.get(string);
                            }
                            if (c3184ri != null) {
                                hashSet.add(c3184ri);
                            } else {
                                C3184ri c3184ri2 = new C3184ri();
                                int columnIndex2 = c3538ri.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = c3538ri.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        c3184ri2.m13318ka(string2);
                                        c3184ri2.m13323ri(string);
                                        c3184ri2.m13314fi(str);
                                        int columnIndex3 = c3538ri.getColumnIndex("md5");
                                        int columnIndex4 = c3538ri.getColumnIndex("url");
                                        int columnIndex5 = c3538ri.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            c3184ri2.m13320lr(c3538ri.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            c3184ri2.m13316ik(c3538ri.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            c3184ri2.m13322ri(Long.valueOf(c3538ri.getLong(columnIndex5)));
                                        }
                                        hashSet.add(c3184ri2);
                                        synchronized (this.f10538ik) {
                                            this.f10539ka.put(string, c3184ri2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (c3538ri.moveToNext());
            }
            c3538ri.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                C2707ac.m10206ri("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                c3538ri.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ri */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m13296ri(com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3184ri r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            goto La5
        L4:
            java.lang.String r0 = r10.m13324ri()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            goto La5
        L10:
            com.bytedance.sdk.openadsdk.tan.ri.ri r0 = new com.bytedance.sdk.openadsdk.tan.ri.ri
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3299nr.m14642ri()
            java.lang.String r2 = "ugen_template"
            java.lang.String r4 = "id=?"
            java.lang.String r3 = r10.m13324ri()
            java.lang.String[] r5 = new java.lang.String[]{r3}
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            java.util.Map r1 = com.bytedance.sdk.openadsdk.tan.p264lr.C3536ri.m16084ri(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r1)
            int r1 = r0.getCount()
            if (r1 <= 0) goto L35
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            r0.close()     // Catch: java.lang.Throwable -> La5
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "id"
            java.lang.String r3 = r10.m13324ri()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "md5"
            java.lang.String r3 = r10.m13321lr()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "url"
            java.lang.String r3 = r10.m13317ik()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "data"
            java.lang.String r3 = r10.m13315fi()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "rit"
            java.lang.String r3 = r10.m13313di()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "update_time"
            java.lang.Long r3 = r10.m13319ka()     // Catch: java.lang.Throwable -> La5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L8a
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3299nr.m14642ri()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "ugen_template"
            java.lang.String r3 = "id=?"
            java.lang.String r4 = r10.m13324ri()     // Catch: java.lang.Throwable -> La5
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> La5
            com.bytedance.sdk.openadsdk.tan.p264lr.C3536ri.m16081ri(r1, r2, r0, r3, r4)     // Catch: java.lang.Throwable -> La5
            goto L93
        L8a:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3299nr.m14642ri()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "ugen_template"
            com.bytedance.sdk.openadsdk.tan.p264lr.C3536ri.m16086ri(r1, r2, r0)     // Catch: java.lang.Throwable -> La5
        L93:
            java.lang.Object r1 = r9.f10538ik     // Catch: java.lang.Throwable -> La5
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La5
            android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.co.ri.ri> r0 = r9.f10539ka     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = r10.m13324ri()     // Catch: java.lang.Throwable -> La1
            r0.put(r2, r10)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La1
            return
        La1:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La5
            throw r10     // Catch: java.lang.Throwable -> La5
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3182ik.m13296ri(com.bytedance.sdk.openadsdk.core.co.ri.ri):void");
    }

    /* JADX INFO: renamed from: ri */
    void m13297ri(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                m13291lr(str);
                C3536ri.m16082ri(C3299nr.m14642ri(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
